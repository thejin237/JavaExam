package com.jslhrd.testa;

abstract class Person {
	String name;
	boolean gender;
	int age;

	Person(String name, boolean gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	abstract void namePrint();

	abstract String getGender();
}

class ExamPerson extends Person {
	ExamPerson(String name, boolean gender, int age){
		super(name,gender,age);
	}
	
	@Override
	void namePrint() {
		System.out.println("이름: "+name);
	}@Override
	String getGender() {
/*		if(gender) {
			return "남자";
		}else {
			return "여자";
		}*/
		String gender = (this.gender)?"남자":"여자";
		return gender;
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Person p = new ExamPerson("이학생", false, 34);
		p.namePrint();
		String gender = p.getGender();
		System.out.println("이학생은 " + gender + " 입니다");
	}

}
