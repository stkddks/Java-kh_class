package MultiChatt2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket sock;
	
	PrintWriter wr;
	public PerClientThread(Socket sock) {
		this.sock =  sock;
		
		try{
			wr = new PrintWriter(sock.getOutputStream());
			list.add(wr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run(){
		String name = null;
		InputStream in = null;
		try{
			in = sock.getInputStream();
			BufferedReader br =  new BufferedReader(new InputStreamReader(in));
			name =  br.readLine();
			sendAll("#" + name + " is Joined");
			while(true){
				String str = br.readLine();
				if(str == null){
					break;
				}
				sendAll(name + ">" + str);
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		} finally {
			list.remove(wr);
			sendAll("#" + name + " is out");
			try{
				sock.close();
			} catch (Exception ignored) {    
			}
		}
	}
	
	private void sendAll(String str) {
		for (PrintWriter writer : list){
			writer.println(str);
			writer.flush();
		}
	}
	
}
