public class Exam_23_01 {
	public static void con() {
		int a = 1;
		int b = 1;
		int t = 2;
		int c = 0;

		while (true) {
			c = a + b;
			t = t + c;
			if (c == 34) {
				break;
			} else {
				a = b;
				b = c;
			}
		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		con();
	}
}
