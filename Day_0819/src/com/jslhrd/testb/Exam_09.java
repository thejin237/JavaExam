package com.jslhrd.testb;

public class Exam_09 {
//JVM(자바가상머신)에게 예외처리를 미룬다(떠넘긴다)
//main 메소드는 JVM에서 호출한다.
	public static void main(String[] args) throws Exception {
		System.out.println("1문자 입력:");
		int ch = System.in.read();
		
		System.out.println("입력된 문자는 "+(char)ch);
	}

}
