package solution;

public class Score_sol {
	private String hakbun;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	private int rank;
	
	public Score_sol() {}
	
	public Score_sol(String hakbun, int kor, int eng, int mat) {
		this.hakbun=hakbun;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		totAve();
	}

	private void totAve() {
		tot = kor + eng + mat;
		ave = (int)(tot/3.*10+0.5)/10.;
	}
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void scPrint() {
		System.out.print(hakbun + "\t" + kor + "\t" + eng + "\t" + mat + "\t");
		System.out.print(tot + "\t" + ave + "\t" + rank + "\n");
	}

}
