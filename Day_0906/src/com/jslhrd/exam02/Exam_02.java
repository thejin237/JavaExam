package com.jslhrd.exam02;
interface Exam{
	int sum(int a, int b);
}
public class Exam_02 {

	public static void main(String[] args) {
		//익명구현객체
		Exam ex = new Exam(){
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
		};
		int aa = ex.sum(10, 20);
		System.out.println("aa="+aa);
		
		Exam ex1=(a,b)->{
			return a+b;
		};
		System.out.println(ex1.sum(100,200));
		
	}

}
