package javase.chap07;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuexun on 2018/5/2.
 */
public class GridLayoutTest extends JFrame {
    public GridLayoutTest()
    {
        super("GridLayout ≤‚ ‘");
        setSize(300,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
        for (int i = 0;i < 6 ; i++) {
            add(new JButton("∞¥≈•"+i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutTest g = new GridLayoutTest();
    }
}
