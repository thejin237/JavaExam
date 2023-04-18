import java.util.Scanner;

/* 급여를 입력 받아서 화폐단위(10)별 매수 출력
 * 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
*/
public class Exam_06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("급여입력:");
		int pay = scn.nextInt();
		int cnt = 0;
		int mok = pay;
		int unit = 50000;
		boolean sw = true;

		for (int i = 0; i < 10; i++) {
			System.out.print(unit + "원");
			cnt = mok / unit;
			System.out.println(cnt + "장");
			mok = mok % unit;
			if (sw) {
				unit = unit / 5;
				sw = false;
			} else {
				unit = unit / 2;
				sw = true;
			}
		}
	}
}