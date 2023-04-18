package com.jslhrd.school;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0] = new Student("1101", "AAA", "F", "1111");
		student[1] = new Student("1105", "BBB", "M", "2221");
		student[2] = new Student("1103", "CCC", "F", "3333");
		student[3] = new Student("1102", "DDD", "M", "4444");
		student[4] = new Student("1104", "EEE", "F", "5555");

		Score[] score = new Score[5];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Score sc = null;
		while (cnt < 5) {
			System.out.print("성적등록:");
			String hakbun = scn.next();
			if (hakbun.equals("0000"))
				break;
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();

			// 학번 존재유무 판단
			int j;
			boolean flag = false;
			for (j = 0; j < 5; j++) {
				if (hakbun.equals(student[j].getHakbun())) {
					flag = true;
					break;
				}
			}
			if (flag) {
				sc = new Score(student[j], kor, eng, mat);
				score[cnt] = sc;
				// score[cnt] = new Score(student[j],kor,eng,mat);
				cnt++;
			} else {
				System.out.println("등록된 학생 없음");
			}
			
		}
		// 출력
		System.out.println("학번\t이름\t성별\t국어\t영어\t수학");
		for (int i = 0; i < cnt; i++) {
			System.out.print(score[i].getStudent().getHakbun() + "\t");
			System.out.print(score[i].getStudent().getName() + "\t");
			System.out.print(score[i].getStudent().getGender() + "\t");
			System.out.print(score[i].getKor() + "\t");
			System.out.print(score[i].getEng() + "\t");
			System.out.print(score[i].getMat() + "\n");

		}
	}

}
