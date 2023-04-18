package com.jslhrd.exam01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String str = scn.nextLine();
		StringTokenizer st = new StringTokenizer(str, ", ");

		int b = Integer.parseInt(st.nextToken());
		String n = st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Student stu = new Student(b, n, k, e, m);
		System.out.println(stu);
	}

}
