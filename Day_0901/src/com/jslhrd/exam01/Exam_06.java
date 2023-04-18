package com.jslhrd.exam01;

import java.util.HashSet;
import java.util.Set;

public class Exam_06 {
	public static void main(String[] args) {
		// 해시코드 비교
		System.out.println("Java".hashCode());
		System.out.println("Java".hashCode());// 같은 String 객체는 같은 해시코드를 갖는다.
		System.out.println("java".hashCode());
		System.out.println("20".hashCode());
		System.out.println("0".hashCode());
		System.out.println("10".hashCode());
		System.out.println("a".hashCode());// hashCode()==ASCII(97)
		System.out.println("b".hashCode());// hashCode()==ASCII(98)
		Integer u1 = new Integer(20);
		Integer u2 = new Integer(20);
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(u1);
		set.add(u2);
		System.out.println(set);
	}

}
