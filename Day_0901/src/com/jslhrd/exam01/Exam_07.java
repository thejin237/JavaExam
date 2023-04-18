package com.jslhrd.exam01;

import java.util.*;

public class Exam_07 {
	// Set Lotto
	static void setLotto() {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println("Set Lotto : " + set);
	}

	static void setLotto2() {
		Set<String> set = new HashSet<>();
		for (int i = 1; i <= 45; i++) {
			set.add(new Integer(i) + "");
		}
		System.out.print("Set Lotto2 : ");
		int cnt = 0;
		for (String r : set) {
			System.out.print(r + "\t");
			cnt++;
			if (cnt == 6) {
				break;
			}
		}
		System.out.println();
	}

	// List Lotto
	static void listLotto() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}
		// 리스트안의 내용을 섞어주기
		Collections.shuffle(list);

		System.out.print("List Lotto : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();

	}

	static void listLotto2() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; list.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			list.add(num);
		}
		System.out.println("List Lotto2 : " + list);

	}

	public static void main(String[] args) {
		setLotto();
		setLotto2();
		listLotto();
		listLotto2();
	}

}
