package udpMessenger;

import java.io.IOException;

//import java.net.DatagramSocket;
import javax.swing.JOptionPane;

public class Run {
	
	public static void main(String[] args) throws IOException {
		
		int myPort = Integer.parseInt(JOptionPane.showInputDialog("����� ��Ʈ��ȣ���Է��ϼ���"));
		int otherPort = Integer.parseInt(JOptionPane.showInputDialog("���� ��Ʈ ��ȣ�� �Է��ϼ���"));
		int otherPort2 = Integer.parseInt(JOptionPane.showInputDialog("����2 ��Ʈ ��ȣ�� �Է��ϼ���"));
		
		Messenger a = new Messenger(myPort, otherPort);
//		Messenger b = new Messenger(myPort, otherPort2);
		MyFrame f = a.getMyFrame();
		
		f.process();
		
	}
	
}