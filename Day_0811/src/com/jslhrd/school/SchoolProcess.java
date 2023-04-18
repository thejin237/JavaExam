package com.jslhrd.school;

import java.util.Scanner;

public class SchoolProcess {
	Scanner scn = new Scanner(System.in);
	Student stu[] = new Student[10];
	Score score[] = new Score[stu.length];
	int stCnt = 0;
	int scCnt = 0;

	// 학생등록 메소드
	void studentInput() {
		while (stCnt < 10) {
			System.out.print("등록:");
			String bun = scn.next();
			if (bun.equals("0000"))
				break;
			String name = scn.next();
			String gender = scn.next();
			String phone = scn.next();
			boolean flag = true;
			for (int i = 0; i < stCnt; i++) {
				if (bunCheck(bun)) {
					stu[stCnt] = new Student(bun, name, gender, phone);
					stCnt++;
				}else {
					System.out.println("이미 등록된 학생입니다.");
					flag = false;
					break;
				}
			}
		}
	}

	void scoreInput() {
		for (int i = 0; i < scCnt; i++) {
			System.out.print("등록:");
			String bun = scn.next();
			if (bun.equals("0000"))
				break;
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			score[i] = new Score();
			
			boolean flag = true;
			for(int j = 0;j<scCnt;j++) {
				if (bunCheck(bun)) {
					System.out.println("번호확인");//확인후 삭제
					if(score[j].getKor()==0) {
						flag = true;
					}else {
						System.out.println("이미 등록된 학생입니다.");
						flag = false;
						break;
					}
				}else {
					System.out.println("등록된 학생이 없습니다.");
					flag = false;
					break;
				}
			}
			if (flag) {
				score[i] = new Score(bun, kor, eng, mat);
				scCnt++;
			}
		}

	}

	// 학생 번호 조회
	private boolean bunCheck(String bun) {
		boolean flag = true;
		for(int i=0; i<stCnt;i++) {
			if(stu[i].getBun().equals(bun)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	// 학생 조회(출력) 메소드
	void stuPrint() {
		if(stCnt==0) {
			System.out.println("학생 등록정보 없음");
			return;
		}
		for (int i = 0; i < stCnt; i++) {
			stu[i].stuPrint();
		}
	}

	// 성적 조회(출력) 메소드
	void scorePrint() {
		rank();
		for (int i = 0; i < scCnt; i++) {
			System.out.print(stu[i].getBun() + "\t" + stu[i].getName() + "\t");
			score[i].scorePrint();
		}
	}

	// 석차 입력
	void rank() {
		int rank = 1;
		for (int i = 0; i < scCnt; i++) {
			score[i].setRank(1);
			for (int j = 0; j < scCnt; j++) {
				if (score[i].getAvr() < score[j].getAvr()) {
					rank++;
					score[i].setRank(rank);
				}
			}
		}
	}

}
