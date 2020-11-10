package test;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Q1 {
	public static void main(String[] args) throws IOException {
		String serverIp = "127.0.0.1";
		int serverPort = 9999;
		Socket socket = null;
		DataInputStream dis = null;
		
		try {
			socket = new Socket(serverIp, serverPort);
			InputStream in = socket.getInputStream();
			
			while(true) {
				dis = new DataInputStream(in);
				String serverMsg = dis.readUTF();
				System.out.println(serverMsg);
			} 
		}
		
		
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				dis.close();
//				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
	}
	
}

