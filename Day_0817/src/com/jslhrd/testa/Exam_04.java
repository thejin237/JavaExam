package com.jslhrd.testa;

public class Exam_04 {
	public static void main(String[] args) {
		MathExam ma = new MathTest();
		int max1 = ma.max(10, 20);
		System.out.println("max1 : " + max1);//20
		int min1 = ma.min(10, 20);
		System.out.println("min1 : " + min1);//10
		int max2 = ma.max(10, 20, 30, 40, 50);
		System.out.println("max2 : " + max2);//50
		int min2 = ma.min(10, 20, 30, 40, 50);
		System.out.println("min2 : " + min2);//10
	}

}
