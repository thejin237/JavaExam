import java.util.Scanner;

/* 키보드로 번호 국어 영어 수학 입력 배열에 저장 후
 * 총점 평균 석차를 구하여 출력
 * 단 학생수는 10명이내로 한다.
*/
public class Exma_14 {
	public static void main(String[] args) {
		/*
		 * int hak[][] = new int[10][6]; double avr[] = new int[10]; hak[0][0] = 5;
		 * hak[0][1] = 89; hak[0][2] = 77; hak[0][3] = 84;
		 */
		// 키보드로 번호 국어 영어 수학 점수가 입력 되어 배열에 저장된 경우
		int hak[][] = { { 2, 73, 84, 90, 0, 0 }, { 1, 67, 75, 80, 0, 0 }, { 5, 67, 89, 60, 0, 0 },
				{ 4, 72, 88, 90, 0, 0 }, { 3, 87, 79, 60, 0, 0 } };
		double avr[] = new double[10]; // 평균 저장용

		// 출력작업
		// 총점 평균 구하기
		int cnt = 5; // 5명이 입력된 경우
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 4; j++) {
				hak[i][4] += hak[i][j];
			}
			avr[i] = hak[i][4] / 3.;
			hak[i][5] = 1;
		}
		// 정렬 전 출력
		System.out.println("정렬 전 출력");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(hak[i][j] + "\t");
			}
			System.out.print((int) avr[i] + "\t");
			System.out.println(hak[i][5]);
		}

		// 번호순 정렬
		for (int i = 0; i < hak.length - 1; i++) {
			for (int j = i + 1; j < hak.length; j++) {
				if (hak[i][0] > hak[j][0]) {
					for (int k = 0; k < hak.length; k++) {
						//
						int temp = hak[i][k];
						hak[i][k] = hak[j][k];
						hak[j][k] = temp;
						// 평균 정렬
						double tems = avr[i];
						avr[i] = avr[j];
						avr[j] = tems;
					}
				}
			}
		}
		for (int i = 0; i < hak.length; i++) {
			for (int j = 0; j < hak.length; j++) {
				if (avr[i] < avr[j]) {
					hak[i][5] += 1;
				}
			}
		}
		// 정렬 후 출력
		System.out.println("정렬 후 출력");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(hak[i][j] + "\t");
			}
			System.out.print((int) avr[i] + "\t");
			System.out.println(hak[i][5]);
		}
	}
}
