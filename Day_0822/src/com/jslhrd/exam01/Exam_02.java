package com.jslhrd.exam01;

class BB {
	int x;

	BB(int x) {
		this.x = x;
	}

	@Override
	public boolean equals(Object obj) {// BB클래스 입력시 Object로 업케스팅
//		if (obj instanceof BB){
//			return true;
//		}else {
//			return false;
//		}
		if (obj instanceof BB) {
//			BB bb = (BB)obj;
//			return x==bb.x;
			return x == ((BB) obj).x;
		} else {
			return false;
		}
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		BB b1 = new BB(20);
		BB b2 = new BB(20);
		BB b3 = new BB(30);

		// System.out.println("b1==b2"+(b1==b2));
		System.out.println("b1equals(b2) : " + b1.equals(b2));
		System.out.println("b1equals(b2) : " + b1.equals(b3));
		System.out.println("b1equals(b2) : " + b2.equals(b3));
	}

}
