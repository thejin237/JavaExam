package co.jslhrd.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.NamedNodeMap;

public class StudentExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		Student stu = null;
		while (true) {
			System.out.print("입력: ");
			int bun = scn.nextInt();
			if(bun==0) {
				break;
			}
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			boolean flag = true;
			if(!list.isEmpty()) {
				for(int i=0;i<list.size();i++) {
					if(bun == list.get(i).getBun()) {
						flag=false;
						System.out.println("이미 등록된 학생입니다.");
						break;
					}
				}
			}
			if(flag) {
				stu = new Student(bun, name, kor, eng, mat);
				stu.setTot(kor+eng+mat);
				stu.setAve((int)(stu.getTot()/3.*100+0.5)/100.);
				stu.setGrade("F");
				if(stu.getAve()>=90) {
					stu.setGrade("A");
				}else if(stu.getAve()>=80) {
					stu.setGrade("B");
				}else if(stu.getAve()>=70) {
					stu.setGrade("C");
				}else if(stu.getAve()>=60) {
					stu.setGrade("D");
				}
				list.add(stu);
				System.out.println("등록 되었습니다.");
			}
		}
		scn.close();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
