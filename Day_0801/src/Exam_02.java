public class Exam_02 {
	public static void main(String[] args) {
		add1();
		add2(1, 10);
		System.out.println(add3());
		int tot = add4(10, 20);
		System.out.println(tot);
	}

	static void add1() {
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			s += i;
		}
		System.out.println("1 ~ 10 합 : " + s);
	}

	static void add2(int a, int b) {
		int s = 0;
		for (int i = a; i <= b; i++) {
			s += i;
		}
		System.out.println(a + " ~ " + b + " 합 : " + s);
	}

	static int add3() {
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			s += i;
		}
		return s;
	}

	static int add4(int a, int b) {
		int s = 0;
		for (int i = a; i <= b; i++) {
			s += i;
		}
		return s;
	}

}
