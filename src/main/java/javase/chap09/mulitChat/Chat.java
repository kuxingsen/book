package javase.chap09.mulitChat;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuexun on 2018/6/2.
 */
public class Chat extends JFrame{
    //客户端宽、高
    private static final int windowWidth = 600;
    private static final int windowHeight = 550;
    //文本域
    private JTextArea tipText;
    private JTextArea userText;
    private JTextArea msgText;
    private JTextArea inputText;
    //按钮
    private JButton sendButton;
    private JButton clearButton;



    public Chat(String title) {
        super(title);
        //初始化窗口
        setSize(windowWidth, windowHeight);
        setLocation(100, 100);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void setVisible(boolean b) {

        //设置布局
        //设置连接端口
        JPanel topPanel = new JPanel();

        topPanel.setPreferredSize(new Dimension(windowWidth, 50));
        topPanel.add(tipText);

        //设置好友和聊天记录面板
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setPreferredSize(new Dimension(windowWidth, 350));
        //设置好友列表
        JScrollPane usersBar = new JScrollPane(userText);
        usersBar.setPreferredSize(new Dimension(150, 340));
        JPanel usersPanel = new JPanel();
        usersPanel.setLayout(new FlowLayout());
        usersPanel.add(usersBar);
        //设置聊天记录
        JScrollPane msgBar = new JScrollPane(msgText);
        msgBar.setPreferredSize(new Dimension(windowWidth - 180, 340));
        JPanel msgPanel = new JPanel();
        msgPanel.add(msgBar);
        //添加
        centerPanel.add(usersPanel, BorderLayout.WEST);
        centerPanel.add(msgPanel, BorderLayout.EAST);

        //设置输入区
        JPanel bottonPanel = new JPanel();
        bottonPanel.setPreferredSize(new Dimension(windowWidth, 100));
        bottonPanel.add(inputText, BorderLayout.WEST);
        //设置发送按钮和清空按钮
        JPanel botton = new JPanel();
        botton.setPreferredSize(new Dimension(50, 100));
        botton.add(sendButton, BorderLayout.NORTH);
        botton.add(clearButton, BorderLayout.SOUTH);

        bottonPanel.add(botton,BorderLayout.EAST);

        //将所有面板添加进总面板
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
