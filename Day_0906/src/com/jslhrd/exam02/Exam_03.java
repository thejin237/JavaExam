package com.jslhrd.exam02;
//함수적 인터페이스: 인터페이스에 오직 1개의 메소드만 존재하는 것
@FunctionalInterface //어노테이션을 붙여주면 함수적 인터페이스인지 검증해준다.
interface AA{
	void aaa();
	//int bbb(); 함수적 인터페이스는 메소드는 1개만 존재해야 하므로 불가
}
public class Exam_03 {
	public static void main(String[] args) {
		AA a;
		a=()->System.out.println("AAAA");
		a.aaa();
		
		a=()->{
			int s=100;
			System.out.println("a="+s);
		};
		a.aaa();
	}

}
