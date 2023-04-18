package com.jslhrd.exam01;

public class User {
	private int bun;
	private String name;
	private int age;

	public User() {
	}

	public User(int bun, String name, int age) {
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
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User aa = (User) obj;
			return bun == aa.bun && name.equals(aa.name);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return bun + "," + name + "," + age;
	}

	@Override
	public int hashCode() {
		return bun + name.hashCode();
	}

}
