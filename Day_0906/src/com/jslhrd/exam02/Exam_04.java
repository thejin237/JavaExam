package com.jslhrd.exam02;
@FunctionalInterface
interface BBB{
	int method(int x, int y);
}
public class Exam_04 {

	public static void main(String[] args) {
		BBB bb;
		bb= (x,y)->{
			int result = x+y;
			return result;
		};
		int sum = bb.method(10, 20);
		System.out.println("sum: " + sum);
		
		bb=(x,y)->{return x+y;};
		System.out.println("sum: " + bb.method(100, 200));
		
		bb=(x, y)->x+y;
		System.out.println("sum: " + bb.method(250, 125));
		
	}

}
