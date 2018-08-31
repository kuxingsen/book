package javase.chap09.mulitChat;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kuexun on 2018/6/2.
 */
class ChatReader implements Runnable{

    private Socket socket;
    private List<Socket> sockets;
    private String friends;


    public ChatReader(Socket socket,List<Socket> sockets,String friends) {
        this.socket = socket;
        this.sockets = sockets;
        this.friends = friends;
    }

    @Override
    public void run() {
        try {
            Scanner sc_s = new Scanner(socket.getInputStream());
            MSG msg = new MSG();
            msg.setFriend(friends);
            msg.setMsg("");
            sendToAll(msg);
            msg.setFriend("");
            while(true)
            {
                String ip = socket.getInetAddress().getHostAddress();
                String port = String.valueOf(socket.getPort());
                String ss = sc_s.nextLine();
                msg.setMsg(ip+":"+port+"::"+ss+"\n");
                sendToAll(msg);
                if("exit".equals(ss)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendToAll(MSG msg)
    {
        Gson gson = new Gson();
        String ss = gson.toJson(msg);
        PrintStream ps = null;
        for (Socket s : sockets) {
            try {
                ps = new PrintStream(s.getOutputStream());
                ps.println(ss);
                ps.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ChatServer extends JFrame {

    //服务端宽、高
    private static final int windowWidth = 600;
    private static final int windowHeight = 550;
    //
    private ServerSocket serverSocket;
    private String chatText;

    private JTextArea msgText;

    private List<Socket> sockets;


    public ChatServer(String title, ServerSocket serverSocket) {
        super(title);
        chatText="";
        this.serverSocket = serverSocket;
        sockets = new ArrayList<>();
        init();
    }

    private void init() {
        //初始化窗口
        setSize(windowWidth, windowHeight);
        setLocation(100, 100);
        setLocationRelativeTo(null);
        setResizable(false);

        msgText = new JTextArea();
        msgText.setEditable(false);
        JScrollPane msgBar = new JScrollPane(msgText);
        msgBar.setPreferredSize(new Dimension(windowWidth - 180, 340));
        JPanel msgPanel = new JPanel();
        msgPanel.add(msgBar);

        add(msgBar, BorderLayout.CENTER);
        setVisible(true);
    }
    public void startMultiThread() throws IOException {
        while (true)
        {
            Socket socket = serverSocket.accept();
            String ip = socket.getInetAddress().getHostAddress();
            int port = socket.getPort();
            chatText += ip + ":" + port + "\n";
            msgText.setText(chatText);
            sockets.add(socket);
            //System.out.println(sockets.size());
            (new Thread(new ChatReader(socket,sockets,chatText))).start();
        }
    }
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(10002);
            ChatServer chatServer = new ChatServer("聊天室服务端",serverSocket);
            chatServer.startMultiThread();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
