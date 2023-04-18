import java.util.Scanner;

public class Exam_01_sol {
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
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int totalMoney[] = new int[10]; // 화폐 단위 별 합계 매수 저장배열
		System.out.println("번호\t이름\t출장비\t" + "50,000원 10,000원 5000원 1000원\t500원\t100원\t50원\t10원\t5원\t1원");
		for (int i = 0; i < cnt; i++) {
			System.out.print(num_cost[i][0] + "\t" + name[i] + "\t" + num_cost[i][1] + "\t");
			int pay = num_cost[i][1];
			for (int k = 0; k < money.length; k++) {
				int mok = pay / money[k];
				System.out.print(mok + "\t");
				totalMoney[k] += mok; // 전체 계산
				pay = pay % money[k];
			}
			System.out.println();
		}
		System.out.print("화폐 단위 별 전체매수\t");
		for (int i = 0; i < totalMoney.length; i++) {
			System.out.print(totalMoney[i] + "\t");
		}
	}
}
