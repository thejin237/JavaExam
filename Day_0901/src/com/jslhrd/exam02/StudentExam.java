package com.jslhrd.exam02;

import java.util.*;

public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Set<Student> setStu = new HashSet<Student>();
		while (true) {
			System.out.print("입력: ");
			String str = scn.nextLine();

			StringTokenizer st = new StringTokenizer(str, ",");
			int bun = 0;
			try {
				String sbun = st.nextToken();
				bun = Integer.parseInt(sbun);
				if (bun == 0000) {
					break;
				} else if (sbun.length() != 4) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("[학번입력오류]");
				continue;
			}
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());

			boolean bool = setStu.add(new Student(bun, name, kor, eng, mat));
			if (!bool) {
				System.out.println("[이미 등록된 학생입니다.]");
			}
			// 총점 평균
			for (Student stu : setStu) {
				stu.setTot(stu.getKor() + stu.getEng() + stu.getMat());
				stu.setAve((int) (stu.getTot() / 3. * 10 + 0.5) / 10.);
			}
		}
		scn.close();

		// 학생 정보 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		for (Student stu : setStu) {
			System.out.print(stu.getHakbun() + "\t");
			System.out.print(stu.getName() + "\t");
			System.out.print(stu.getKor() + "\t");
			System.out.print(stu.getEng() + "\t");
			System.out.print(stu.getMat() + "\t");
			System.out.print(stu.getTot() + "\t");
			System.out.print(stu.getAve() + "\n");
		}

		// set -> list
		List<Student> listStu = new ArrayList(setStu);

		// 학번순 정렬
		Collections.sort(listStu);

		// 학생 정보 학번순 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		for (Student stu : listStu) {
			System.out.print(stu.getHakbun() + "\t");
			System.out.print(stu.getName() + "\t");
			System.out.print(stu.getKor() + "\t");
			System.out.print(stu.getEng() + "\t");
			System.out.print(stu.getMat() + "\t");
			System.out.print(stu.getTot() + "\t");
			System.out.print(stu.getAve() + "\n");
		}
	}

}
