package com.jslhrd.exam02;

import java.util.Scanner;

@FunctionalInterface
interface MaxScore{
	int maxScore(int[] score);
}
public class Exam_06 {

	public static void main(String[] args) {
		//키보드로 7개의 정수를 입력 최대값을 구하여 출력
		Scanner scn = new Scanner(System.in);
		int[] score = new int[7];
		for(int i = 0; i<score.length;i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			score[i]=scn.nextInt();
		}
		scn.close();
		
		//람다식 정의 및 구현
		MaxScore ms;
		ms=(score2)->{
			int max = score[0];
			for(int i = 1;i<score.length-1;i++) {
				if(max<score[i]) {
					max = score[i];
				}
			}
			return max;
		};
		System.out.println("최대값:" + ms.maxScore(score));
		
	}

}
