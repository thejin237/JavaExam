package com.jslhrd.testa;

interface AA {
	static final int MAX = 100;// 상수(CONSTANT), 사용빈도 높음

	abstract void test();// 추상 메소드, abstract키워드 생략 가능, 사용빈도 높음

	void exam(int a, int b);// abstract 가 있는 것으로 인식

	default void method() {// default method 사용 빈도 낮음

	}

	static void print() {// static method version 1.8이후 추가, 사용빈도 낮음

	}
}

class AA_A implements AA {// AA interface를 구현(implement)한 클래스(구현객체)
	@Override
	public void exam(int a, int b) {

	}

	@Override
	public void test() {

	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA_A a1 = new AA_A();
		a1.exam(1, 1);//abstract method
		a1.test();//default method
		a1.method();//abstract method
		AA.print();//static method
	}

}
