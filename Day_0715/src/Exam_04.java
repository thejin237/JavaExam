public class Exam_04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int k = 1; k <= 5 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i * 2 - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = 6; k <= i; k++) {
					System.out.print(" ");
				}
				for (int j = 17; j >= i * 2 - 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
	}
}
