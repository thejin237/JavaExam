package com.jslhrd.exam01;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int bun = scn.nextInt();
		String name = scn.next();
		int k = scn.nextInt();
		int e = scn.nextInt();
		int m = scn.nextInt();

		Student stu = new Student(bun, name, k, e, m);
		System.out.println(stu);
	}

}
