package com.jslhrd.student;

public class Student {
	private String bun;
	private String name;
	private String gender;
	private int score;

	public Student() {
	}

	public void stuPrint() {
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		if (gender.equalsIgnoreCase("m")) {
			System.out.print("남자\t");
		} else {
			System.out.print("여자\t");
		}
		System.out.println(score + "\t");
	}

	String getBun() {
		return bun;
	}

	void setBun(String bun) {
		this.bun = bun;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	int getScore() {
		return score;
	}

	void setScore(int score) {
		this.score = score;
	}

}
