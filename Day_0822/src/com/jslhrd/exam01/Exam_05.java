package com.jslhrd.exam01;

class EE {
	private int bun;
	private String name;
	private int score;

	EE() {
	}

	EE(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + score;
	}

	public void print() {
		System.out.println(bun + "\t" + name + "\t" + score);
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		EE e1 = new EE(1, "김학생", 90);
		System.out.println(e1);
		e1.print();
	}

}
