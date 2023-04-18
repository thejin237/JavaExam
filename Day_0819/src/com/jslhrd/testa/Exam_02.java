package com.jslhrd.testa;

class OuterA {
	int x = 100;
	private int a = 100;

	OuterA() {
	}

	void disp() {
		System.out.println("x=" + x);
		System.out.println("a=" + a);
	}

	class InnerA {//중첩(Inner)클래스
		private int b = 10;

		void disp_in() {
			System.out.println("x=" + x);
			System.out.println("a=" + a);
			System.out.println("b=" + b);
		}
	}

}

public class Exam_02 {
	public static void main(String[] args) {
		OuterA oa = new OuterA();
		oa.disp();
		System.out.println("----------------");
		OuterA.InnerA oia = oa.new InnerA();
		oia.disp_in();
		System.out.println("----------------");
		OuterA.InnerA oia2 = new OuterA().new InnerA();
		oia2.disp_in();
	}

}
