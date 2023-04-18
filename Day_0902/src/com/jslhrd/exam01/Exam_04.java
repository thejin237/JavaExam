package com.jslhrd.exam01;

import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Map<String, String> uMap = new HashMap<String, String>();
		uMap.put("java", "1234");
		uMap.put("user", "4232");
		uMap.put("test", "2222");
		uMap.put("admin", "3333");
		uMap.put("anony", "1111");

		Scanner scn = new Scanner(System.in);
		System.out.print("ID 입력:");
		String id = scn.next();
		System.out.print("비번 입력:");
		String pw = scn.next();

		if (uMap.containsKey(id)) {
			if (uMap.get(id).equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비번오류");
			}
		} else {
			System.out.println("아이디 없음");
		}
	}

}
