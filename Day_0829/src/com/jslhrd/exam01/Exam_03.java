package com.jslhrd.exam01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//달력 만들기
public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("년도 :");
		int year = scn.nextInt();
		System.out.print("월 :");
		int month = scn.nextInt();
		scn.close();

		System.out.println("\t" + year + "년" + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 년, 월 구하기
		Calendar cal = new GregorianCalendar(year, month - 1, 1);
		// 마지막 날짜 구하기
		int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 요일구하기
		int week = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= maxday; i++) {
			if (week <= 7) {
				System.out.print(i + "\t");
			} else {
				System.out.print("\n");
				System.out.print(i + "\t");
				week = 1;
			}
			week++;
		}
	}
	

}
