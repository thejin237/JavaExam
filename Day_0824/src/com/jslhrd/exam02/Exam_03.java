package com.jslhrd.exam02;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[]arr = null;
		while (true) {
			System.out.print("수치입력(1~?):");
			int num = scn.nextInt();
			if (num == 0)
				break;
			arr = new int[num];

			for (int i = 0; i < 100; i++) {
				int r = (int) (Math.random() * num) + 1;
				arr[r - 1]++;
			}
			for (int i = 0; i < num; i++) {
				System.out.print((i + 1) + ":");
				for (int j = 0; j < arr[i]; j++) {
					System.out.print("*");
				}
				System.out.print("(" + arr[i] + ")");
				System.out.println();
			}
		}
	}

}
