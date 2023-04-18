class Calculator {
	void add(int x, int y) {
		int s = x + y;
		System.out.println(x + "+" + y + "=" + s);
	}

	void add(double x, double y) {
		double s = x + y;
		System.out.println(x + "+" + y + "=" + s);
	}

	void add(int x, double y) {
		double s = x + y;
		System.out.println(x + "+" + y + "=" + s);
	}

	void add(double x, int y) {
		double s = x + y;
		System.out.println(x + "+" + y + "=" + s);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
	}

}
