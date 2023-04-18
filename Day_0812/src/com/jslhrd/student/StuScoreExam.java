package com.jslhrd.student;
public class StuScoreExam {
	public static void main(String[] args) {
		int bun = 1101;
		String name = "김학생";
		int kor = 90;
		int eng = 88;
		int mat = 95;
		
		Student stu = new Student(bun, name);
		stu.studentPrint();
		System.out.println();
		StuScore ss = new StuScore(stu, kor, eng, mat);
		StuScore ss2 = new StuScore(new Student(bun,name) , kor, eng, mat);
		ss.stuScorePrint();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		ss2.stuScorePrint();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.print(ss.getStudent().getBun()+"\t");//객체안에 포함된 객체의 번호 호출하여 출력
		System.out.print(ss.getStudent().getName()+"\t");//객체안에 포함된 객체의 이름 호출하여 출력
		System.out.print(ss.getKor()+"\t");
		System.out.print(ss.getEng()+"\t");
		System.out.print(ss.getMat()+"\t");
		
	}

}
