package udpMessenger;

import java.io.IOException;

//import java.net.DatagramSocket;
import javax.swing.JOptionPane;

public class Run {
	
	public static void main(String[] args) throws IOException {
		
		int myPort = Integer.parseInt(JOptionPane.showInputDialog("당신의 포트번호를입력하세요"));
		int otherPort = Integer.parseInt(JOptionPane.showInputDialog("상대방 포트 번호를 입력하세요"));
		int otherPort2 = Integer.parseInt(JOptionPane.showInputDialog("상대방2 포트 번호를 입력하세요"));
		
		Messenger a = new Messenger(myPort, otherPort);
//		Messenger b = new Messenger(myPort, otherPort2);
		MyFrame f = a.getMyFrame();
		
		f.process();
		
	}
	
}