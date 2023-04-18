package com.jslhrd.testb;

class CC {
	int a = 100;

	void test() {
	}
}

class SubCC extends CC {
	final int b = 200;// final은 오버라이딩 불가

	final void method() {
	}
}

final class ChildCC extends SubCC {
	// b=10;
	// void method() {} final로 오버라이딩 불가
}
//class Test extends ChildCC{} //final로 선언된 클래스는 상속 불가

public class Exam_09 {
	public static void main(String[] args) {

	}

}
