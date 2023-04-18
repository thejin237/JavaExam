class Calculator2 {
	void add(int... x) {
		int s = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			s += x[i];
			System.out.print(x[i]);
			if (i != x.length - 1) {
				System.out.print("+");
			}
		}
		System.out.println("=" + s);
	}

	void add(double... x) {
		double s = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			s += x[i];
			System.out.print(x[i]);
			if (i != x.length - 1) {
				System.out.print("+");
			}
		}
		System.out.println("=" + s);
	}

	void add(int x, double... y) {
		double s = x;
		System.out.print(x + "+");
		for (int i = 0; i <= y.length - 1; i++) {
			s += y[i];
			System.out.print(y[i]);
			if (i != y.length - 1) {
				System.out.print("+");
			}
		}
		System.out.println("=" + s);
	}

	void add(double x, int... y) {
		double s = x;
		System.out.print(x + "+");
		for (int i = 0; i <= y.length - 1; i++) {
			s += y[i];
			System.out.print(y[i]);
			if (i != y.length - 1) {
				System.out.print("+");
			}
		}
		System.out.println("=" + s);
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		cal.add(10, 20, 30, 50, 60);
		cal.add(10.2, 20.3, 30.5, 50.6, 60.3);
		cal.add(10, 20.3, 30.5, 50.6, 60.3);
		cal.add(10.5, 20, 30, 50, 60);
	}

}
