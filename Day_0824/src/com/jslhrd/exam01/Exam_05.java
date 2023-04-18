package com.jslhrd.exam01;

import java.util.Scanner;

/*10진수를 2진수로 변환
*/
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();//16
		while(true) {
			System.out.print("10진수 입력:");
			int dec = scn.nextInt();
			if(dec==0) break;
			sb.delete(0,sb.length());//버퍼 비우기
			int mok=dec;//몫
			int nmg;//나머지
			while(mok>0) {
				nmg=mok%2;
				//sb.append(nmg);
				mok=mok/2;
				sb.insert(0, nmg);//0번째 나머지를 문자열에 삽입
			}
			//sb.reverse(); //append 사용 시 문자열 뒤집기.
			System.out.println(sb.toString());
		}
	}

}
