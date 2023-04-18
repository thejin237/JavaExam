import java.util.Scanner;

/* 3조 과제 제출
 * 명단: 문성철, 박창민, 박정진, 이해연, 서현석
 * 
 * 주차장에 주차된 차량등에 대한 주차요금을 계산하는 프로그램을 완성하시오
 * 1) 처리조건
 * -주차 가능 시간은 최대 하루(24시간)으로 한다.
 * -주차 요금은 10분 미만을 무료, 30분 까지는 500원, 
 * 30분 이후 부터는 10분당 500원씩 계산한다.
 * EX)주차 시간이 42분인 경우 주차 요금은 1,500원이 된다
 * -하루 주차 요금은 최대 30,000원으로 계산하며 30,000원을 초과하더라도
 * 30,000원만 징수한다.
 * 주차 가능한 차량은 50대 이하
*/
public class ParkingExam {

	// 01. 입력 메소드 호출 되는 곳
	static int input(Scanner scn, int table[][], int cnt) {
		while (cnt <= 50) {
			System.out.print("입력자료(차량번호,시간(분)):");
			table[cnt][0] = scn.nextInt();
			if (table[cnt][0] == 0) {
				break;
			}
			table[cnt][1] = scn.nextInt();
			cnt++;
		}
		return cnt;// 일 주차대수 반환
	}

	// 02. 처리 메소드 호출 되는 곳
	static int process(int tot, int table[][], int cnt) {
		for (int i = 0; i < cnt; i++) {
			int ov = 0;// 초과시간 계산 변수

			if (table[i][1] <= 10) {// 10분 이하 0원(무료)
				table[i][2] = 0;
			} else if (table[i][1] > 10 && table[i][1] <= 30) {// 10분 초과 30분 이하 500원
				table[i][2] = 500;
			} else if (table[i][1] > 30) {// 30분 초과분에 대한 추가과금
				if (table[i][1] % 10 != 0) {
					ov++;
				}
				table[i][2] = 500 + ((table[i][1] / 10 - 3) + ov) * 500;// 30분 까지 500원 + 초과시간 10분당 500원 추가계산
			}
			if (table[i][2] >= 30000) {// 30,000원 이상 시
				table[i][2] = 30000;// 30,000원만 징수
			}
		}

		for (int i = 0; i < cnt; i++) {
			tot += table[i][2];
		}
		return tot;// 일 매출 반환
	}

	// 03. 출력 메소드 호출 되는 곳
	static void output(int tot, int table[][], int cnt) {
		System.out.println("차량번호\t주차시간\t주차요금");
		for (int i = 0; i < cnt; i++) {
			System.out.print(table[i][0] + "\t\t");
			System.out.print(table[i][1] + "분\t\t");
			if (table[i][2] == 0) {
				System.out.print("무료" + "\n");
			} else {
				System.out.print(table[i][2] + "원\n");
			}
		}
		System.out.println("일 주차대수: " + cnt + "대");
		System.out.println("일 매출액: " + tot + "원");
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int table[][] = new int[50][3];
		int cnt = 0;// 일 주차대수
		int tot = 0;// 일 매출액

		// 01. 입력 메소드 출력
		cnt = input(scn, table, cnt);

		// 02. 처리 메소드 출력
		tot = process(tot, table, cnt);

		// 03. 출력 메소드 출력
		output(tot, table, cnt);
	}

}
