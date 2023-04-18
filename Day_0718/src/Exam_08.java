import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];

		int i = 0;
		System.out.print("입력:");
		for (int j = 0; j < a.length; j++) {
			a[j] = scn.nextInt();
		}
		System.out.println("----- out put -----");
		do {
			System.out.println("a[" + i + "]" + a[i]);
			i++;
		} while (i != 10);
	}
}
