package com.jslhrd.school;

public class Score {
	private Student student;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;

	public Score() {}
	public Score(Student student, int kor, int eng, int mat) {
		this.student=student;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
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
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	
}
