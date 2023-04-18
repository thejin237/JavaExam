package com.jslhrd.testb;

public class Exam_05 {
	public static void main(String[] args) {
		int[] score = { 90, 77, 67, 89, 85, 45, 78 };
		NumberSort ns;
		ns = new NumberSortExam(score);
		ns.ascSort();
		ns.descSort();

		// 합계출력(합계(최대-최소))
		ns.maxMinTotal();
	}

}
