package com.jslhrd.exam02;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMain {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("C:\\Users\\admin\\data\\student.txt"));
		int cnt = 0;
		Student[] stu = null;
		while (scn.hasNextLine()) {
			String str = scn.nextLine();
			cnt++;
		}
		stu = new Student[cnt];
		StudentProcess stp = new StudentProcess();
		scn = new Scanner(new File("C:\\Users\\admin\\data\\student.txt"));

		for (int i = 0; i < cnt; i++) {
			String str = scn.nextLine();
			StringTokenizer st = new StringTokenizer(str, ", ");
			int bun = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int score1 = Integer.parseInt(st.nextToken());
			int score2 = Integer.parseInt(st.nextToken());
			int score3 = Integer.parseInt(st.nextToken());
			int score4 = Integer.parseInt(st.nextToken());
			int score5 = Integer.parseInt(st.nextToken());
			int[] score = new int[] { score1, score2, score3, score4, score5 };
			int tot = stp.tot(score);
			double ave = stp.ave(tot);
			stu[i] = new Student(bun, name, score1, score2, score3, score4, score5, tot, ave, 1);
		}
		System.out.println("학번\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t평균\t석차");
		stp.rank(stu);
		for (int i = 0; i < stu.length; i++) {
			stp.stuPrint(stu[i]);
		}

	}

}