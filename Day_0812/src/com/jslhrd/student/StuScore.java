package com.jslhrd.student;

public class StuScore {
	private Student student;
	private int kor;
	private int eng;
	private int mat;

	public StuScore() {
	}

	public StuScore(Student student, int kor, int eng, int mat) {
		this.student = student;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	// 자신 출력 메소드
	public void stuScorePrint() {
		student.studentPrint();
		System.out.print(kor + "\t" + eng + "\t" + mat);
	}

}
