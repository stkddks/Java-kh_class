
// 3번

package client;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class ClientSender extends Thread{
	Socket socket;
	DataOutputStream out;
	String name;
	public ClientSender(Socket socket, String name){
		this.socket = socket;
		this.name = name;
		try {
			this.out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		if(out != null){
			try {
				out.writeUTF(name);
				while(out != null){
					System.out.print("대화 입력 : ");
					out.writeUTF("[" + name + "]" + sc.next());		
					//채팅은 다국어로 수신, 송신이 가능해야 한다. 
					//따라서 readUTF(), writeUTF() 메소드를 사용해서 메시지를 수신, 송신 한다.
					Thread.sleep(100);		
					// 애를 안해주면 out.writeUTF가 서버에 갔다오느라 늦게 출력이 되기 때문에 sleep을 넣어준다.
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
