package MultiChatt2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	Socket sock;
	ReceiverThread(Socket sock){
		this.sock = sock;
	}
	
	public void run() {
		InputStream in = null;	
		try{
			in = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while(true){
				String str = br.readLine();
				if (str == null){
					break;
				}
				System.out.println(str);
			}
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}

