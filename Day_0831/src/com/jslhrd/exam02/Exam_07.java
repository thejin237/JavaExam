package com.jslhrd.exam02;
import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student(3, "sara",33));
		sList.add(new Student(1, "john",28));
		sList.add(new Student(2, "tom",24));
		sList.add(new Student(4, "any",31));
		sList.add(new Student(5, "jenny",38));
		
		//Print test
		System.out.println("Before Sort");
		System.out.println("번호\t이름\t나이");
		for(Student student : sList) {
			System.out.print(student.getBun()+"\t");
			System.out.print(student.getName()+"\t");
			System.out.print(student.getAge()+"\n");
		}
		//Sort
		Collections.sort(sList);
		System.out.println("After Sort");
		System.out.println("번호\t이름\t나이");
		for(Student student : sList) {
			System.out.print(student.getBun()+"\t");
			System.out.print(student.getName()+"\t");
			System.out.print(student.getAge()+"\n");
		}
		
		
	}

}
