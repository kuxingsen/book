package javase.chap09.mulitChat;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuexun on 2018/6/2.
 */
public class Chat extends JFrame{
    //�ͻ��˿���
    private static final int windowWidth = 600;
    private static final int windowHeight = 550;
    //�ı���
    private JTextArea tipText;
    private JTextArea userText;
    private JTextArea msgText;
    private JTextArea inputText;
    //��ť
    private JButton sendButton;
    private JButton clearButton;



    public Chat(String title) {
        super(title);
        //��ʼ������
        setSize(windowWidth, windowHeight);
        setLocation(100, 100);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void setVisible(boolean b) {

        //���ò���
        //�������Ӷ˿�
        JPanel topPanel = new JPanel();

        topPanel.setPreferredSize(new Dimension(windowWidth, 50));
        topPanel.add(tipText);

        //���ú��Ѻ������¼���
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setPreferredSize(new Dimension(windowWidth, 350));
        //���ú����б�
        JScrollPane usersBar = new JScrollPane(userText);
        usersBar.setPreferredSize(new Dimension(150, 340));
        JPanel usersPanel = new JPanel();
        usersPanel.setLayout(new FlowLayout());
        usersPanel.add(usersBar);
        //���������¼
        JScrollPane msgBar = new JScrollPane(msgText);
        msgBar.setPreferredSize(new Dimension(windowWidth - 180, 340));
        JPanel msgPanel = new JPanel();
        msgPanel.add(msgBar);
        //���
        centerPanel.add(usersPanel, BorderLayout.WEST);
        centerPanel.add(msgPanel, BorderLayout.EAST);

        //����������
        JPanel bottonPanel = new JPanel();
        bottonPanel.setPreferredSize(new Dimension(windowWidth, 100));
        bottonPanel.add(inputText, BorderLayout.WEST);
        //���÷��Ͱ�ť����հ�ť
        JPanel botton = new JPanel();
        botton.setPreferredSize(new Dimension(50, 100));
        botton.add(sendButton, BorderLayout.NORTH);
        botton.add(clearButton, BorderLayout.SOUTH);

        bottonPanel.add(botton,BorderLayout.EAST);

        //�����������ӽ������
        JPanel jPanel = new JPanel();
        jPanel.add(topPanel, BorderLayout.NORTH);
        jPanel.add(centerPanel, BorderLayout.CENTER);
        jPanel.add(bottonPanel, BorderLayout.SOUTH);
        add(jPanel);

        super.setVisible(b);
    }
    public JTextArea getTipText() {
        return tipText;
    }


    public void setTipText(JTextArea tipText) {
        this.tipText = tipText;
    }


    public JTextArea getUserText() {
        return userText;
    }


    public void setUserText(JTextArea userText) {
        this.userText = userText;
    }


    public JTextArea getMsgText() {
        return msgText;
    }


    public void setMsgText(JTextArea msgText) {
        this.msgText = msgText;
    }


    public JTextArea getInputText() {
        return inputText;
    }


    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }


    public JButton getSendButton() {
        return sendButton;
    }


    public void setSendButton(JButton sendButton) {
        this.sendButton = sendButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }
/*
    public void showUserMsg(List<User> users) {
        String userMsg = "";
        for(int i=0 ; i<users.size() ; i++) {
            userMsg += users.get(i).getIp() + ":" + users.get(i).getPort() + "\n";
        }
        userText.setText(userMsg);
    }

*/
}
