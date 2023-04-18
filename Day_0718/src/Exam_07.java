import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner scn = new Scanner(System.in);
		int i = 0;
		do {
			System.out.print("입력:");
			int s = scn.nextInt();
			a[i] = s;
			i++;
		} while (i < 10);
		System.out.println("출력");
		for (int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "]" + a[j]);
		}
	}
}
