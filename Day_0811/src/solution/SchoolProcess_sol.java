package solution;

import java.util.Scanner;

public class SchoolProcess_sol {
	Student[] student = new Student[10];
	Score[] score = new Score[student.length];
	int stCnt;
	int scCnt;
	
	//학생정보 등록 메소드
	public void studentInput() {
		Scanner scn = new Scanner(System.in);
		Student stu = null;
		while(stCnt < 10) {
			System.out.print("학생등록 : ");
			String hakbun = scn.next();
			if(hakbun.equals("0000"))
				return;
			String name = scn.next();
			String gender = scn.next();
			String phone = scn.next();
			if(stuCheck(hakbun)) {//학번중복 검사 메소드 호출
				stu = new Student(hakbun,name,gender,phone);
				student[stCnt]=stu;
				stCnt++;
			}else {
				System.out.println("이미등록된 학생입니다");
			}
		}
	}
	
	//성적정보 입력 메소드
	public void scoreInput() {
		Scanner scn = new Scanner(System.in);
		Score sc = null;
		while(stCnt < 10) {
			System.out.print("성적등록 : ");
			String hakbun = scn.next();
			if(hakbun.equals("0000"))
				return;
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			
			if(!stuCheck(hakbun)) {//학번존재유무 검사 메소드 호출
				if(scCheck(hakbun)) {// 성적 중복 섬사 메소드 호출
					sc = new Score(hakbun,kor,eng,mat);
					score[scCnt]=sc;
					scCnt++;
				}else {
					System.out.println("이미 등록된 성적입니다");
				}
			}else {
				System.out.println("학생정보가 존재하지 않습니다");
			}
		}
	}

	//학생정보 출력
	public void studentPrint() {
		if(stCnt==0) {
			System.out.println("등록된 정보가 없습니다");
			return;
		}
		System.out.println("학번\t이름\t성별\t전화");
		for(int i=0; i<stCnt; i++) {
			student[i].stuPrint();
		}
	}

	//성적정보 출력
	public void scorePrint() {
		if(scCnt==0) {
			System.out.println("등록된 정보가 없습니다");
			return;
		}
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0; i<scCnt; i++) {
			score[i].scPrint();
		}
	}
	
	//학생+성적정보 출력
	public void stuScorePrint() {
		if(stCnt==0) {
			System.out.println("등록된 정보가 없습니다");
			return;
		}
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t석차");	
		for(int i=0; i<stCnt; i++) {
			System.out.print(student[i].getHakbun()+"\t");
			System.out.print(student[i].getName()+"\t");
			for(int j=0; j<scCnt; j++) {
				if(student[i].getHakbun().equals(score[j].getHakbun())) {
					System.out.print(score[j].getKor()+"\t");
					System.out.print(score[j].getEng()+"\t");
					System.out.print(score[j].getMat()+"\t");
					System.out.print(score[j].getTot()+"\t");
					System.out.print(score[j].getAve()+"\t");
					System.out.print(score[j].getRank()+"\n");
				}else {
					System.out.print("성적관련 자료가 없습니다\n");
				}
			}
		}
	}

	//학번 중복체크
	private boolean stuCheck(String hakbun) {
		boolean flag=true;
		for(int i=0; i<stCnt; i++) {
			if(student[i].getHakbun().equals(hakbun)) {
				//System.out.println("이미등록된 학생입니다");
				flag=false;
				break;
			}
		}
		return flag;
	}
	//성적 중복체크
	private boolean scCheck(String hakbun) {
		boolean flag=true;
		for(int i=0; i<scCnt; i++) {
			if(score[i].getHakbun().equals(hakbun)) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
