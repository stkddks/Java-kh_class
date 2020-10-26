package kh.point.controller;

import java.util.Scanner;

import kh.point.model.vo.Gold;
import kh.point.model.vo.Grade;
import kh.point.model.vo.Silver;
import kh.point.model.vo.Vip;
import kh.point.model.vo.Vvip;

public class PointController {
	Scanner sc;
	Grade[] members;
	int index;
	public PointController() {
		sc = new Scanner(System.in);
		members = new Grade[40];
	}
	//메인메뉴 출력용 메소드
	public void main() {
		
		while(true) {
			System.out.println("\n\n---- 회원 관리 프로그램 v3 ----\n");
			System.out.println("1. 회원 등록");
			System.out.println("2. 전체 회원 정보 출력");
			System.out.println("3. 회원 정보 출력(1명)");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	public void insertMember() {	
//작성
	}
	public void printAllMember() {
		//작성
	}
	
	public void printOneMember() {
		//작성
	}
	public void deleteMember() {
		//작성
	}
	public void updateMember() {
		//작성
	}
	public int searchIndex(String name) {
		//작성
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
