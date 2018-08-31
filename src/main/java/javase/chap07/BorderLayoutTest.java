package javase.chap07;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuexun on 2018/5/2.
 */
public class BorderLayoutTest extends JFrame{
    public BorderLayoutTest()
    {
        super("BrodLayout≤‚ ‘...");
        setSize(300,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5,5));
        add("North",new JButton("North"));
        add("South",new JButton("South"));
        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("West"),BorderLayout.WEST);
        add("Center",new JButton("Center"));
        setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayoutTest borderLayoutTest = new BorderLayoutTest();
    }
}
