package testProject;
import java.util.*;
public class Television {
	
	private boolean power;
	private int volume;
	private int channel;

	
	public void setPower(boolean power) {
//		if (power.equals("true")) {
//			this.power = true;
//			System.out.println("������ �׽��ϴ�.");
//		}
//		else {
//			this.power = false;
//			System.out.println("������ �����ϴ�.");
//		}
		
		
		
		if(power==true) {
			this.power = true;	
			System.out.println("������ �׽��ϴ�.");
			//return true;
		}
		else {
			this.power = false;
			System.out.println("������ �����ϴ�.");
			System.exit(0);
		}
	}
	

	public boolean isPower() {	//boolean �� getter
		return power;
	}
	
	
	
	
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("ä���� " + channel + "���� �����Ͽ����ϴ�.");        
	}
	
	public void setVoulume(int volume) {
		if ((volume < 0) || (volume > 100))
            System.out.println("������ 0�̻� 100���ϸ� �����մϴ�.");
        else {
            this.volume = volume;
            System.out.println("������ " + volume + "���� �����Ͽ����ϴ�.");
        }
	}

	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
//	
//	public boolean turnOff() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("TV�� �ѽðڽ��ϱ�? : (TurnOn: true / TurnOff: false)");
//		String power = sc.next();
//		if(power.equals("true")) {
//			System.out.println("������ �׽��ϴ�.");
//			return true;
//		}
//		System.out.println("������ �����ϴ�.");
//		System.exit(0);
//		return false;
//	}
	void print() {
		System.out.printf("ä���� %d�̰� ������ %d�Դϴ�.\n", channel, volume); // ����
	}
	
	
	
	
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		Television myTv = new Television();
//		myTv.turnOff();
////		System.out.println("TV�� �ѽðڽ��ϱ�? : (TurnOn: true / TurnOff: false)");
////		
////		
////		String power = sc.next();
////		if(power.equals("true")) {
////			 myTv.turnOn(power);}
////		else if(power.equals("false")) { 
////			myTv.turnOff();}
////		else {
////			System.out.println("�ý����� �����մϴ�.");}
////		
//		  //myTv.print();
//		  
//		  //int ch = myTv.getChannel();
//		  
//	
//	}

}
