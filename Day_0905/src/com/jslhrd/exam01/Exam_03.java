package com.jslhrd.exam01;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>();
		Person p = new Person("ssss", 30);
		set.add(p);
		set.add(new Person("ddd", 25));
		set.add(new Person("eee", 28));
		set.add(new Person("ggg", 15));
		set.add(new Person("hhh", 27));
		System.out.println(set);
	}

}
