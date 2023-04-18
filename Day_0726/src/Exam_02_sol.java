import java.util.Scanner;

public class Exam_02_sol {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String arr[][] = new String[10][3];
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("등록:");
			arr[cnt][0] = scn.next();
			if (arr[cnt][0].equals("0")) {
				break;
			}
			arr[cnt][1] = scn.next();
			arr[cnt][2] = scn.next();
			cnt++;
		}
		int dong[][] = new int[11][8];
		int mok = 0;
		for (int i = 0; i < cnt; i++) {
			int row = Integer.parseInt(arr[i][0]);
			int col = Integer.parseInt(arr[i][2]) / 10;
			if (col > 6) {
				col = 6;
			}
			dong[row - 1][col]++;
			dong[row - 1][7]++; // 가로합
			dong[10][col]++; // 세로합
			dong[10][7]++;
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
