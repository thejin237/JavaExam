package com.jslhrd.testa;
//지역 중첩
class OuterC{
	void disp() {
		class InnerC{//지역 중첩 클래스(메소드 내에 클래스 선언)
			void disp_in() {}
		}
		InnerC ic = new InnerC();//메소드 내에서 개체 생성
		ic.disp_in();
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		OuterC ot = new OuterC();
		//OuterC.InnerC oi = ot.new InnerC();//외부에서 개체 생성 불가
		ot.disp();//메소드 호출하면 개체가 생성된다.
	}

}
