package com.jslhrd.student;

import java.util.Scanner;

public class StudentProcess {
	Scanner scn = new Scanner(System.in);
	Student stu[] = new Student[10];// 객체 배열 필드생성
	int cnt = 0;

	// 학생등록 메소드
	void input() {
		while (cnt < 10) {
			System.out.print("등록:");
			String bun = scn.next();
			if (bun.equals("0000"))
				break;
			String name = scn.next();
			String gender = scn.next();
			int score = scn.nextInt();
			stu[cnt] = new Student();// 새로운 객체 생성하여 객체 배열 필드에 위치(주소)참조
			boolean flag = true;
			for (int i = 0; i < cnt; i++) {
				if (stu[i].getBun().equals(bun)) {
					System.out.println("이미 등록된 학생입니다.");
					flag = false;
					break;
				}
			}
			if (flag) {
				this.setStudent(bun, name, gender, score);
				cnt++;
			}
		}
	}

	void setStudent(String bun, String name, String gender, int score) {
		stu[cnt].setBun(bun);
		stu[cnt].setName(name);
		stu[cnt].setGender(gender);
		stu[cnt].setScore(score);
	}

	// 학생 조회(출력) 메소드
	void stuPrint() {
		for (int i = 0; i < cnt; i++) {
			stu[i].stuPrint();
		}
	}

	// 학생 성적순 정렬 메소드
	void stuSort() {
		Student stuc[] = stu.clone();
		System.out.println("학생 성적순 정렬");
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (stuc[i].getScore() < stuc[j].getScore()) {
					Student temp = stuc[i];
					stuc[i] = stuc[j];
					stuc[j] = temp;
				}
			}
		}
		for (int i = 0; i < cnt; i++) {
			stuc[i].stuPrint();
		}
	}

	// 학생 번호순 정렬 메소드
	void stuBunSort() {
		Student stuc[] = stu.clone();
		System.out.println("학생 번호순 정렬");
		System.out.println("학번이름성별점수");
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (Integer.parseInt(stuc[i].getBun()) > Integer.parseInt(stuc[j].getBun())) {
					Student temp = stuc[i];
					stuc[i] = stuc[j];
					stuc[j] = temp;
				}
			}
		}
		for (int i = 0; i < cnt; i++) {
			stuc[i].stuPrint();
		}
	}

	// 입력 번호 선택 메소드
	int select() {
		int num;
		System.out.println("학생조회프로그램");
		System.out.println("[1] 학생등록");
		System.out.println("[2] 학생조회");
		System.out.println("[3] 학생 번호순 정렬");
		System.out.println("[4] 학생 성적순 정렬");
		System.out.println("[5] 프로그램 종료");
		System.out.print("선택: ");

		num = scn.nextInt();
		return num;
	}
}
