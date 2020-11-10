package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q1_server {
	public static void main(String[] args) throws IOException{
		int port = 9999;
		ServerSocket serverSocket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		serverSocket = new ServerSocket(port);
		try {
			while(true) {
				Socket clientSocket = serverSocket.accept();
				try {
					InputStream in = clientSocket.getInputStream();
					OutputStream out = clientSocket.getOutputStream();
					
					dis = new DataInputStream(in);
					dos = new DataOutputStream(out);
					dos.writeUTF("[서버 연결 성공]");
					
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					String now = sdf.format(date);
					dos.writeUTF("[현재시간] : "+now);
					
				}catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				dis.close();
				dos.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
		
	}
	
}