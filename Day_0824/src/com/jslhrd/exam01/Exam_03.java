package com.jslhrd.exam01;
//String: 정적인 문자열 처리
//StringBuffer(스레드 지원), StringBuilder: 동적인 문자열 처리
public class Exam_03 {
	public static void main(String[] args) {
		String str="";
		for(char ch = 'A'; ch<='Z';ch++) {
			//A부터 Z까지 1문자씩 추가하면서 객체가 생성(메모리 낭비)
			str = str + ch;
		}
		System.out.println(str);
		
		StringBuffer sb1 = new StringBuffer();//기본 16자 공간 확보후 동적 자동조정
		System.out.println("물리적 공간1: "+sb1.capacity());
		System.out.println("물리적 길이1: "+sb1.length());
		int n = 50;
		StringBuffer sb2 = new StringBuffer(n);//기본 n자 공간 확보후 동적 자동조정
		System.out.println("물리적 공간2: "+sb2.capacity());
		System.out.println("물리적 길이2: "+sb2.length());
		StringBuffer sb3 = new StringBuffer("Korea");
		System.out.println("물리적 공간3: "+sb3.capacity());
		System.out.println("물리적 길이3: "+sb3.length());
		
	}

}
