package com.jslhrd.testa;

class Hak {
	int bun;
	String name;

	Hak(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	void print() {
		System.out.print(bun + "\t" + name);
	}
}

class Student extends Hak {
	int kor, eng, mat, tot;
	double ave;

	Student(int bun, String name, int kor, int eng, int mat) {
		super(bun, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		totAve();
	}

	void totAve() {
		tot = kor + eng + mat;
		ave = (int) (tot / 3. * 10 + 0.5) / 10.;
	}

	void print() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		super.print();
		System.out.println("\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + ave);
	}
}

public class Exam_06 {

	public static void main(String[] args) {
		int bun = 1101;
		String name = "김학생";
		int kor = 90;
		int eng = 88;
		int mat = 89;

		// 출력결과
		// 번호 이름 국어 영어 수학 총점 평균
		// 1101 김학생 90 88 89 xxx xx
		Student st = new Student(bun, name, kor, eng, mat);
		st.print();
	}

}
