package com.jslhrd.testa;

/* 추상 클래스: 미완성 설계도 --> **객체 생성 불가**
 * 1. 1개이상의 추상 메소드가 있는 경우 추상 클래스로 정의
 * 2. 추상메소드 : 몸체가 없는 메소드
*/
abstract class AA {//추상(abstract) 클래스 선언
	int a;
	
	abstract void print(); //추상 메소드의 예
	abstract int sum(int a, int b);//abstract 추상메소드 선언
	
	void print1() {
		System.out.print("a=" + a);
	}
}

class AA_a extends AA{
	int b  = 100;//추가적인 멤버변수 선언 가능
	@Override//어노테이션
	int sum(int a, int b) {
		int s=0;
		for(int i=a;i<=b;i++) {
			s+=i;
		}
		return s;
	}@Override
	void print() {
		
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		//AA a = new AA();//불가
		AA a = new AA_a();
		a.print();
		a.sum(1, 10);
		
		AA_a aa = new AA_a();
		aa.print();
		aa.sum(1, 10);
	}

}
