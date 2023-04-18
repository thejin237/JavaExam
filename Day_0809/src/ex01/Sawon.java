package ex01;

public class Sawon {
	String name;
	int pay;
	int money[] = new int[10];
	boolean flag = true;

	Sawon() {
	}

	Sawon(String name, int pay) {
		this.name = name;
		this.pay = pay;
		moneyCnt();
	}

	void moneyCnt() {
		int unit = 50000;
		int mok = pay;
		for (int i = 0; i < money.length; i++) {
			money[i] = mok / unit;
			mok = mok % unit;
			if (flag) {
				unit = unit / 5;
				flag = false;
			} else {
				unit = unit / 2;
				flag = true;
			}
		}
	}

	void printIndex() {
		System.out.print("성명\t출장비\t");
		System.out.println("오만\t일만\t오천\t일천\t오백\t일백\t오십\t일십\t오\t일");
	}
}
