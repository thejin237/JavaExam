class AA {
	int bun;
	String name;
	boolean gender;

	AA() {
		this(1);// 자신의 생성자 호출. 첫 째줄 한 번만 사용 가능
	}

	AA(int bun) {
		this(bun, "김학생");
		this.bun = bun;
	}

	AA(int bun, String name) {
		this(bun, name, true);
		this.bun = bun;
		this.name = name;
	}

	AA(int bun, String name, boolean gender) {
		this.bun = bun;
		this.name = name;
		this.gender = gender;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		AA a1 = new AA();
		System.out.println(a1.bun);
		System.out.println(a1.name);
		System.out.println(a1.gender);

		AA a2 = new AA(5, "AAA", false);
		System.out.println(a2.bun);
		System.out.println(a2.name);
		System.out.println(a2.gender);

		AA a3 = new AA(7);
		System.out.println(a3.bun);
		System.out.println(a3.name);
		System.out.println(a3.gender);
	}
}
