package javase.chap08.countTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyLabel extends JLabel implements Runnable{
    private boolean action=false;//标记计时是否开始//即开启或停止状态
    private boolean active=true;//标记计时器时间的状态//即暂停或跳动状态

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
                    this.setText(h+"时"+m+"分"+s+"秒");
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
        super("计时器");
        init();
    }
    private void init() {
        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createColleagues();


        countTimer = new MyLabel("0时0分0秒");
        add(countTimer,BorderLayout.CENTER);
        countTimerThread = new Thread(countTimer,"countTimerThread");

        jp_top = new JPanel();
        //为 开始 按钮增加监听器
        begin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimer.setAction(true);//设置计时器为启动状态
                countTimerThread.start();//开启计时器的线程
                begin.getMediator().colleaguesChange();//更改四个按钮的可点击状态
            }
        });
        jp_top.add(begin);
        //为 暂停 按钮增加监听器
        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimer.setActive(false);//设置计时器为暂停状态
                pause.getMediator().colleaguesChange();//更改四个按钮的可点击状态
            }
        });
        jp_top.add(pause);
        //为 继续 按钮增加监听器
        contiue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimer.setActive(true);
                synchronized (countTimer)
                {
                    countTimer.notify();//唤醒计时器
                }
                contiue.getMediator().colleaguesChange();//更改四个按钮的可点击状态
            }
        });
        jp_top.add(contiue);
        //为 清除 按钮增加监听器
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countTimerThread.stop();//被弃用的stop()方法，但可以用//停止一个线程
                countTimer.setAction(false);
                countTimer.setActive(true);
                countTimer.setText("0时0分0秒");
                clear.getMediator().colleaguesChange();//更改四个按钮的可点击状态
                countTimerThread = new Thread(countTimer,"countTimerThread");//新建一个线程
            }
        });
        jp_top.add(clear);

        add(jp_top,BorderLayout.NORTH);
        colleaguesChange();//设定初始状态

        setVisible(true);
    }

        @Override
    public void createColleagues() {
        begin = new MyButton("开始");
        pause = new MyButton("暂停");
        contiue = new MyButton("继续");
        clear = new MyButton("清零");

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
