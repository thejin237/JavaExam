package co.jslhrd.exam01Sol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student stu = null;
		List <Student>list = new ArrayList<>();
		list.add(new Student(1105, "김길동", 90, 80, 70));
		list.add(new Student(1103, "홍길동", 66, 88, 77));
		list.add(new Student(1101, "강길동", 78, 55, 66));
		list.add(new Student(1102, "장길동", 89, 56, 48));
		list.add(new Student(1104, "이길동", 70, 80, 89));
		scn.close();
		
		// 출력방법 - 1
		System.out.println("===========기본 for문-1===========");
		for (int i = 0; i < list.size(); i++) {
			stu = (Student)list.get(i);
			System.out.print(stu.getBun()+"\t");
			System.out.print(stu.getName()+"\t");
			System.out.print(stu.getKor()+"\t");
			System.out.print(stu.getEng()+"\t");
			System.out.println(stu.getMat()+"\t");
		}
		// 출력방법 - 2
		System.out.println("===========기본 for문-2===========");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 출력방법 - 3
		System.out.println("============확장 for문============");
		for (Student stu1 : list) {
			System.out.println(stu1);
		}
		// 출력방법 - 4
		System.out.println("=============iterator=============");
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			stu = iter.next();
			System.out.println(stu);
		}

	}

}
