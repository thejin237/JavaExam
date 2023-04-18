import java.util.Scanner;

/* 다음 조건에 맞는 프로그램을 작성하시오
 * 1. 1차원 배열 최대 100개 저장할 수 있는 score배열이 있다.
 * 2. 키보드로 데이터를 입력받아서 배열에 저장한다
 * 단, 입력자료의 수가 100개 이거나 , 입력자료 중 -99가 입력되면 입력을 종료한다.
 * 3. 출력[1]입력된 자료를 출력한다.(단.10개 이상일 경우 한줄에 10개씩 출력한다)
 * 4. 출력[2]배열에 저장된 자료의 평균을 계산하여 평균이상인 자료만 출력한다
 * 5. 출력[3]배열에 저장된 데이터중 평균에 가장 가까운 값을 찾아서 출력한다.
*/
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[100];
		int cnt = 0;
		while (cnt < 100) {
			System.out.print("데이터입력:");
			score[cnt] = scn.nextInt();
			if (score[cnt] == -99) { // 입력된 자료가 -99이면 종료
				break;
			}
			cnt++;
		}
		scn.close();
		System.out.print("입력데이터:\t");
		int sum = score[0];
		for (int x = 1; x < cnt; x++) {
			sum += score[x]; // 합계 계산
		}
		for (int y = 0; y < cnt; y++) {
			System.out.print(score[y] + "\t");
			if ((y + 1) % 10 == 0) {
				System.out.println();
				System.out.print("\t\t");
			}
		}
		System.out.println();

		// 평균계산 및 평균이상 데이터 출력
		int avr = sum / cnt; // 평균 계산
		System.out.print("평균(" + avr + ")이상 데이터:\t");
		for (int z = 0; z < cnt; z++) {
			if (score[z] >= avr) { // 평균이상 데이터 출력
				System.out.print(score[z] + "\t");
			}
		}
		System.out.println();

		// 평균과 가장 가까운 숫자 출력
		int data = score[0];
		int min = (score[0] > avr) ? score[0] - avr : avr - score[0];
		for (int m = 0; m < cnt; m++) {
			int dif = (score[m] > avr) ? score[m] - avr : avr - score[m];
			if (min > dif) {
				min = dif;
				data = score[m];
			}
		}
		System.out.println("평균(" + avr + ")과 가장 가까운 숫자: " + data);
	}
}
