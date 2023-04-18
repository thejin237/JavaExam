package com.jslhrd.exam02;

public class Sawon implements Comparable<Sawon> {
	private int sabun;
	private String name;
	private String gender;
	private String birth;
	private int age;

	public Sawon() {
	}

	public Sawon(int sabun, String name, String gender, String birth, int age) {
		this.sabun = sabun;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.age = age;
	}

	@Override
	public int compareTo(Sawon o) {
		return Integer.compare(sabun, o.sabun);
	}

	@Override
	public String toString() {
		return sabun + "\t" + name + "\t" + gender + "\t" + birth + "\t" + age;
	}
}
