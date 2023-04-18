package com.jslhrd.exam02;

public class Student implements Comparable<Student>{
	private int hakbun;
	private String name;

	public Student() {
	}

	public Student(int hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return hakbun == stu.hakbun && name.equals(stu.name);
		}
		return false;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(hakbun, o.getHakbun());
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return hakbun + name.hashCode();
	}

	@Override
	public String toString() {
		return hakbun + ":" + name;
	}

}
