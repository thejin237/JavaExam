package com.jslhrd.testa;

class Parent {
	private int a = 10;
	int x = 10;

	private void exam_01() {
		System.out.println("a=" + a);
	}

	void exam_02() {
		System.out.println("x=" + x);
	}
}

class ChildParent extends Parent {
	private int b = 20;
	int y = 20;

	private void method_01() {
		// System.out.println("a="+a); //상속 제외된 멤버변수a 사용 불가
		System.out.println("x=" + x);
		System.out.println("b=" + b);
		System.out.println("y=" + y);
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		Parent p = new Parent();
		// p.a=100;
		p.x = 100;
		// p.exam_01();
		p.exam_02();

		ChildParent c = new ChildParent();
		// c.b=100;
		c.y = 100;
		c.x = 100;
		// c.method_01();

	}

}
