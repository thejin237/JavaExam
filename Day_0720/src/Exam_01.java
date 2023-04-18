import java.util.Scanner;

/* 키보드로 정수(m)를 입력 받아서 2 ~ m 까지의 소수를 출력하시오
 * [입력예시]
 * 정수입력: 50
 * 소수: 2	3	5	7	11
 * 		13	17	23	.	.
 * 		.	.	.	.	.
 * 	2~50까지 소수: xx
 * 
 * 1. 소수는 한 줄에 5개씩 출력
 * 2. 마지막에 소수의 갯수 출력
*/
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int m = scn.nextInt();
		scn.close();
		// 출력
		System.out.print("소수:\t");
		int cnt = 0;
		for (int i = 2; i <= m; i++) {
			int j = 2;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				cnt++;
				System.out.print(i + "\t");
				if (cnt % 5 == 0) {
					System.out.println();
					System.out.print("\t");
				}
			}
		}
		System.out.println();
		System.out.println("2 ~" + m + "까지 소수: " + cnt);
	}
}
