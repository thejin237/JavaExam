import java.util.Scanner;

/* 급여를 입력 받아서 화폐단위(10)별 매수 출력
 * 입력: 179856
 * 50000 : 3
 * . .
 * 1 : 1
 * 
 * 입력: 0 -->종료
 * 50000원: xx 총매수
 * 1. 급여가 10000원 미만이면 "입력오류" 출력후 재입력
*/
public class Exam_07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		boolean sw = true;

		while (true) {
			System.out.println("급여입력:");
			int pay = scn.nextInt();
			if (pay == 0) {
				System.out.println("50000원: " + sum + "장");
				break;
			}
			if (pay < 10000) {
				System.out.println("입력오류");
				continue;
			}

			int unit = 50000;
			int mok = pay;
			for (int i = 0; i < 10; i++) {
				System.out.print(unit + "원");
				int cnt = mok / unit;
				if (i == 0) {
					sum += cnt;
				}
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
}