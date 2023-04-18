package com.jslhrd.exam01;

class Person {
	int bun;
	String name;
	int age;

	Person() {
	}

	Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return bun == p.bun && name.equals(p.name);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return bun + name.hashCode();
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		Person p1 = new Person(1, "김학생", 30);
		Person p2 = new Person(1, "장학생", 25);
		Person p3 = new Person(1, "김학생", 20);

		// equals(): 번호와 이름이 같으면 같은 학생으로 같주한다.

		/*
		 * if(p1.bun==p2.bun && p1.name.equals(p2.name)) {
		 * System.out.println("p1,p2는 같은 학생입니다."); }else {
		 * System.out.println("p1,p2는 다른 학생입니다."); }
		 */
		if (p1.equals(p2)) {
			System.out.println("p1,p2는 같은 학생입니다.");
		} else {
			System.out.println("p1,p2는 다른 학생입니다.");
		}
		if (p1.equals(p3)) {
			System.out.println("p1,p3는 같은 학생입니다.");
		} else {
			System.out.println("p1,p3는 다른 학생입니다.");
		}
		if (p2.equals(p3)) {
			System.out.println("p2,p3는 같은 학생입니다.");
		} else {
			System.out.println("p2,p3는 다른 학생입니다.");
		}

		// hashCode():
		if (p1.hashCode() == p2.hashCode()) {
			System.out.println("p1,p2는 같은 학생입니다.");
		} else {
			System.out.println("p1,p2는 다른 학생입니다.");
		}
		if (p1.hashCode() == p3.hashCode()) {
			System.out.println("p1,p3는 같은 학생입니다.");
		} else {
			System.out.println("p1,p3는 다른 학생입니다.");
		}
		if (p2.hashCode() == p3.hashCode()) {
			System.out.println("p2,p3는 같은 학생입니다.");
		} else {
			System.out.println("p2,p3는 다른 학생입니다.");
		}
	}

}
