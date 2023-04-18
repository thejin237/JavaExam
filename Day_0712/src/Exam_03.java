import java.util.Scanner;
/*문제3] 주차장에 주차된 차량들에 대한 주차요금을 계산하는 프로그램
 * 처리조건
 * -주차가능 시간은 최대 하루 24시간
 * -주차요금은 10분 미만을 무료, 30분까지는 500원, 30분 이후 부터는 10분당 500원씩 계산
 * EX)주차시간이 42분인 경우 주차요금은 1500원이 된다.
 * -하루주차요금은 최대 30000원으로 계산하며 30000원을 초과하더라도 30000원만 징수
 * -주차가능한 차량은 100대 이하 
 */
public class Exam_03 {
	public static void parking() {
		Scanner scn = new Scanner(System.in);
		int cnt = 1;
		while (cnt <= 100) {
			System.out.println("입력(차량번호,시간(분)):");
			int carNum = scn.nextInt();
			int time = scn.nextInt();
			cnt++;

			// 주차요금 계산
			int cost = 0;
			int ov = 0;
			if (time < 10) {
				cost = 0;
			} else if (time >= 10 && time <= 30) {
				cost = 500;
			} else if (time > 30) {
				if (time % 10 != 0) {
					ov++;
				}
				cost = 500 + ((time / 10 - 3) + ov) * 500;
			}
			if (cost > 30000) {
				cost = 30000;
			}
			// 출력
			System.out.println("차량번호:" + carNum);
			System.out.println("주차요금:" + cost);
		}
		scn.close();
		System.out.println("주차불가");
	}

	public static void main(String[] args) {
		parking();
	}
}
