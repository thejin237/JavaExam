package com.jslhrd.exam01;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentProcess {

	Scanner scn;
	Student[] stu;
	int cnt = 0;
	private int[] score = new int[5];

	public void stuScn() throws Exception {
		scn = new Scanner(new File("src\\student.txt"));
		while (scn.hasNextLine()) {
			scn.nextLine();
			cnt++;
		}
		stu = new Student[cnt];
		scn = new Scanner(new File("src\\student.txt"));
	}

	public void stuInput() {
		for (int i = 0; i < cnt; i++) {
			String str = scn.nextLine();
			StringTokenizer stn = new StringTokenizer(str, ", ");
			int bun = Integer.parseInt(stn.nextToken());
			String name = stn.nextToken();
			int score1 = Integer.parseInt(stn.nextToken());
			int score2 = Integer.parseInt(stn.nextToken());
			int score3 = Integer.parseInt(stn.nextToken());
			int score4 = Integer.parseInt(stn.nextToken());
			int score5 = Integer.parseInt(stn.nextToken());
			score = new int[] { score1, score2, score3, score4, score5 };
			stu[i] = new Student(bun, name, score1, score2, score3, score4, score5);
			maxMin(i);
			totAve(i);
		}
	}

	public void maxMin(int i) {
		int max = score[0];
		int min = score[0];
		for (int j = 0; j < stu.length; j++) {
			for (int k = 1; k < 5; k++) {
				max = Math.max(max, score[k]);
			}
			for (int k = 1; k < 5; k++) {
				min = Math.min(min, score[k]);
			}
		}
		stu[i].setMax(max);
		stu[i].setMin(min);
	}

	public void totAve(int i) {
		stu[i].setTot(stu[i].getScore1() + stu[i].getScore2() + stu[i].getScore3() + stu[i].getScore4()
				+ stu[i].getScore5() - (stu[i].getMax() + stu[i].getMin()));
		stu[i].setAve((int) (stu[i].getTot() / 3. * 100 + 0.5) / 100.);
	}
	
	public void rank() {
		for (int i = 0; i < stu.length; i++) {
			stu[i].setRank(1);
			int rank = stu[i].getRank();
			for (int j = 0; j < stu.length; j++) {
				if (stu[i].getAve() < stu[j].getAve()) {
					rank++;
				}
			}
			stu[i].setRank(rank);
		}
	}
	
	
	public void sortBun() {
		Student[] stuc = stu.clone();
		for (int i = 0; i < stuc.length; i++) {
			for (int j = 0; j < stuc.length; j++) {
				if (stuc[i].getBun() < stuc[j].getBun()) {
					Student temp = stuc[i];
					stuc[i] = stuc[j];
					stuc[j] = temp;
				}
			}
		}
		System.out.println("=====< 학번순 오름차순 정렬 >=====");
		stuPrint(stuc);
	}

	public void sortRank() {
		Student[] stuc = stu.clone();
		for (int i = 0; i < stuc.length; i++) {
			for (int j = 0; j < stuc.length; j++) {
				if (stuc[i].getRank() < stuc[j].getRank()) {
					Student temp = stuc[i];
					stuc[i] = stuc[j];
					stuc[j] = temp;
				}
			}
		}
		System.out.println("=====< 석차순 오름차순 정렬 >=====");
		stuPrint(stuc);
	}
	
	public void sortName() {
		Student[] stuc = stu.clone();
		for (int i = 0; i < stuc.length; i++) {
			for (int j = 0; j < stuc.length; j++) {
				if (stuc[i].getName().charAt(0) < stuc[j].getName().charAt(0)) {
					Student temp = stuc[i];
					stuc[i] = stuc[j];
					stuc[j] = temp;
				}
			}
		}
		System.out.println("=====< 이름순 오름차순 정렬 >=====");
		stuPrint(stuc);
	}

	public void stuPrint(Student[] stu) {
		System.out.println("학번\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t최고점\t최저점\t총점\t평균\t석차");
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
		System.out.println();
	}

}
