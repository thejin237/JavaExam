package com.jslhrd.student;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		StudentProcess sp = new StudentProcess();
		int num = 0;
		while (num != 5) {
			num = sp.select();
			switch (num) {
			case 1:
				sp.input(); // 학생등록
				break;
			case 2:
				sp.stuPrint();// 학생 조회
				break;
			case 3:
				sp.stuBunSort();// 학생 번호순 정렬
				break;
			case 4:
				sp.stuSort();// 학생 성적순 정렬
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("입력오류");
			}
		}
	}

}
