package com.jslhrd.testa;
interface BB{
	void test();
}
interface CC{
	void exam();
}

class CCC implements BB, CC{//다중 인터페이스 구현
	@Override
	public void exam() {
		// TODO Auto-generated method stub
		
	}@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
public class Exam_03 {

	public static void main(String[] args) {
		BB b = new CCC();
		b.test();
		//b.exam(); //불가
		CC c = new CCC();
		c.exam();
		//c.test(); //불가
		CCC cc = new CCC(); //다중 인터페이스 구현객체
		cc.test();
		cc.exam();
	}

}
