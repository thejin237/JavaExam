import java.util.Scanner;

/* 키보드로 정수 num를 입력받아서 1 ~ num까지 합계를 구하여 출력
 * 입력: 10
 * 1 ~ 10 : 55
 * 입력: 100
 * 1 ~ 100 : 5050
 * 입력: 5
 * 1 ~ 5 : 15
 * 입력 : 0 -->프로그램 종료
*/
public class Exam_07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("입력: ");
			int num = scn.nextInt();
			if (num == 0) {
				break;
			}
			if (num < 2 || num > 100) {
				System.out.println("입력오류");
				continue;
			}
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1 ~ " + num + " 합: " + sum);
		}
	}
}
