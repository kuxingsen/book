package javase.chap08.countTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyLabel extends JLabel implements Runnable{
    private boolean action=false;//��Ǽ�ʱ�Ƿ�ʼ//��������ֹͣ״̬
    private boolean active=true;//��Ǽ�ʱ��ʱ���״̬//����ͣ������״̬

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public MyLabel(String text) {
        super(text);
    }
    public void run()
    {
        for (int h = 0; h < 60 ; h++) {
            for(int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    this.setText(h+"ʱ"+m+"��"+s+"��");
                    try {
                        Thread.sleep(1000);
                        synchronized (this){
                            while (!isActive())
                            {
                                this.wait();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class CountTimer extends JFrame implements Mediator {

    private MyButton begin;
    private MyButton pause ;
    private MyButton contiue;
    private MyButton clear;
    private JPanel jp_top;


    private MyLabel countTimer;
    private Thread countTimerThread;
    private CountTimer()
    {
        super("��ʱ��");
        init();
    }
    private void init() {
        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createColleagues();


        countTimer = new MyLabel("0ʱ0��0��");
        add(countTimer,BorderLayout.CENTER);
        countTimerThread = new Thread(countTimer,"countTimerThread");

        jp_top = new JPanel();
        //Ϊ ��ʼ ��ť���Ӽ�����
        begin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimer.setAction(true);//���ü�ʱ��Ϊ����״̬
                countTimerThread.start();//������ʱ�����߳�
                begin.getMediator().colleaguesChange();//�����ĸ���ť�Ŀɵ��״̬
            }
        });
        jp_top.add(begin);
        //Ϊ ��ͣ ��ť���Ӽ�����
        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimer.setActive(false);//���ü�ʱ��Ϊ��ͣ״̬
                pause.getMediator().colleaguesChange();//�����ĸ���ť�Ŀɵ��״̬
            }
        });
        jp_top.add(pause);
        //Ϊ ���� ��ť���Ӽ�����
        contiue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimer.setActive(true);
                synchronized (countTimer)
                {
                    countTimer.notify();//���Ѽ�ʱ��
                }
                contiue.getMediator().colleaguesChange();//�����ĸ���ť�Ŀɵ��״̬
            }
        });
        jp_top.add(contiue);
        //Ϊ ��� ��ť���Ӽ�����
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimerThread.stop();//�����õ�stop()��������������//ֹͣһ���߳�
                countTimer.setAction(false);
                countTimer.setActive(true);
                countTimer.setText("0ʱ0��0��");
                clear.getMediator().colleaguesChange();//�����ĸ���ť�Ŀɵ��״̬
                countTimerThread = new Thread(countTimer,"countTimerThread");//�½�һ���߳�
            }
        });
        jp_top.add(clear);

        add(jp_top,BorderLayout.NORTH);
        colleaguesChange();//�趨��ʼ״̬

        setVisible(true);
    }

        @Override
    public void createColleagues() {
        begin = new MyButton("��ʼ");
        pause = new MyButton("��ͣ");
        contiue = new MyButton("����");
        clear = new MyButton("����");

        begin.setMediator(this);
        pause.setMediator(this);
        contiue.setMediator(this);
        clear.setMediator(this);

    }

    @Override
    public void colleaguesChange() {
        if(countTimer.isAction()) {
            begin.setColleagueEnabled(false);
            clear.setColleagueEnabled(true);
            if(countTimer.isActive()) {
                pause.setColleagueEnabled(true);
                contiue.setColleagueEnabled(false);
            }else {
                pause.setColleagueEnabled(false);
                contiue.setColleagueEnabled(true);
            }
        }else {
            begin.setColleagueEnabled(true);
            pause.setColleagueEnabled(false);
            contiue.setColleagueEnabled(false);
            clear.setColleagueEnabled(false);
        }
    }


    public static void main(String[] args) {
        new CountTimer();
    }
}
