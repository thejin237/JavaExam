package com.jslhrd.exam01;

public class SawonData {
	Sawon[] sawon;
	int cnt;

	public SawonData() {
	}

	public SawonData(Sawon[] sawon, int cnt) {
		this.sawon = sawon;
		this.cnt = cnt;
	}

	// Add method
	public String getBirth(String birth) {
		String strY = birth.substring(0, 4);
		String strM = birth.substring(4, 6);
		String strD = birth.substring(6, 8);
		return strY + "년" + strM + "월" + strD + "일";
	}

	public String getGender(String gender) {
		if(gender.equalsIgnoreCase("m")) {
			return "남자";
		}else {
			return "여자";
		}
	}

	public int age(String birth) {
		String strY = birth.substring(0, 4);
		int age = 2022 - Integer.parseInt(strY);
		return age;
	}

	public void sawonPrint() {
		System.out.println("사번\t이름\t생년월일\t나이\t성별\t급여");
		for (int i = 0; i < cnt; i++) {
			System.out.print(sawon[i].getSabun() + "\t" + sawon[i].getName() + "\t");
//			String strY = sawon[i].getBirth().substring(0, 4);
//			String strM = sawon[i].getBirth().substring(4, 6);
//			String strD = sawon[i].getBirth().substring(6, 8);
//			System.out.print(strY + "년" + strM + "월" + strD + "일\t");
//			int age = 2022 - Integer.parseInt(strY);
			System.out.print(getBirth(sawon[i].getBirth()) + "\t");
			System.out.print(age(sawon[i].getBirth()) + "\t");
//			if (sawon[i].getGender().equalsIgnoreCase("m")) {
//				System.out.print("남자\t");
//			} else {
//				System.out.print("여자\t");
//			}
			System.out.print(getGender(sawon[i].getGender()) + "\t");
			System.out.print(sawon[i].getPay() + "\n");
		}
	}

}
