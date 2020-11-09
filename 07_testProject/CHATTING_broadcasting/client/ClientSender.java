
// 3��

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
					System.out.print("��ȭ �Է� : ");
					out.writeUTF("[" + name + "]" + sc.next());		
					//ä���� �ٱ���� ����, �۽��� �����ؾ� �Ѵ�. 
					//���� readUTF(), writeUTF() �޼ҵ带 ����ؼ� �޽����� ����, �۽� �Ѵ�.
					Thread.sleep(100);		
					// �ָ� �����ָ� out.writeUTF�� ������ ���ٿ����� �ʰ� ����� �Ǳ� ������ sleep�� �־��ش�.
					
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
