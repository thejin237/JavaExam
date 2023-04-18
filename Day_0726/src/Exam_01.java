import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num_cost[][] = new int[10][2];
		String name[] = new String[10];
		// 입력
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("입력:");
			num_cost[cnt][0] = scn.nextInt();
			if (num_cost[cnt][0] == -9999) {
				break;
			}
			name[cnt] = scn.next();
			num_cost[cnt][1] = scn.nextInt();
			cnt++;
		}
		// 출장비 계산
		int money[][] = new int[10][10];
		int unit[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int total[] = new int[10];
		for (int i = 0; i < cnt; i++) {
			int mok = num_cost[i][1];
			for (int j = 0; j < 10; j++) {
				money[i][j] = mok / unit[j];
				total[j] += money[i][j];
				mok = mok % unit[j];
			}
		}
		// 출력
		System.out.println("번호\t이름\t출장비\t50,000원\t10,000원\t5000원\t1000원\t500원\t100원\t50원\t10원\t5원\t1원");
		for (int i = 0; i < cnt; i++) {
			System.out.print(num_cost[i][0] + "\t" + name[i] + "\t" + num_cost[i][1] + "\t");
			for (int j = 0; j < money.length; j++) {
				System.out.print(money[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("화폐 단위 별 전체매수\t");
		for (int i = 0; i < total.length; i++) {
			System.out.print(total[i] + "\t");
		}
	}
}
