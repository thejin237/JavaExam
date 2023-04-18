package com.jslhrd.school;

public class Student {
	private String hakbun;//학번
	private String name;//이름
	private String gender;//성별(M/F)
	private String phone;//연락처

	public Student() {}
	
	public Student(String hakbun, String name, String gender, String phone) {
		this.hakbun=hakbun;
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
