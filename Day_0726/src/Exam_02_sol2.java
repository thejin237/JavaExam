import java.util.Scanner;

public class Exam_02_sol2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dong[][] = new int[11][8];
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("등록:");
			int row = scn.nextInt();
			if (row == 0) {
				break;
			}
			scn.next();
			int col = scn.nextInt();
			col = col / 10;
			if (col > 6) {
				col = 6;
			}
			dong[row - 1][col]++;
			dong[row - 1][7]++; // 가로합
			dong[10][col]++; // 세로합
			dong[10][7]++;
			cnt++;
		}
		// 동별, 나이 통계 출력
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t40~49\t50~59\t60이상\t합계");
		for (int i = 0; i < dong.length - 1; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < dong[i].length; j++) {
				System.out.print(dong[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("합계\t");
		for (int i = 0; i < dong[i].length; i++) {
			System.out.print(dong[10][i] + "\t");
		}
	}
}
