class Sungjuk {
	String name;// 이름
	int kor, eng, mat;// 국어,영어,수학
	int tot;// 총점
	double ave;// 평균
	String pass;// 판정
	String memo;// 사유

	Sungjuk() {
	}

	Sungjuk(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	void totAverage() {
		tot = kor + eng + mat;
		ave = (int) ((tot / 3.) * 10 + 0.5) / 10.;
	}

	void process() {
		if (kor >= 40 && eng >= 40 && mat >= 40) {
			if (ave >= 60) {
				pass = "합격";
			} else {
				pass = "불합격";
				memo = "평균미만";
			}
		} else {
			pass = "불합격";
			memo = "과락";
		}
	}

	void dataPrint() {
		System.out.println("이름: " + name);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + ave);
		System.out.println("판정: " + pass);
		if (memo != null) {
			System.out.println("사유: " + memo);
		}
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		Sungjuk s1 = new Sungjuk("김학생", 90, 45, 56);
		s1.totAverage();
		s1.process();
		s1.dataPrint();
	}

}
