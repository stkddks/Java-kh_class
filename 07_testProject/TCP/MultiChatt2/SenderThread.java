package MultiChatt2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread  extends Thread{
	Socket sock;
	String name;
	SenderThread (Socket socket, String name){
		this.sock = socket;
		this.name = name;
	}
	public void run(){
		OutputStream out = null;		// ¿˙¿Â
		try {
			out = sock.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter wr = new PrintWriter(out);
			wr.println(name);
			wr.flush();
			
			while(true){
				String str = br.readLine();
				if (str.equals("bye")) break;
				wr.println(str);
				wr.flush();
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		} finally {
			try {
				sock.close();
			} catch (Exception ignored) {}   
		}
	}
}

