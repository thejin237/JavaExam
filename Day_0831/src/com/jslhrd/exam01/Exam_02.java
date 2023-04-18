package com.jslhrd.exam01;

import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);// 0
		list.add(20);// 1
		list.add(10);// 2
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int a = (int) list.get(i);
			System.out.println(a);
		}

	}
}
