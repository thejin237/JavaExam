package com.jslhrd.exam02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TreeSet<Sawon> tSet = new TreeSet<Sawon>();
		while (true) {
			System.out.print("입력: ");
			String str = scn.nextLine();
			StringTokenizer st = new StringTokenizer(str, ",");
			String strSabun = st.nextToken();
			if (strSabun.equals("0000")) {
				break;
			} else if (strSabun.length() != 4) {
				System.out.println("[사원번호 입력오류]");
				continue;
			}
			int sabun = Integer.parseInt(strSabun);
			String name = st.nextToken();
			String gender = st.nextToken();
			try {
				if (gender.equalsIgnoreCase("M")) {
					gender = "남자";
				} else if (gender.equalsIgnoreCase("F")) {
					gender = "여자";
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("성별 입력 오류");
				continue;
			}
			String birth = st.nextToken();
//			DataFormet df = new SimpleDateFormat("yyyyMMdd");
//			Date date = df.parse(birth); 
			int age = 2022 - Integer.parseInt(birth.substring(0, 4));
			boolean add = tSet.add(new Sawon(sabun, name, gender, birth, age));
			if (!add) {
				System.out.println("[이미 등록된 사원입니다.]");
			}
		}
		scn.close();

		// Print
		System.out.println("사원번호 오름차순");
		System.out.println("사번\t이름\t성별\t생년월일\t나이");
		for (Sawon sawon : tSet) {
			System.out.println(sawon);
		}

	}

}
