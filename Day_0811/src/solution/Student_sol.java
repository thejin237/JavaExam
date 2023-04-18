package solution;
public class Student_sol {
	private String hakbun;//학번
	private String name;//이름
	private String gender;//성별(M/F)
	private String phone;//연락처

	public Student_sol() {}
	
	public Student_sol(String hakbun, String name, String gender, String phone) {
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

	public void stuPrint() {
		System.out.print(hakbun + "\t");
		System.out.print(name + "\t");
		if(gender.equalsIgnoreCase("m")) {
			System.out.print("남자" + "\t");
		}else {
			System.out.print("여자" + "\t");
		}
		System.out.print(phone + "\n");
	}
}
