package com.jslhrd.exam01;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Sawon[] sawon = new Sawon[10];
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		while (cnt < 10) {
			System.out.print("사원등록:");
			String[] input = scn.nextLine().split(",");
			if (input[0].equals("9999"))
				break;
			sawon[cnt] = new Sawon(Integer.parseInt(input[0]), input[1], input[2], input[3],
					Integer.parseInt(input[4]));
			cnt++;
		}
		SawonData data = new SawonData(sawon, cnt);

		data.sawonPrint();

		// Output test
//		System.out.println("사번\t이름\t생년월일\t성별\t급여");
//		for(int i=0; i<cnt;i++) {
//			System.out.print(sawon[i].getSabun()+"\t");
//			System.out.print(sawon[i].getName()+"\t");
//			System.out.print(sawon[i].getBirth()+"\t");
//			System.out.print(sawon[i].getGender()+"\t");
//			System.out.print(sawon[i].getPay()+"\t");
//			//System.out.println(sawon[i]);//toString 오버라이딩했을 경우
//		}
	}

}
