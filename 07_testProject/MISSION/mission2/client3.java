
// Q
// ������� ������ �����ϴ� Ŭ���̾�Ʈ ������ ����
// �ͼ��� ���� Ǯ��

// main������ �� �־ ������ �ǳ� �������̴�.
// �ȵǴ� �� ������..!

package mission2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;


public class client3 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Socket socket = null;
      try {
    	  
    	  socket = new Socket("192.168.20.123", 7788);
    	  DataInputStream in = new DataInputStream(socket.getInputStream());
    	  DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    	  try {
    	  
    		  while (in != null) {
    			  
//    				  in.readUTF();
    				  System.out.print(in.readUTF());// UTF ���ڼ����� �о� ���� �޼ҵ�
    		  }
    		  out.writeUTF(sc.next());
    		  out.flush();
    		  System.out.print("��ȭ �Է� : ");
    		  
    	  
    		 
    	  }catch (IOException e) {
 	         // TODO Auto-generated catch block
 	         e.printStackTrace();
 	      }
 		 
      
      }
      
      catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         try {
            socket.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

      }

   }
}