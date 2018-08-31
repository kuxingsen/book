package javase.chap07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kuexun on 2018/5/2.
 */
public class CardLayoutTest extends JFrame {
    JPanel p_cards = new JPanel();
    JPanel p_buttons = new JPanel();
    public CardLayoutTest()
    {
        super("CardLayout 测试");
        setSize(400,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final CardLayout c1 = new CardLayout();
        p_cards.setLayout(c1);
        p_cards.add(new JButton("第一张卡片"));
        p_cards.add(new JButton("第二张卡片"));
        p_cards.add(new JButton("第三张卡片"));
        p_cards.add(new JButton("第四张卡片"));
        p_cards.add(new JButton("第五张卡片"));
        add(p_cards,BorderLayout.CENTER);
        add(p_buttons,BorderLayout.SOUTH);
        JButton first = new JButton("第一张");
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.first(p_cards);
            }
        });
        p_buttons.add(first);

        JButton prev = new JButton("上一张");
        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.previous(p_cards);
            }
        });
        p_buttons.add(prev);

        JButton next = new JButton("下一张");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.next(p_cards);
            }
        });
        p_buttons.add(next);

        JButton last = new JButton("最后一张");
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.last(p_cards);
            }
        });
        p_buttons.add(last);

        setVisible(true);
    }

    public static void main(String[] args) {
        CardLayoutTest c = new CardLayoutTest();
    }
}
