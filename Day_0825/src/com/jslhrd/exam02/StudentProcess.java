package com.jslhrd.exam02;

public class StudentProcess {

	public int tot(int[] score) {
		int tot = score[0];
		for (int i = 1; i < score.length; i++) {
			tot += score[i];
		}
		return tot;
	}

	public double ave(int tot) {
		double ave = (int) (tot / 5. * 100 + 0.5) / 100.;
		return ave;
	}

	public void rank(Student[] stu) {
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length; j++) {
				if (stu[i].getAve() < stu[j].getAve()) {
					stu[i].setRank(stu[i].getRank() + 1);
				}
			}
		}
	}

	public void stuPrint(Student stu) {
		System.out.print(stu.getBun() + "\t");
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getScore1() + "\t");
		System.out.print(stu.getScore2() + "\t");
		System.out.print(stu.getScore3() + "\t");
		System.out.print(stu.getScore4() + "\t");
		System.out.print(stu.getScore5() + "\t");
		System.out.print(stu.getTot() + "\t");
		System.out.print(stu.getAve() + "\t");
		System.out.println(stu.getRank());
	}

}
