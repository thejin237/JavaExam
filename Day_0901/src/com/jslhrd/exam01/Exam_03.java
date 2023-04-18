package com.jslhrd.exam01;

import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		String str = "김학생";
		boolean bool = set.add(str);
		if (bool) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		str = "김학생";
		bool = set.add(str);
		if (bool) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
	}

}
