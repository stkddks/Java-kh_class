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
	//���θ޴� ��¿� �޼ҵ�
	public void main() {
		
		while(true) {
			System.out.println("\n\n---- ȸ�� ���� ���α׷� v3 ----\n");
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ��ü ȸ�� ���� ���");
			System.out.println("3. ȸ�� ���� ���(1��)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
	public void insertMember() {	
//�ۼ�
	}
	public void printAllMember() {
		//�ۼ�
	}
	
	public void printOneMember() {
		//�ۼ�
	}
	public void deleteMember() {
		//�ۼ�
	}
	public void updateMember() {
		//�ۼ�
	}
	public int searchIndex(String name) {
		//�ۼ�
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
