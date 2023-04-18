package com.jslhrd.exam01;
public class Student {
	int bun;
	String name;
	public Student() {}
	public Student(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			return bun==stu.bun && name.equals(stu.name);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return bun+name.hashCode();
	}
	
	@Override
	public String toString() {
		return bun+","+name;
	}
	
}
