import java.util.Scanner;

/*문제1] 키보드로 정수 5개를 입력 받아서 최대점수 최소점수를 뺀 총점, 평균을 구하여 출력
 * 단, 평균은 소수 세 째자리에서 반올림하여 출력한다
 */
public class Exam_01 {
	public static void cal() {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int tot = 0;
		int score1 = scn.nextInt();
		int score2 = scn.nextInt();
		int score3 = scn.nextInt();
		int score4 = scn.nextInt();
		int score5 = scn.nextInt();
		scn.close();
		int max = score1;
		int min = score1;
		if (score1 < score2) {
			max = score2;
		} else {
			min = score2;
		}
		if (max < score3) {
			max = score3;
		} else if (min > score3) {
			min = score3;
		}
		if (max < score4) {
			max = score4;
		} else if (min > score4) {
			min = score4;
		}
		if (max < score5) {
			max = score5;
		} else if (min > score5) {
			min = score5;
		}
		tot = score1 + score2 + score3 + score4 + score5 - max - min;
		double avr = (int) (tot / 3. * 100 + 0.5) / 100.;
		System.out.println("최대점수:" + max);
		System.out.println("최소점수:" + min);
		System.out.println("총점:" + tot);
		System.out.println("평균:" + avr);
	}

	public static void main(String[] args) {
		cal();
	}
}
