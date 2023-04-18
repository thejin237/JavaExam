package com.jslhrd.student;

import java.io.*;
import java.util.*;

public class StudentExam {
	public static void main(String[] args) throws Exception {
		File file = new File("src/com/jslhrd/student/student.dat");

		List<Student> listStu = new ArrayList<Student>();

		if (file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			listStu = (List) ois.readObject();
			ois.close();
		}

		// Select menu
		String menu;
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print("[1]:학생등록 [2]전체 출력 [3]종료? :");
			menu = scn.nextLine();
			// 친구 등록
			if (menu.equals("1")) {
				System.out.print("입력:");
				String[] str = scn.nextLine().split(",");
				boolean add = false;
				Student stu = new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]),
						Integer.parseInt(str[3]), Integer.parseInt(str[4]));
				if (listStu.contains(stu)) {
					System.out.println("이미 등록된 번호입니다.");
					continue;
				} else {
					add = listStu.add(stu);
				}
				if (add) {
					System.out.println("친구" + listStu.size() + "명을 등록하였습니다.");
				}
				continue;

			} else if (menu.equals("2")) {
				if (listStu.size() == 0) {
					System.out.println("등록된 학생이 없습니다.");
					continue;
				}
				// 번호순 정렬
				for (int i = 0; i < listStu.size() - 1; i++) {
					for (int j = i + 1; j < listStu.size(); j++)
						if (listStu.get(i).getBun() > listStu.get(j).getBun()) {
							Student temp = listStu.get(i);
							listStu.set(i, listStu.get(j));
							listStu.set(j, temp);
						}
				}
				// 총점 평균 학점 구하고 출력
				int evryTot = 0;
				String grade = "F";
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				for (Student stu : listStu) {
					int tot = stu.getKor() + stu.getEng() + stu.getMat();
					evryTot += tot;
					double ave = (int) (tot / 3. * 100 + 0.5) / 100.;
					if (ave >= 90) {
						grade = "A";
					} else if (ave >= 80) {
						grade = "B";
					} else if (ave >= 70) {
						grade = "C";
					} else if (ave >= 60) {
						grade = "D";
					}

					System.out.print(stu.getBun() + "\t");
					System.out.print(stu.getName() + "\t");
					System.out.print(stu.getKor() + "\t");
					System.out.print(stu.getEng() + "\t");
					System.out.print(stu.getMat() + "\t");
					System.out.print(tot + "\t");
					System.out.print(ave + "\t");
					System.out.print(grade + "\n");

				}
				System.out.print("전체총점: " + evryTot + "\n");
				System.out.print("전체평균: " + evryTot / (3 * listStu.size()) + "\n");

			} else if (menu.equals("3")) {
				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				oos.writeObject(listStu);
				oos.close();
				System.out.println("종료");
				System.exit(0);
			} else {
				System.out.println("입력이 잘못 되었습니다.");
			}

		}

	}

}
