package javase.chap09.mulitChat;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Kuexun on 2018/6/2.
 */
public class ChatClient implements Runnable {

    private Chat chat;
    private Socket socket;
    private String ip;
    private String port;
    //文本域
    private JTextArea tipText;
    private JTextArea userText;
    private JTextArea msgText;
    private JTextArea inputText;
    //按钮
    private JButton sendButton;
    private JButton clearButton;

    private PrintWriter pw_s = null;
    private Scanner sc_s = null;


    public ChatClient(Socket socket) throws IOException {
        this.socket = socket;
        ip = socket.getInetAddress().getHostAddress();
        port = String.valueOf(socket.getLocalPort());
        init();
    }

    private void init() throws IOException {
        chat = new Chat("聊天室客户端");

        pw_s = new PrintWriter(socket.getOutputStream());
        sc_s = new Scanner(socket.getInputStream());

        tipText = new JTextArea();
        tipText.setPreferredSize(new Dimension(590, 20));
        tipText.setEditable(false);
        tipText.setText(ip+":"+port);

        userText = new JTextArea();
        userText.setEditable(false);

        msgText = new JTextArea();
        msgText.setEditable(false);

        inputText = new JTextArea();
        inputText.setPreferredSize(new Dimension(500, 100));

        sendButton = new JButton("发送");
        clearButton = new JButton("清空");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                pw_s.println(input);
                pw_s.flush();

                inputText.setText("");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputText.setText("");
            }
        });


        chat.setTipText(tipText);
        chat.setUserText(userText);
        chat.setInputText(inputText);
        chat.setMsgText(msgText);
        chat.setSendButton(sendButton);
        chat.setClearButton(clearButton);

        chat.setVisible(true);
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                Scanner sc_s = new Scanner(socket.getInputStream());
                while(true)
                {
                    String ss = sc_s.nextLine();
                    Gson gson = new Gson();
                    MSG msg = gson.fromJson(ss,MSG.class);
                    if(!msg.getFriend().equals(""))
                        userText.setText(msg.getFriend());
                    msgText.append(msg.getMsg());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return ip + ':' +port;
    }

    public static void main(String[] args) {

        Socket socket = null;
        try {
            socket = new Socket("172.18.44.69",10002);
            new Thread(new ChatClient(socket)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
