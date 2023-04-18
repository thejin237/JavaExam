package com.jslhrd.exam01;

import java.util.*;

public class Exam_05 {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("A", new Student(1, "김학생"));
		map.put("D", new Student(5, "박학생"));
		map.put("E", new Student(3, "강학생"));
		map.put("B", new Student(2, "거학생"));
		map.put("C", new Student(1, "김학생"));//value 중복 가능(저장)
		map.put("C", new Student(2, "추학생"));//key 중복 불가능(저장안됨)
		System.out.println(map);

		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println(str + " : " + map.get(str));
		}
	}

}
