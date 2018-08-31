package javase.chap07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Kuexun on 2018/5/2.
 */
public class MultiListener extends JFrame implements MouseMotionListener,ActionListener {
    private JTextField jtf = new JTextField(30);
    private JButton j1_message = new JButton("你可以在本区域移动、单击、拖动鼠标");
    int count = 0;
    public MultiListener()
    {
        super("Java事件处理机制测试");
        init();
    }

    private void init() {
        //Jframe默认BorderLayout
        add(j1_message,"Center");
        jtf.setFont(new Font("黑体",Font.BOLD,15));
        jtf.setForeground(Color.RED);
        add(jtf,"South");
        //用匿名内部类实现监听器
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jtf.setText("鼠标进入文本框");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jtf.setText("鼠标离开文本框");
            }
        });
        //用文本对象作为MouseMotion和Action事件的监听器
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
        jtf.setText("你在单击鼠标，已单击"+count+"次");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //通过事件获得其详细信息
        jtf.setText("你在拖动鼠标：X="+e.getX()+"Y="+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jtf.setText("你在移动鼠标：X="+e.getX()+"Y="+e.getY());
    }

    public static void main(String[] args) {
        MultiListener m = new MultiListener();
    }
}
