package com.jslhrd.exam02;

public class Exam_10 {
	public static void main(String[] args) {
		String str = "1 aaaa 90 89 88";
		String[] s = str.split(" ");// spacebar(공백)으로 데이타 구별하여 배열로 리턴
		System.out.print(s[0]);
		System.out.print(s[1]);
		System.out.print(s[2]);
		System.out.print(s[3]);
		System.out.println();

		String str2 = "1,bbb,770,89  88";
		String[] s2 = str2.split(",");
		System.out.print(s2[0]);
		System.out.print(s2[1]);
		System.out.print(s2[2]);
		System.out.print(s2[3]);
		System.out.println();

		String str3 = "Hello World Java Programming";
		boolean bool = str3.contains("Java");// 포함되어 있으면 true
		System.out.println(bool);

		String str4 = str3.replace("Java", "Servalet");// 치환
		System.out.println(str3);
		System.out.println(str4);

		// 문자열 분리
		// substring(index);//index부터 끝까지
		// substring(index, end);//index부터 end전까지
		String ss1 = str3.substring(20);
		System.out.println(ss1);
		String ss2 = str3.substring(6, 20);
		System.out.println(ss2);
	}

}
