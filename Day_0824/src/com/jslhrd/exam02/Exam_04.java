package com.jslhrd.exam02;

import java.util.Random;

public class Exam_04 {

	public static void main(String[] args) {
		Random r = new Random();
		//Random r1 = new Random(Seed);//Seed값으로 난수값을 알 수 있다.(반복실행에도 난수값이 고정됨)
		for(int i=0; i<6; i++) {
			int num = r.nextInt(45);// 0~44 까지 난수
			System.out.println(num);
		}
		
//		System.out.println(r.nextInt());
//		System.out.println(r.nextDouble());
	}

}
