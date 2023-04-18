package com.jslhrd.exam01;
import java.util.*;
public class Exam_06 {
	// Create Sort Method
	static void stuSort(List<Student> list) {
		for(int i = 0; i<list.size()-1;i++) {
			for(int j = i+1; j<list.size();j++) {
				Student st1 = list.get(i);
				Student st2 = list.get(j);
				if(st1.getBun()>st2.getBun()) {
					list.set(i, st2);
					list.set(j, st1);
				}
			}
		}
	}
	
	
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
		// Print Before Sort
		System.out.println("확장 for()");
		System.out.println("번호\t이름\t나이");
		for(Student s : sList) {
			System.out.print(s.getBun()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\n");
		}
		// Active stuSort Method
		stuSort(sList);
		System.out.println("확장 for()");
		System.out.println("번호\t이름\t나이");
		for(Student s : sList) {
			System.out.print(s.getBun()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\n");
		}
	}
	
}
