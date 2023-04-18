package com.jslhrd.testa;

class BB {
//	BB(){
//		System.out.println("BB() 생성자 호출");
//	}
	BB(int a) {
		System.out.println("BB(int a) 생성자 호출");
	}

}

class ChildBB extends BB {
	ChildBB() {
		super(100);
		System.out.println("ChildBB() 생성자 호출");
	}

	ChildBB(int a) {
		super(100);
		System.out.println("ChildBB(int a) 생성자 호출");
	}

}

public class Exam_05 {
	public static void main(String[] args) {
		// BB bb = new BB();
		ChildBB cb = new ChildBB();// BB()생성자 자동 호출: 생성자의 연속호출
	}

}
