package com.jslhrd.exam01;

public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;

	Student() {
	}

	Student(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
	}

	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot;
	}

}
