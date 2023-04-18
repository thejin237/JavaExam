package com.jslhrd.testa;

//클래스 다이어그램 접근제어 기호
/* +: public
 * -: protected
 * 	: default
 * #: private
 * 
 * instanceof: 연산자(같은 객체인지를 비교하는 연산자)
 * 개체변수 instanceof 타입(클래스)
*/
class Super {
	int a = 10;
}

class Child extends Super {
	int b = 20;
}

public class Exam_01 {

	public static void main(String[] args) {
		Super su = new Super();
		// Child ch = new Child();
		Super ch = new Child(); // 업캐스팅(형변환)
		// Child c = (Child) new Super();//다운캐스팅처럼 보이나 런타임 오류가 남
		Child c = (Child) ch;// 다운캐스팅
		test(su);
		test(ch);

	}

	static void test(Super suA) {
		if (suA instanceof Child) {
			Child ch = (Child) suA;
			System.out.println("Child 변환 성공");
		} else {
			System.out.println("Chiold 변환 불가");
		}
	}

	static void testA(Super suA) {
		Child ch = (Child) suA;
		System.out.println("Child 변환 성공");
	}

}
