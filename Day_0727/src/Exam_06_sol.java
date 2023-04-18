import java.util.Scanner;

public class Exam_06_sol {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int stud[][] = new int[10][11];
		int cnt;
		for (cnt = 0; cnt < 10; cnt++) {
			System.out.print("학생등록: ");
			stud[cnt][0] = scn.nextInt(); // 번호
			if (stud[cnt][0] == 0) {
				break;
			}
			stud[cnt][1] = scn.nextInt(); // 점수1
			stud[cnt][2] = scn.nextInt(); // 점수2
			stud[cnt][3] = scn.nextInt(); // 점수3
			stud[cnt][4] = scn.nextInt(); // 점수4
			stud[cnt][5] = scn.nextInt(); // 점수5
			stud[cnt][6] = stud[cnt][1]; // 최대
			stud[cnt][7] = stud[cnt][1]; // 최소
			stud[cnt][8] = stud[cnt][1]; // 합계

			// 최대 최소 계산
			for (int i = 2; i <= 5; i++) {
				if (stud[cnt][6] < stud[cnt][i]) {
					stud[cnt][6] = stud[cnt][i];
				} else if (stud[cnt][7] > stud[cnt][i]) {
					stud[cnt][7] = stud[cnt][i];
				}
				stud[cnt][8] += stud[cnt][i]; // 5과목의 합계
			}
			stud[cnt][8] = stud[cnt][8] - stud[cnt][6] - stud[cnt][7]; // 합계에서 최대 최소 제외
			stud[cnt][9] = (int) (stud[cnt][8] / 3. + 0.5); // 5과목에서 최대,최소 제외되어 3과목 평균

		}
		// 출력
		System.out.println("*** 학생 입력자료***");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대\t최소\t합계\t평균");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < stud[i].length - 1; j++) {
				System.out.print(stud[i][j] + "\t");
			}
			System.out.println();
		}
		// 석차 계산
		for (int i = 0; i < cnt; i++) {
			stud[i][10] = 1;
			for (int j = 0; j < cnt; j++) {
				if (stud[i][9] < stud[j][9]) {
					stud[i][10]++;
				}
			}
		}
		// 평균을 기준으로 오름차순 정렬
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (stud[i][9] < stud[j][9]) {
					for (int k = 0; k < stud[i].length; k++) {
						int temp = stud[i][k];
						stud[i][k] = stud[j][k];
						stud[j][k] = temp;
					}
				}
			}
		}

		// 최종 출력
		System.out.println("*** 성적일람표 ***");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대\t최소\t합계\t평균\t순위");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < stud[i].length; j++) {
				System.out.print(stud[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
