package testProject;
import java.util.*;
public class Motel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean[] room = new boolean[10];
		// 빈 방은 0, 찬 방은 1.
		while (true) {
			System.out.println("───────────────모텔 관리 프로그램───────────────");
			System.out.println("1.입실 \t 2.퇴실 \t 3.방 현황 \t 4.종료");
			System.out.println("────────────────────────────────────────────────");

			int roomNum = 99;

			System.out.print("선택 > ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.print("몇 번 방에 입실하시겠습니까? ");
				roomNum = sc.nextInt() - 1;

//				while (true) {
//					if (roomNum < 0 || 9 < roomNum) {
//						System.out.println();
//						System.out.println("저희 모텔에 준비된 방은 1번 방부터 10번 방까지입니다.");
//						System.out.print("다시 입력해주세요 > ");
//						roomNum = sc.nextInt() - 1;
//						System.out.println();
//					} else {
//						break;
//					}
//				}

				if (room[roomNum]) {
					System.out.println((roomNum + 1) + "번 방은 이미 손님이 계십니다.");
					System.out.println();

					break;
				}
				room[roomNum] = true;
				System.out.println((roomNum + 1) + "번 방에 입실하셨습니다.");
				System.out.println("편히 쉬다 가세요★");
				System.out.println();

				break;
			case 2:
				System.out.print("몇 번 방에서 퇴실하시겠습니까? ");
				roomNum = sc.nextInt() - 1;

//				while (true) {
//					if (roomNum < 0 || 9 < roomNum) {
//						System.out.println();
//						System.out.println("저희 모텔에 준비된 방은 1번 방부터 10번 방까지입니다.");
//						System.out.print("다시 입력해주세요 > ");
//						roomNum = sc.nextInt() - 1;
//						System.out.println();
//					} else {
//						break;
//					}
//				}

				if (!room[roomNum]) {
					System.out.println("선택하신 " + (roomNum + 1) + "번 방은 이미 비어있습니다.");
					System.out.println();
					break;
				}
					room[roomNum] = false;
					System.out.println((roomNum + 1) + "번 방에서 퇴실하셨습니다.");
					System.out.println("좋은 하루 보내세요");
					System.out.println();

				break;
			case 3:
				for (int i = 0; i < room.length; i++) {
					if (room[i]) {
						System.out.println("\t" + (i + 1) + "번 방은 현재 손님이 있습니다.");
					} else {
						System.out.println("\t" + (i + 1) + "번 방은 현재 비어있습니다.♡");
					}
				}
				break;
			case 4:
				System.out.println("오늘 하루 고생 많으셨습니다 사장님!");
				sc.close();
				return;
			}
		}
	

	}

}
