import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int val = scn.nextInt();
		for (int i = 2; i <= val; i++) {
			if (val % i == 0) {
				if (val == i) {
					System.out.println(val + "는 소수");
					break;
				}
				System.out.println(val + "는 소수아님");
				break;
			}
		}
	}
}
