package com.jslhrd.exam01;

import java.util.*;

/*	Set Collection
 * 	Set -> HashSet
 * 	저장 순서가 유지되지 않는다.
 * 	객체의 중복해서 저장할 수 없다.
*/
public class Exam_02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("Java");
		set.add("1234");
		set.add("Servlet");
		set.add("3.14");
		set.add("Java");
		set.add("Oracle");
		set.add("Phython");
		set.add("Java");
		System.out.println(set);
		System.out.println("확장 for()");

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("반복자로 변환 Iterator");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

		System.out.println("List로 변환");
		List<String> list = new ArrayList(set);
		for (String str : list) {
			System.out.println(str);
		}

	}

}
