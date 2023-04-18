public class Student {
	int bun;// 번호
	String name;// 이름
	int score;// 점수

	Student() {
	}

	public Student(int bun) {
		this.bun = bun;
	}

	public Student(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	public void stuPrint() {
		System.out.println(bun + "\t" + name + "\t" + score);
	}
}
