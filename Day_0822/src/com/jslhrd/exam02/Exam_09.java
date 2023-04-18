package com.jslhrd.exam02;

public class Exam_09 {
	public static void main(String[] args) {
		String str = "1234Korea";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			int ch1 = str.charAt(i);
			System.out.print(ch1);
		}
		System.out.println();

		char ch2 = str.charAt(3);// 4
		System.out.println(ch2);

		int index = str.indexOf("K");
		System.out.println(index);// 4번째

		String s1 = "Korea";
		String s2 = "Korea";
		String s3 = "Korae";
		System.out.println(s1.compareTo(s2));// 같으면 0
		System.out.println(s2.compareTo(s3));// 음수(먼저),양수(뒤)

		s1 = s1.concat(s2);// 문자열 연결
		System.out.println(s1);
	}

}
