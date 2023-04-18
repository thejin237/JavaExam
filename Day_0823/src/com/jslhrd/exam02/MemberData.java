package com.jslhrd.exam02;

public class MemberData {
	Member[] member;
	int cnt;

	public MemberData() {
	}

	public MemberData(Member[] member, int cnt) {
		this.member = member;
		this.cnt = cnt;

		memConv();
	}

	public void memConv() {
		for (int i = 0; i < cnt; i++) {
			// 성별 추출-1
			String gender = member[i].getBirth().substring(7).trim();
			// 성별 추출-2
			int index = member[i].getBirth().indexOf("-");
			String gender2 = member[i].getBirth().charAt(index + 1) + "";
			// 년도 추출
			String year = member[i].getBirth().substring(0, 2);

			if ("1256".contains(gender)) {
				// 나이계산
				member[i].setAge(2022 - (1900 + Integer.parseInt(year)));
				// 성별
				if ("15".contains(gender)) {
					member[i].setGender("남");
				} else {
					member[i].setGender("여");
				}
			} else {
				member[i].setAge(2022 - (2000 + Integer.parseInt(year)));
				if ("37".contains(gender)) {
					member[i].setGender("남");
				} else {
					member[i].setGender("여");
				}
			}
		}
	}

	public void memberPrint() {
		System.out.println("이름\t전화\t\t성별\t나이");
		for (int i = 0; i < cnt; i++) {
			System.out.print(member[i].getName() + "\t");
			System.out.print(member[i].getPhone() + "\t");
			System.out.print(member[i].getGender() + "\t");
			System.out.print(member[i].getAge() + "\n");
		}
	}

}
