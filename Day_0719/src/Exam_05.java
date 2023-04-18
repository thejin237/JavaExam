import java.util.Scanner;

/* 입력 :  176958
 * 50000 : 3
 * 
 * 	.
 * 
 * 1 : 3
*/
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("급여 입력: ");
		int pay = scn.nextInt();
		for (int i = 0; i < money.length; i++) {
			System.out.print(money[i] + "원: ");
			int mok = pay / money[i];
			System.out.println(mok);
			pay %= money[i];
		}
		scn.close();
	}
}
