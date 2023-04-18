package com.jslhrd.exam02;
public class Student implements Comparable<Student>{
	private int bun;
	private String name;
	private int age;
	
	public Student() {
	}

	public Student(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return bun+":"+name+":"+age;
	}
/*	
	//Integer Sort 
	@Override
	public int compareTo(Student o) {
		//return Integer.compare(bun, o.bun); //Ascending
		return Integer.compare(o.bun, bun); //Descending
	}
*/
	//String Sort
	@Override
	public int compareTo(Student o) {
		//return name.comparTo(o,name); //Ascending
		return name.compareTo(o.name); //Descending
	}
	
}
