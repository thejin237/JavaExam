package com.jslhrd.exam01;

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int cnt = 0;
		while (scn.hasNextInt()) {
			int bun = scn.nextInt();
			cnt++;
			System.out.println("bun" + cnt + " = " + bun);

		}

//		int bun1 = scn.nextInt();
//		int bun2 = scn.nextInt();
//		int bun3 = scn.nextInt();
//		int bun4 = scn.nextInt();
//		
//		System.out.println("bun1 = "+ bun1);
//		System.out.println("bun2 = "+ bun2);
//		System.out.println("bun3 = "+ bun3);
//		System.out.println("bun4 = "+ bun4);
	}

}
