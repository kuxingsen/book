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
        super("CardLayout ����");
        setSize(400,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final CardLayout c1 = new CardLayout();
        p_cards.setLayout(c1);
        p_cards.add(new JButton("��һ�ſ�Ƭ"));
        p_cards.add(new JButton("�ڶ��ſ�Ƭ"));
        p_cards.add(new JButton("�����ſ�Ƭ"));
        p_cards.add(new JButton("�����ſ�Ƭ"));
        p_cards.add(new JButton("�����ſ�Ƭ"));
        add(p_cards,BorderLayout.CENTER);
        add(p_buttons,BorderLayout.SOUTH);
        JButton first = new JButton("��һ��");
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.first(p_cards);
            }
        });
        p_buttons.add(first);

        JButton prev = new JButton("��һ��");
        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.previous(p_cards);
            }
        });
        p_buttons.add(prev);

        JButton next = new JButton("��һ��");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.next(p_cards);
            }
        });
        p_buttons.add(next);

        JButton last = new JButton("���һ��");
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
