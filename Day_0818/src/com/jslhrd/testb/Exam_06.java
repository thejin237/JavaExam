package com.jslhrd.testb;
interface InterA{
	void test_01();
	void test_02();
}
class ExamA implements InterA{
	@Override
	public void test_01() {}
	@Override
	public void test_02() {}
}
public class Exam_06 {
	public static void main(String[] args) {
		InterA aa = new ExamA();
		//익명구현 객체
		InterA bb = new InterA(){
			@Override
			public void test_01() {}
			@Override
			public void test_02() {}
			//void test() {}//익명구현 객체에서 새로운 메소드 선언 불가
		};
		bb.test_01();
		bb.test_02();
		//bb.test();//불가
	}

}
