package MultiChatt2;
import java.net.Socket;

public class Client {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("input name!");
			return;
		}
		try{
			Socket sock = new Socket("localhost", 5000);
			Thread thread1 = new SenderThread(sock, args[0]);
			Thread thread2 = new ReceiverThread(sock);
			thread1.start();
			thread2.start();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}