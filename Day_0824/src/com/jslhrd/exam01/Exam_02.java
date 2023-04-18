package com.jslhrd.exam01;

//Wrapper(래퍼 클래스)==포장
//기본자료형(byte, char, int, long, float, double, boolean)
//포장클래스(Byte, Character, Integer, Long, Float, Double, Boolean)
public class Exam_02 {
	public static void main(String[] args) {
		int a = 100;
		Integer aa = 100;// 오토 박싱(Auto Boxing) aa는 참조변수
		// Integer aa = new Integer(a);//박싱(Boxing)
		int aaa = aa;// 언박싱(Unboxing)

		String str = String.valueOf(100);// 정수를 문자열로
		String str1 = Integer.toBinaryString(100);//

		int s = Integer.parseInt(str1);// String => Int
		int sss = Integer.valueOf(str1);
		double ss = Double.parseDouble("3.14");
	}

}
