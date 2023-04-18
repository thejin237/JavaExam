package com.jslhrd.exam03;

public class Student implements Comparable<Student> {
	private int hakbun;
	private String name;
	private int kor, eng, mat, tot;
	private double ave;
	private String rank;

	public Student() {
	}

	public Student(int hakbun, String name, int kor, int eng, int mat) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		totAve();
	}

	public void totAve() {
		tot = kor + eng + mat;
		ave = (int) (tot / 3. * 100 + 0.5) / 100.;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return hakbun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + ave + "\t" + rank;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(hakbun, o.hakbun);
	}

}
