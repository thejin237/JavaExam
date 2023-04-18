public class Person {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avr;
	String pass;
	int rank;

	Person() {
	}

	Person(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		process(kor, eng, mat);
	}

	void process(int kor, int eng, int mat) {
		tot = kor + eng + mat;
		avr = (int) (tot / 3. * 10 + 0.5) / 10.;
		pass = "가";
		if (avr >= 90) {
			pass = "수";
		} else if (avr >= 80) {
			pass = "우";
		} else if (avr >= 70) {
			pass = "미";
		} else if (avr >= 60) {
			pass = "양";
		}
	}

	// 출력 메소드
	void personPrint() {
		System.out.println(bun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avr + "\t"
				+ pass + "\t" + rank);
	}
}
