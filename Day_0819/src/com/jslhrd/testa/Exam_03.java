package com.jslhrd.testa;
//정적 중첩
class OuterB {
	int a=10;
	static class InnerB {
		int b=10;
		void disp_in() {
			//System.out.println("a="+a);//static class내부에 사용되는 필드는 static이 되어야한다.
			System.out.println("b="+b);
		}
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		OuterB ob = new OuterB();
		//OuterB.InnerB oi = ob.new InnerB();//불가
		OuterB.InnerB oi = new OuterB.InnerB();
	}

}
