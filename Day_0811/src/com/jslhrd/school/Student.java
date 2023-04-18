package com.jslhrd.school;

public class Student {
	private String bun;
	private String name;
	private String gender;
	private String phone;

	Student() {
	}

	Student(String bun, String name, String gender, String phone) {
		this.bun = bun;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	void stuPrint() {
		System.out.print(bun+"\t"+name+"\t");
		if(gender.equalsIgnoreCase("m")) {
			System.out.print("남자\t");
		}else {
			System.out.print("여자\t");
		}
		System.out.println(phone);
	}

	public String getBun() {
		return bun;
	}

	public void setBun(String bun) {
		this.bun = bun;
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
