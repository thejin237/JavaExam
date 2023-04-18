package com.jslhrd.testb;
//throw : 예외를 발생시킨다.
//throws : 예외 미루기(떠넘기기)
public class Exam_08 {
	static void exp(int ptr) throws Exception{
		if(ptr==0) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		try {
			exp(0);
		}catch(Exception e){
			
		}
	}

}
