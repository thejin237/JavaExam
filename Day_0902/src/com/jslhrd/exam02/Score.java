package com.jslhrd.exam02;

public class Score implements Comparable<Score> {
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;

	public Score() {
	}

	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		ave = (int) (tot / 3. * 10 + 0.5) / 10.;
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

	@Override
	public int compareTo(Score o) {
		return Integer.compare(tot, o.tot);
	}

}
