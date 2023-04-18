package com.jslhrd.exam01;
import java.util.*;
public class Exam_05 {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		Student stu = null;
		stu = new Student (1,"aaa",25);
		sList.add(stu);
		stu = new Student (5,"bbb",30);
		sList.add(stu);
		sList.add(new Student (3,"ccc",28));
		sList.add(new Student (2,"ddd",24));
		sList.add(new Student (4,"eee",42));
		
		System.out.println(sList);
		//출력
		System.out.println("기본 for()-1");
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<sList.size();i++) {
			Student s = sList.get(i);
			System.out.print(s.getBun()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\n");
		}
		System.out.println("기본 for()-2");
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<sList.size();i++) {
			System.out.print(sList.get(i).getBun()+"\t");
			System.out.print(sList.get(i).getName()+"\t");
			System.out.print(sList.get(i).getAge()+"\n");
		}
		System.out.println("확장 for()");
		System.out.println("번호\t이름\t나이");
		for(Student s : sList) {
			System.out.print(s.getBun()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\n");
		}
		
	}
}
