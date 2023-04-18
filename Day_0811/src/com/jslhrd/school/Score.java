package com.jslhrd.school;

public class Score {
	private String bun;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avr;
	private int rank;
	
	Score() {}
	Score(String bun, int kor,int eng, int mat) {
		this.bun = bun;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot();
		avr();
	}
	
	void tot() {
		tot = kor+eng+mat;
	}
	
	void avr() {
		avr = (int)(tot/3.*10+0.5)/10.;
	}
	
	void scorePrint() {
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avr+"\t"+rank);
	}
	
	int getKor() {
		return kor;
	}
	void setKor(int kor) {
		this.kor = kor;
	}
	int getEng() {
		return eng;
	}
	void setEng(int eng) {
		this.eng = eng;
	}
	int getMat() {
		return mat;
	}
	void setMat(int mat) {
		this.mat = mat;
	}
	int getTot() {
		return tot;
	}
	void setTot(int tot) {
		this.tot = tot;
	}
	double getAvr() {
		return avr;
	}
	void setAvr(double avr) {
		this.avr = avr;
	}
	int getRank() {
		return rank;
	}
	void setRank(int rank) {
		this.rank = rank;
	}
	
}
