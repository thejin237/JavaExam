public class Exam_19 {
	public static void con() {
		int i = 0;
		int s = 0;
		int y = 1;
		int m = 0;

		while (true) {
			i += 1;
			m = i * y;
			s += m;
			if (i == 10) {
				break;
			} else {
				y *= -1; // y = y*(-1);
			}
		}
		System.out.println("S=" + s);
	}
	
	public static void main(String[] args) {
		con();
	}
}
