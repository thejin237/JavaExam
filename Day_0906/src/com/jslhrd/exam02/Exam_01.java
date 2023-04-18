package com.jslhrd.exam02;
// 람다식: 메소드를 하나의 식으로 표현, 익명함수
interface Test{
	void method();
}
public class Exam_01 {
	public static void main(String[] args) {
		//익명구현객체
		Test t1 = new Test() {
			@Override
			public void method() {
				System.out.println("AAAA");
			}
		};
		t1.method();
		
		//람다식
		Test t2=()->System.out.println("BBBB");
		t2.method();
	}

}
