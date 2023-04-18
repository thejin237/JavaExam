package com.jslhrd.exam02;

public class Member {
	private String name;// 이름
	private String birth;// 생년월일
	private String phone;// 전화
	private String gender;// 성별
	private int age;// 나이

	public Member() {
	}

	public Member(String name, String birth, String phone) {
		this.name = name;
		this.birth = birth;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
