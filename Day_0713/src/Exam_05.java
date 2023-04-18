import java.util.Scanner;

/*키보드로 점수를 입력 받아서 짝수의 합과 갯수 출력
 * 입력: 2 5 3 7 9 6 8 4 6 4 2 3 9 . . . 0
 * 
 * 짝수합: xx
 * 짝수 갯수: x
 * 
 * 1. 입력 자료에 0이 있으면 출력 후 종료한다.
 * 2. 
*/
public class Exam_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");

		int sum = 0;
		int cnt = 0;
		while (true) {
			int num = scn.nextInt();
			if (num == 0) {
				break;
			}
			if (num % 2 == 0) {
				sum += num;
				cnt++;
			}
		}
		System.out.println("짝수합: " + sum);
		System.out.println("짝수 갯수: " + cnt);
	}
}
