package com.jslhrd.exam01;

import java.util.*;

public class main {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		Person p = new Person("고학생", 30);
		System.out.println(p);
		set.add(p);
		set.add(new Person("김학생", 25));
		set.add(new Person("이학생", 35));
		set.add(new Person("박학생", 15));
		set.add(new Person("강학생", 27));
		set.add(new Person("나학생", 28));

		System.out.println(set);
		System.out.println("나이가 가장 많은 학생: " + set.last());// treeSet의 기능, 나이순 정렬(Comparable)하여 마지막값 출력
		System.out.println("나이가 가장 적은 학생: " + set.first());

	}

}
