public class Exam_02 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int k = 1; k <= 6 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 5; k <= i; k++) {
					System.out.print(" ");
				}
				for (int j = 9; j >= i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
