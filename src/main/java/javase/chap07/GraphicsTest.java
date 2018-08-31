package javase.chap07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Kuexun on 2018/5/2.
 */
public class GraphicsTest extends Frame{

    public GraphicsTest()
    {
        super("Graphics ªÊÕº≤‚ ‘");
        setSize(480,460);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        Font font = new Font("∫⁄ÃÂ", Font.BOLD,24);
        g.setFont(font);
        g.drawString("GraphicsªÊÕº≤‚ ‘", 120, 60);
        g.drawLine(50, 80, 430, 80);
        g.draw3DRect(50, 260, 380, 140, true);
        g.drawArc(200, 120, 100, 100, 0, 270);
        g.fillRoundRect(50, 260, 380, 140, 20, 10);
    }
    public static void main(String[] args) {
        GraphicsTest g = new GraphicsTest();
    }

}
