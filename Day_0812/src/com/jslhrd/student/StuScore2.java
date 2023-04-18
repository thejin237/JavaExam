package com.jslhrd.student;
public class StuScore2 {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0]=new Student(1,"AAA");
		student[1]=new Student(5,"BBB");
		student[2]=new Student(3,"CCC");
		student[3]=new Student(2,"DDD");
		student[4]=new Student(4,"EEE");
		
		StuScore[] score = new StuScore[5];
		score[0] = new StuScore(student[0],7,7,7);
		score[1] = new StuScore(student[1],8,7,7);
		score[2] = new StuScore(student[2],7,9,7);
		score[3] = new StuScore(student[3],6,7,8);
		score[4] = new StuScore(student[4],6,7,5);
		
		System.out.println("번호\t이름\t국어\t영어\t수학");
		for(int i=0; i<score.length;i++) {
			score[i].stuScorePrint();
			System.out.println();
		}
		System.out.println("------------------------------------------");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i].getStudent().getBun()+"\t");
			System.out.print(score[i].getStudent().getName()+"\t");
			System.out.print(score[i].getKor()+"\t");
			System.out.print(score[i].getEng()+"\t");
			System.out.print(score[i].getMat()+"\t");
			System.out.println();
		}
	}

}
