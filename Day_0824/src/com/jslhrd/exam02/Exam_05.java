package com.jslhrd.exam02;

import java.util.StringTokenizer;

public class Exam_05 {

	public static void main(String[] args) {
		String str = "1111-2222/3333/4444-5555/6666"; // 토큰(문자열분리자): "-","/"
		String[] sVar = str.split("-");
		for (int i = 0; i < sVar.length; i++) {
			System.out.println(sVar[i]);
		}
		StringTokenizer st = new StringTokenizer(str, "-/");
		int count = st.countTokens();
		System.out.println("count: " + count);
/*
 		while(st.hasMoreTokens()) {
 			System.out.println(st.nextToken());
 		}
*/		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		String s5 = st.nextToken();
		String s6 = st.nextToken();
		//String s7 = st.nextToken();//Error
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}
