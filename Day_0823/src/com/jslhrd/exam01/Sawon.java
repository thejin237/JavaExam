package com.jslhrd.exam01;

public class Sawon {
	private int sabun;
	private String name;
	private String birth;
	private String gender;
	private int pay;

	public Sawon() {
	}

	public Sawon(int sabun, String name, String birth, String gender, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.pay = pay;
	}
//	@Override
//	public String toString() {
//		return sabun+"\t"+name+"\t"+birth+"\t"+gender+"\t"+pay;
//	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
