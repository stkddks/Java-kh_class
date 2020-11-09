
// Q
// 강사님의 서버로 접속하는 클라이언트 파일을 만들어서
// 넌센스 문제 풀기

// main안으로 다 넣어서 실행이 되나 실험중이다.
// 안되는 것 같은데..!

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
    				  System.out.print(in.readUTF());// UTF 문자셋으로 읽어 오는 메소드
    		  }
    		  out.writeUTF(sc.next());
    		  out.flush();
    		  System.out.print("대화 입력 : ");
    		  
    	  
    		 
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