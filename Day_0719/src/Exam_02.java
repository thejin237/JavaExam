import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		// 입력단계
		Scanner scn = new Scanner(System.in);
		int array[] = new int[100];
		int cnt = 0;
		for (cnt = 0; cnt < array.length; cnt++) {
			System.out.print("data " + (cnt + 1) + ":");
			array[cnt] = scn.nextInt();
			if (array[cnt] == -99) {
				scn.close();
				break;
			}
		}
		// 출력단계
		System.out.println("Input Data");
		for (int i = 0; i < cnt; i++) {
			System.out.print(array[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		// 합계와 평균, 최대값, 최소값 출력
		int sum = array[0];
		int max = array[0];
		int min = array[0];
		for (int j = 1; j < cnt; j++) {
			sum += array[j];
			if (max < array[j]) {
				max = array[j];
			} else if (min > array[j]) {
				min = array[j];
			}
		}
		double avr = (int) (sum / cnt * 100 + 0.5) / 100.;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avr);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
