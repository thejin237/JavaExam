public class Exam_05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int k = 1; k <= i; k++) {
					System.out.print(" ");
				}
				for (int j = 9; j >= i * 2 - 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = 9; k >= i; k--) {
					System.out.print(" ");
				}
				for (int j = 9; j <= i * 2 - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
