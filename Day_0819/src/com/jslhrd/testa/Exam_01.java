package com.jslhrd.testa;
/* 4대 중첩클래스
 * 1. 중첩(Inner) 클래스
 * 2. 정적 중첩(Static Inner)
 * 3. 지역 중첩(Local Inner)
 * 4. 익명 중첩(Anonymous Inner)
*/
class Outer{
	class Inner{//중첩클래스: 클래스의 관리 간소화
		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi1 = o.new Inner(); //중첩클래스의 개체생성1
		
		Outer.Inner oi2 = new Outer().new Inner();//중첩클래스의 개체생성 2
	}

}
