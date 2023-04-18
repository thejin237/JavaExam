package com.jslhrd.exam01;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

//	@Override
//	public int compareTo(Person o) {
//		return name.compareTo(o.name);
//	}
	@Override
	public int compareTo(Person o) {
		return Integer.compare(age, o.age);
	}

}
