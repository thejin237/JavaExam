package com.jslhrd.exam02;

import java.util.Arrays;

// 난수( 0 ~ 1 )숫자
/* Math.random();
*/
public class Exam_02 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		/*
		 * for(int i=0;i<6;i++) { int r= (int)(Math.random()*45)+1; lotto[i]=r; }
		 * for(int i=0;i<6;i++) { int r= (int)(Math.random()*45)+1; lotto[i]=r; }
		 * System.out.println(Arrays.toString(lotto));
		 */

		for (int i = 0; i < 6; i++) {
			int r = (int) (Math.random() * 45) + 1;
			lotto[i] = r;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
