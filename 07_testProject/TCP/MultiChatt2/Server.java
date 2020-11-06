package MultiChatt2;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try{
			serverSocket = new ServerSocket(5000);
			while(true){
				Socket sock = serverSocket.accept();
				Thread thread = new PerClientThread(sock);
				thread.start();
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

