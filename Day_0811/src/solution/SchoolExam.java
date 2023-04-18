package solution;

import java.util.Scanner;

public class SchoolExam {
	public static void main(String[] args) {
		SchoolProcess sPro = new SchoolProcess();
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("학생 및 성적 관리 프로그램");
			System.out.println("[1]학생등록");
			System.out.println("[2]성적입력");
			System.out.println("[3]학생정보 출력");
			System.out.println("[4]성적정보 출력");
			System.out.println("[5]프로그램 종료");
			System.out.print("메뉴 선택 ? ");
			
			int menu = scn.nextInt();
			switch(menu) {
			case 1:
				//학생등록
				sPro.studentInput();
				break;
			case 2:
				//성적입력
				sPro.scoreInput();
				break;
			case 3:
				//학생정보출력
				sPro.studentPrint();
				break;
			case 4:
				//성적정보출력
				//sPro.scorePrint();
				sPro.stuScorePrint();
				break;
			case 5:
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);//종료1
			default:
				System.out.println("입력오류");
			}
		}
	}
}
