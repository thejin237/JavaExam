package com.jslhrd.testa;

/* 상속: 멤버 변수, 메소드 물려 받아서 새로운 클래스 생성
 * -접근제어 private 접근 제한을 갖는 필드와 메소드는 상속에서 제외
 * -extends 키워드 사용
 * -다중 상속 불가
*/
class Super {
	int a = 10;

	void test() {
		System.out.println("a=" + a);
	}
}

class Child extends Super {
	int b = 20;

	void method() {
		System.out.println("b=" + b);
	}
}

class ChildSup extends Super {

}

//class ChildSup extends Child{}
//class ChildSup extends Super, Child{} //다중상속 불가능
public class Exam_01 {

	public static void main(String[] args) {
		Super p = new Super();
		System.out.println("a=" + p.a);
		p.a = 200;
		p.test();

		Child ch = new Child();
		System.out.println("a=" + ch.a);
		ch.a = 180;
		ch.test();

		System.out.println("b=" + ch.b);
		ch.b = 300;
		ch.method();
	}

}
