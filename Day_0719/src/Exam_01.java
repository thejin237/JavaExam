import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		// 입력단계
		Scanner scn = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("data " + (i + 1) + ":");
			array[i] = scn.nextInt();
		}

		// 출력단계
		System.out.print("Input Data: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// 총점, 평균, 최대, 최소출력
		int max = array[0];
		int min = array[0];
		int sum = array[0];
		for (int j = 1; j < 10; j++) {
			sum += array[j];
			if (max < array[j]) {
				max = array[j];
			} else if (min > array[j]) {
				min = array[j];
			}
		}
		double avr = (int) (sum / array.length * 100 + 0.5) / 100.;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avr);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		scn.close();
	}
}
