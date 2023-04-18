package com.jslhrd.exam01;

import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Set<User> userSet = new HashSet<User>();
		User user = null;
		while (true) {
			System.out.print("사원등록:");
			int bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			String name = scn.next();
			int age = scn.nextInt();
			user = new User(bun, name, age);
/*
*			boolean flag = userSet.contains(user);
*			if(flag) {
*				System.out.println("중복된 사원");
*			}else {
*				userSet.add(user);
*			}
*/
			boolean flag = userSet.add(user);
			if (!flag) {
				System.out.println("중복된 사원");
			}
		}
		System.out.println("출력 테스트");
		System.out.println(userSet);
	}

}
