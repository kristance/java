package com.tjoeun.networkTest3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server4 extends JFrame implements ActionListener, Runnable {

//	JTextArea textArea;
	JLabel textArea;
	JPanel panel;
	JTextField textField;
	JButton button;

	ServerSocket serverSocket;
	Socket socket;
	PrintWriter printWriter;
	Scanner scanner;
	String message = "";
	
	public Server4() {
		setTitle("1:1 채팅 프로그램 - 서버");
		setBounds(100, 50, 500, 700);
		
//		textArea = new JTextArea();
		textArea = new JLabel();
		textArea.setOpaque(true);
		textArea.setBackground(Color.ORANGE);
		textArea.setVerticalAlignment(JLabel.BOTTOM);
//		textArea.setEditable(false);
		add(textArea);

		panel = new JPanel(new BorderLayout());
		panel.setPreferredSize(new Dimension(500, 40));
		textField = new JTextField();
		panel.add(textField);
		button = new JButton("전송");
		panel.add(button, BorderLayout.EAST);
		add(panel, BorderLayout.SOUTH);
		
		textField.addActionListener(this);
		button.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(textArea, "채팅을 종료하겠습니까?", "채팅 종료", JOptionPane.YES_NO_OPTION);
				if (result == 0) {
					printWriter.write("저 나가요~~~~~ 바이바이~~~~~\n");
					printWriter.write("bye\n");
					printWriter.flush();
					if (serverSocket != null) { try { serverSocket.close(); } catch (IOException err) { err.printStackTrace(); } }
					if (socket != null) { try { socket.close(); } catch (IOException err) { err.printStackTrace(); } }
					System.exit(0);
				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Server4 server = new Server4();
		
		try {
			server.serverSocket = new ServerSocket(10004);
			server.message = "192.168.0.102 서버의 10004번 포트로 서버 시작<br>";
			server.message += "클라이언트가 접속하기를 기다립니다.<br>";
			server.textArea.setText("<html>" + server.message + "</html>");
			
			server.textField.setEnabled(false);
			server.button.setEnabled(false);
			
			server.socket = server.serverSocket.accept();
			server.message = server.message + server.socket + " 접속 성공\n";
			server.textArea.setText("<html>" + server.message + "</html>");
			
			server.textField.setEnabled(true);
			server.button.setEnabled(true);
			server.textField.requestFocus();
			
			server.printWriter = new PrintWriter(server.socket.getOutputStream());
			server.scanner = new Scanner(server.socket.getInputStream());
			
			Thread thread = new Thread(server);
			thread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		while (socket != null) {
			String msg = "";
			try {
				msg = scanner.nextLine().trim();
			} catch (Exception e) {
				break;
			}
			if (msg.length() > 0) {
//				message = "client >> " + msg + "\n" + message;
				message = message + "<br>client >> " + msg;
				textArea.setText("<html>" + message + "</html>");
				if (msg.toLowerCase().equals("bye")) {
					break;
				}
			}
			try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		textField.setEnabled(false);
		button.setEnabled(false);
		if (socket != null) { try { socket.close(); } catch (IOException e) { e.printStackTrace(); } }
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String msg = textField.getText().trim();
		if (msg.length() > 0) {
//			message = "server >> " + msg + "\n" + message;
			message = message + "<br>server >> " + msg;
			textArea.setText("<html>" + message + "</html>");
			if (printWriter != null) {
				printWriter.write(msg + "\n");
				printWriter.flush();
			}
		}
		textField.setText("");
		textField.requestFocus();
		
	}

}












