package com.jslhrd.exam03;

import java.util.*;

public class PersonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Person> pList = new ArrayList<>();
		while (true) {
			System.out.print("입력 자료: ");
			int bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			boolean flag = true;
			if (!pList.isEmpty()) {
				for (int i = 0; i < pList.size(); i++) {
					if (pList.get(i).getBun() == bun) {
						System.out.println("**이미 등록된 학생입니다.**");
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				pList.add(new Person(bun, name, kor, eng, mat));
				System.out.println("**등록되었습니다.**");
			}
			// tot, ave
			for (Person p : pList) {
				p.setTot(p.getKor() + p.getEng() + p.getMat());
				p.setAve((int) (p.getTot() / 3. * 100 + 0.5) / 100.);
				p.setGrade("F");
				if (p.getAve() >= 90) {
					p.setGrade("A");
				} else if (p.getAve() >= 80) {
					p.setGrade("B");
				} else if (p.getAve() >= 70) {
					p.setGrade("C");
				} else if (p.getAve() >= 60) {
					p.setGrade("D");
				}
			}

		}
		// Test Print
		for (Person p : pList) {
			System.out.print(p.getBun() + "\t");
			System.out.print(p.getName() + "\t");
			System.out.print(p.getKor() + "\t");
			System.out.print(p.getEng() + "\t");
			System.out.print(p.getMat() + "\t");
			System.out.print(p.getTot() + "\t");
			System.out.print(p.getAve() + "\t");
			System.out.print(p.getGrade() + "\n");
		}

	}

}
