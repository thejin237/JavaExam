import java.util.Scanner;

public class Loop_31 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			int na = n % i;
			if (na == 0) {
				System.out.print(i + ",");
			}
		}
	}
}
