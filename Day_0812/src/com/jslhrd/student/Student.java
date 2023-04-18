package com.jslhrd.student;

public class Student {
	private int bun;
	private String name;

	public Student() {
	}

	public Student(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	// 자신 출력 메소드
	public void studentPrint() {
		System.out.print(bun + "\t" + name + "\t");
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
