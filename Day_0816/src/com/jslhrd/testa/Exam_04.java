package com.jslhrd.testa;

//this.super
class AA {
	int a = 10;

	void test() {
		System.out.println("AA 클래스 a = " + a);
	}
}

class SubAA extends AA {
	int a = 100;

	void test() {// overriding
		super.test();
		System.out.println("SubAA 클래스 a = " + a);
	}

	void method() {
		System.out.println("SubAA 클래스 a =" + a);
		System.out.println("SubAA 클래스 a =" + super.a);
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		SubAA s = new SubAA();
		s.method();
		s.test();
	}

}
