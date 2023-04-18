package com.jslhrd.exam01;

import java.util.Scanner;

//toString()
class DD {
	int x;

	DD(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "" + x;
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		String str = new String("AAAA");
		Scanner scn = new Scanner(System.in);
		DD dd = new DD(10);

		System.out.println("str=" + str);
		System.out.println("scn=" + scn);
		System.out.println("dd=" + dd);
	}

}
