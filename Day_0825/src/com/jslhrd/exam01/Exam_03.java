package com.jslhrd.exam01;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String[] str = scn.nextLine().split(" ");

		Student stu = new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]),
				Integer.parseInt(str[4]));
		System.out.println(stu);
	}

}
