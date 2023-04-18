package com.jslhrd.exam02;

public class Exam_01 {

	public static void main(String[] args) {
		int m = Math.max(10, 20);// Math.max는 두개의 값만 가능, 3개 이상은 별도의 메소드 작성필요
		Math.abs(7 - 9);// 2
		System.out.println(16 / 7.);
		System.out.println(Math.round(16 / 7.));// round();소수 첫째자리 반올림
		System.out.println(Math.floor(16 / 7.));// floor();소수 첫째자리 버림
		System.out.println(Math.ceil(16 / 7.));// ceil();소수 첫째자리 올림
	}

}
