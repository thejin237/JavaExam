package com.jslhrd.testc;
//http://docs.oracle.com/javase/8/docs/api/index.html
//자바상세정보 검색

public class Exam_10 {
	public static void main(String[] args) {
		String str = "12345Korea"+"234"; //배열처럼 인덱스를 가진다.
		int len = str.length();//문자열의 길이
		for(int i=0; i<len;i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

}
