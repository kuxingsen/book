package javase.chap07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Kuexun on 2018/5/2.
 */
public class MultiListener extends JFrame implements MouseMotionListener,ActionListener {
    private JTextField jtf = new JTextField(30);
    private JButton j1_message = new JButton("������ڱ������ƶ����������϶����");
    int count = 0;
    public MultiListener()
    {
        super("Java�¼�������Ʋ���");
        init();
    }

    private void init() {
        //JframeĬ��BorderLayout
        add(j1_message,"Center");
        jtf.setFont(new Font("����",Font.BOLD,15));
        jtf.setForeground(Color.RED);
        add(jtf,"South");
        //�������ڲ���ʵ�ּ�����
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jtf.setText("�������ı���");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jtf.setText("����뿪�ı���");
            }
        });
        //���ı�������ΪMouseMotion��Action�¼��ļ�����
        j1_message.addMouseMotionListener(this);
        j1_message.addActionListener(this);
        setSize(480,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        jtf.setText("���ڵ�����꣬�ѵ���"+count+"��");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //ͨ���¼��������ϸ��Ϣ
        jtf.setText("�����϶���꣺X="+e.getX()+"Y="+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jtf.setText("�����ƶ���꣺X="+e.getX()+"Y="+e.getY());
    }

    public static void main(String[] args) {
        MultiListener m = new MultiListener();
    }
}
