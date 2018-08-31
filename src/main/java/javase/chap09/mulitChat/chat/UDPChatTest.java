package javase.chap09.mulitChat.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPChatTest{

	private Send send;
	private Rece rece;
	private Chat chat;

	private JTextArea tipText;
	private JTextArea userText;

	public UDPChatTest(Chat chat) throws HeadlessException {
		this.chat = chat;
		init();
	}

	private void init() {
		//发送端的socket 接收端的socket
		DatagramSocket sendSocket = null;
		DatagramSocket receSocket = null;
		try {
			sendSocket = new DatagramSocket();
			receSocket = new DatagramSocket(10002);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		//创建任务对象。
		send = new Send(sendSocket);
		rece = new Rece(receSocket);

		chat.setInputText(send);
		chat.setMsgText(rece);

		JButton sendButton = new JButton("发送");
		JButton clearButton = new JButton("清空");

		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                try {
                    String text = send.getText();
                    BufferedReader bufr = new BufferedReader(new InputStreamReader(getStringStream(text)));
                    String line = null;
                    while ((line = bufr.readLine()) != null) {
                        byte[] buf = line.getBytes();// 将数据转成字节数组。
                        DatagramPacket dp = new DatagramPacket(buf, buf.length,
                                InetAddress.getByName("172.18.44.69"), 10002);
                        send.ds.send(dp);
                        send.setText("");
                        if ("886".equals(line)) {
                            break;
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
			}
		});
		clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                send.setText("");
            }
        });

		tipText = new JTextArea();


		chat.setInputText(send);
		chat.setMsgText(rece);
		chat.setSendButton(sendButton);
		chat.setClearButton(clearButton);





		chat.setVisible(true);

		new Thread(rece).start();
	}

    public static InputStream getStringStream(String sInputString){
        if (sInputString != null && !sInputString.trim().equals("")){
           try{
               ByteArrayInputStream tInputStringStream = new ByteArrayInputStream(sInputString.getBytes());
               return tInputStringStream;
           }catch (Exception ex){
                ex.printStackTrace();
           }
        }
        return null;
    }
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*
		 * 案例一：通过udp实现群聊程序。 思路： 这个程序中既有收又有发，需要同时执行，需要使用多线程技术。
		 * 一个线程负责发，一个线程负责收。需要两个任务。
		 */
		//UDPChatTest udpChatTest = new UDPChatTest("Socket聊天室");

		Chat chatClient = new Chat("聊天室");

		new UDPChatTest(chatClient);

	}

}

// 发送任务
class Send extends JTextArea implements Runnable {

	public DatagramSocket ds;

	public Send(String text) {
		super(text);
	}

	public Send(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
	    while (true);
	    /*
		try {
			BufferedReader bufr = new BufferedReader(new InputStreamReader(
					System.in));
			String line = null;
			while ((line = bufr.readLine()) != null) {
				byte[] buf = line.getBytes();// 将数据转成字节数组。
				DatagramPacket dp = new DatagramPacket(buf, buf.length,
						InetAddress.getByName("172.21.113.5"), 10002);
				ds.send(dp);
				if ("886".equals(line)) {
					break;
				}
			}

			// 4，关闭资源。
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}

	public DatagramSocket getDs() {
		return ds;
	}

	public void setDs(DatagramSocket ds) {
		this.ds = ds;
	}
}

// 接收任务。
class Rece extends JTextArea implements Runnable {

	private DatagramSocket ds;
	private String chatText="";

	public Rece(String text) {
		super(text);
	}

	public Rece(DatagramSocket ds) {
		super();
		this.setEnabled(false);
		this.ds = ds;
	}

	@Override
	public void run() {
		while (true) {
			try {
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);// 阻塞

				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String text = new String(dp.getData(), 0, dp.getLength());
				chatText+=ip + ":" + port + ":" + text+"\n";
				//System.out.println(chatText);
				setText(chatText);

                DatagramSocket ds2 = new DatagramSocket();
                byte[] buf2 = chatText.getBytes();//将数据转成字节数组。
//		将字节数组封装到数据包中。
                DatagramPacket dp2 = new DatagramPacket(buf2, buf2.length, InetAddress.getByName(ip), port);
//		3，使用socket对象的send方法将数据包发送出去。
                ds2.send(dp2);
//		4，关闭资源。
                ds2.close();


				if(text.equals("886")){
					System.out.println(ip+"....离开聊天室");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public DatagramSocket getDs() {
		return ds;
	}

	public void setDs(DatagramSocket ds) {
		this.ds = ds;
	}
}
