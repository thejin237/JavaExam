package com.jslhrd.testa;
interface Parent{
	void test();
	default void test2() {
		System.out.println("Parent의 test2()호출");
	}
}
interface SubParent extends Parent{//인터페이스 상속(interface inheritance)
	void exam();
}
class SubExam implements SubParent{//상속된 인터페이스 구현
	@Override
	public void exam() {
		System.out.println("SubExam의 exam()호출");
	}@Override
	public void test() {
		System.out.println("SubExam의 test()호출");
	}
	public void test2() {
		System.out.println("SubExam의 test2()호출");
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		Parent p = new SubExam();
		p.test();
		p.test2();
		//p.exam();//불가
		SubParent sp = new SubExam();
		sp.test2();
		sp.exam();
		sp.test();
		SubExam se = new SubExam();
		se.test2();
		se.exam();
		se.test();
	}

}
