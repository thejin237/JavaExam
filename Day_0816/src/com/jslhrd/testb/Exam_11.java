package com.jslhrd.testb;

class AA {
	int a = 100;

	void test() {
		System.out.println("AA_test() a = " + a);
	}
	void method() {
		System.out.println("AA_method()");
	}
}

class AA_1 extends AA {
	int b = 200;
	void test() {//오버라이딩(Overriding)
		System.out.println("AA test() a="+a);
		System.out.println("AA_1 test() b="+b);
	}
	void exam() {
		System.out.println("AA_1 exam()");
	}
	
}

public class Exam_11 {

	public static void main(String[] args) {
		AA aa = new AA();
		aa.a=1000;
		aa.test();
		aa.method();
		
		AA_1 aa1 = new AA_1();
		aa1.a=1001;
		aa1.b=2000;
		aa1.test();//오버라이딩된 AA_1 메소드
		aa1.method();
		aa1.exam();
		
		AA aaa = new AA_1();//상위 클래스로 하위 객체 생성 / 업케스팅
		aaa.a=1000;
		//aaa.b=3000;
		aaa.test();//오버라이딩된 AA_1 메소드
		aaa.method();//상위객체 메소드
		//aaa.exam();
		
		AA_1 aaa1 = (AA_1)aaa;
		//AA_1 aaa2 = (AA_1)new AA();//#런타임 오류
		aaa1.a=1003;
		aaa1.b=2000;
		aaa1.test();
		aaa1.method();
		aaa1.exam();
	}

}
