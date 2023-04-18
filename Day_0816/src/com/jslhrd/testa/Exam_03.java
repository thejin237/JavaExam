package com.jslhrd.testa;

class A {
	int a = 10;

	void test() {
		System.out.println("A 클래스 a = " + a);
	}

	int sum(int a, int b) {
		return a + b;
	}
}

class Ab extends A {
	// int a=100;
	void test() {// 오버라이딩: 재정의
		System.out.println("B 클래스 a = " + a);
	}

	int sum(int a, int b) {
		int s = 0;
		s = a + b;
		return s;
	}
//	int sum(int a) {//오버라이딩 아님
//		int s=0;
//		s=a+b;
//		return s;
//	}
}

public class Exam_03 {

	public static void main(String[] args) {
		A a = new A();
//		a.a=100;
		System.out.println("a=" + a.a);
		a.test();
//		a.sum(10, 20);
		Ab ab = new Ab();
//		ab.a=200;
		System.out.println("a=" + ab.a);
		ab.test();
//		ab.sum(10, 20);

	}

}
