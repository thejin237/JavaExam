package com.jslhrd.exam02;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		Member[] member = new Member[10];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("자료입력" + (cnt + 1) + ":");
			String[] input = scn.nextLine().split(",");
			if (input[0].equals("end"))
				break;
			member[cnt] = new Member(input[0], input[1], input[2]);
			cnt++;
		}

		MemberData mData = new MemberData(member, cnt);
		mData.memberPrint();

	}

}
