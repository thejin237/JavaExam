package com.jslhrd.school;

import java.util.Scanner;

public class SchoolExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		SchoolProcess sp = new SchoolProcess();
		while (true) {
			System.out.println("<<학생 및 성적 관리 프로그램>>");
			System.out.println("[1] 학생등록");
			System.out.println("[2] 성적등록");
			System.out.println("[3] 학생정보 출력");
			System.out.println("[4] 학생성적 출력");
			System.out.println("[5] 프로그램 종료");
			System.out.print("메뉴 선택: ");
			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				sp.studentInput(); // 학생등록
				break;
			case 2:
				sp.scoreInput();// 성적등록
				break;
			case 3:
				sp.stuPrint();// 학생정보 출력 
				break;
			case 4:
				sp.scorePrint();// 성적정보 출력
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("입력오류");
			}
		}
	}

}
