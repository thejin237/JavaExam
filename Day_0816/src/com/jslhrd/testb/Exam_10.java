package com.jslhrd.testb;

class Parent {

}

class Child extends Parent {

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}

class Child3 extends Parent {

}

class Child4 extends Parent {

}

class Child5 extends Parent {

}

public class Exam_10 {

	public static void main(String[] args) {
		// 객체 생성
		Parent p = new Parent();

		Child ch = new Child();
		Parent p1 = new Child();// 업케스팅(형변환) / 자동형변환
		// Child ch2 = (Child)p; //컴파일 오류 없으나 실행시 오류 runtime error(런타임 오류)
		// Child ch1 = new Parent(); //부모객체 생성 불가
		Child ch2 = (Child) p1;// 다운 케스팅: 업케스팅된 것을 원래형태로 케스팅하는 것 / 수동형변환

		// 업케스팅의 활용(장점) 하나의 상위 객체로 여러 상속개체를 생성 및 관리 할 수 있다.
		p1 = new Child1();// 업케스팅(형변환)
		p1 = new Child2();// 업케스팅(형변환)
		p1 = new Child3();// 업케스팅(형변환)
		p1 = new Child4();// 업케스팅(형변환)
		p1 = new Child5();// 업케스팅(형변환)
	}

}
