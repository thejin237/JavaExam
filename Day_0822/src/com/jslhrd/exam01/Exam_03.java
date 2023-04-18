package com.jslhrd.exam01;

//해시코드 : 객체를 식별하는 값
class CC {
	int x;

	CC(int x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		return x;
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		CC c1 = new CC(10);
		CC c2 = new CC(20);
		CC c3 = new CC(10);

		System.out.println("c1: " + c1.hashCode());
		System.out.println("c2: " + c2.hashCode());
		System.out.println("c3: " + c3.hashCode());

		System.out.println("c1==c2 " + (c1.hashCode() == c2.hashCode()));
		System.out.println("c1==c3 " + (c1.hashCode() == c3.hashCode()));
		System.out.println("c2==c3 " + (c2.hashCode() == c3.hashCode()));
	}

}
