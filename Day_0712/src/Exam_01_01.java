import java.util.Scanner;
/*문제1] 키보드로 정수 5개를 입력 받아서 최대점수 최소점수를 뺀 총점, 평균을 구하여 출력
 * 단, 평균은 소수 세 째자리에서 반올림하여 출력한다
 */
public class Exam_01_01 {
	public static void cal() {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int tot = 0;
		int[] score = new int[5];
		int max = 0;
		int min = 0;
		for (int i = 0; i < 5; i++) {
			score[i] = scn.nextInt();
		}
		scn.close();
		tot = score[1] + score[2] + score[3] + score[4] + score[5] - max - min;
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
