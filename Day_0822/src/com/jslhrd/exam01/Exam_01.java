package com.jslhrd.exam01;

class AA {
	int x = 10;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AA) {
			return true;
		} else {
			return false;
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();

		System.out.println("a1=" + a1);
		System.out.println("a2=" + a2);
		System.out.println("a1==a2 : " + (a1 == a2));
		System.out.println("a1equals(a2) : " + (a1.equals(a2)));
	}

}
