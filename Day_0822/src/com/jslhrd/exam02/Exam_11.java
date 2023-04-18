package com.jslhrd.exam02;

public class Exam_11 {
	public static void main(String[] args) {
		String str = "   Java  Programming     ";
		str.toLowerCase();// 소문자로 치환
		str.toUpperCase();// 대문자로 치환
		str.trim();// 앞뒤 공백 제거
		int a = 100;
		boolean bool = false;
		String aa = String.valueOf(a);// 정수를 문자열로
		System.out.println(aa);
		String boola = String.valueOf(bool);// 불린을 문자열로
		System.out.println(boola);

		int ba = Integer.parseInt(aa);// 문자열을 정수로
		System.out.println(ba);
		double da = Double.parseDouble("3.14");// 문자열을 실수로
		System.out.println(da);

		String str1 = String.format("%d 더하기 %d는 %d", 3, 5, (3 + 5));// %d 정수
		System.out.println(str1);
		String str2 = String.format("%f 나누기 %f는 %.2f", 13.0, 15.0, (13.0 / 15.0));// %f실수 .2f소수이하 자리수
		System.out.println(str2);
	}

}
