package com.jslhrd.exam02;

import java.util.Scanner;

@FunctionalInterface
interface MySum {
	int add(int n, int m);
}

public class Exam_05 {
	public static void main(String[] args) {
		// 키보드로 x,y값을 입력받아서
		// n~m까지 소수를 출력하고 소수의 갯수를 리턴하는 프로그램 작성
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		scn.close();
		MySum ms = (n, m) -> {
			System.out.print("소수: ");
			int cnt = 0;
			for (int i = n; i <= m; i++) {
				int j;
				for (j = 2; j <= i; j++) {
					if (i % j == 0) {
						break;
					}
				}
				if (i == j) {
					System.out.print(i + "\t");
					cnt++;
				}
			}
			return cnt;
		};
		System.out.println("\n" + a + "~" + b + " 소수의 갯수: " + ms.add(a, b));
	}

}
