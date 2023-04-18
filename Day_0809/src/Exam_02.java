class Box {
	int x = 100;
}

public class Exam_02 {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = b1;

		if (b1 == b2) {
			System.out.println("b1==b2");
		} else {
			System.out.println("b1!=b2");
		}

		if (b1 == b3) {
			System.out.println("b1==b3");
		} else {
			System.out.println("b1!=b3");
		}
	}
}
