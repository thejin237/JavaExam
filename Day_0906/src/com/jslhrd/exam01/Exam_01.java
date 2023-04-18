package com.jslhrd.exam01;
//Single Thread
class AAA {
	void run() {
		for(int i = 1; i<=10;i++) {
			System.out.println("AAA : " + i);
		}
	}
}
class BBB{
	void run() {
		for(int i = 1; i<=10;i++) {
			System.out.println("BBB : " + i);
		}
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		AAA a = new AAA();
		BBB b = new BBB();
		a.run();
		b.run();
	}

}
