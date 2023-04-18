package com.jslhrd.exam01;

//기본타입=> 문자열(String)로 변환
public class Exam_01 {
	public static void main(String[] args) {
		int a = 100;
		char c = 'A';
		boolean b = true;
		double d = 3.14;

		String strA = a + "";// int => String 변환 100 => "100"
		String strA1 = String.valueOf(a);// int => String
		String strC = String.valueOf(c);// 'A' => "A"
		String strb = String.valueOf(b);// true => "true"
		System.out.println(strb);

	}

}
