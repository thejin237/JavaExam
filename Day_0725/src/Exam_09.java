import java.util.Scanner;

// 2차원 배열을 이용한 성적처리
/*[문제] 다음 입력형식과 같이 학생정보를 입력 받아서 총점,평균,석차를
 * 구하여 석차를 기준으로 오름차순 출력하는 프로그램을 작성하시오.
 * (단, 학생인원의 최대 10명을 넘지 안는다.)
 * 번호가 0이 입력되거나 학생 10명 등록이 완료되면 출력형식에 맞게 출력후 종료한다.
 * 평균은 소수이하 첫 째자리에서 반올림
 * 
 * 1. 입력형식[번호 이름 국어 영어 수학]
 * 학생등록 : 1 김학생 90 88 79
 * 학생등록 : 5 이학생 95 80 70
 * 학생등록 : 2 박학생 88 78 90
 * ....
 * 학생등록 : 0 -> 입력 종료 또는 10명 입력시
 * 
 * 2. 출력형식[입력 자료순]
 * ***학생 입력자료***
 *	번호	이름	국어	영어	수학	총점	평균	석차
 *
 * 3. 출력형식[석차를 기준으로 오름차순]
 * ***성적일람표***
 * 	번호	이름	국어	영어	수학	총점	평균	석차
*/
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int student[][] = new int[10][7];
		String name[] = new String[10];

		// 입력작업 (총점, 평균 계산 가능)
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("학생등록 : ");
			student[cnt][0] = scn.nextInt(); // 번호 입력
			if (student[cnt][0] == 0) {
				break;
			}
			name[cnt] = scn.next();
			for (int i = 1; i <= 3; i++) {
				student[cnt][i] = scn.nextInt();
				student[cnt][4] += student[cnt][i];
			}
			student[cnt][5] = (int) (student[cnt][4] / 3. + 0.5);
			cnt++;
		}
		// 석차 계산
		for (int i = 0; i < cnt; i++) {
			student[i][6] = 1;
			for (int j = 0; j < cnt; j++) {
				if (student[i][5] < student[j][5]) {
					student[i][6]++;
				}
			}
		}
		// 출력형식[입력 자료순]
		System.out.println("*** 학생 입력자료 ***");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < cnt; i++) {
			System.out.print(student[i][0] + "\t");
			System.out.print(name[i] + "\t");
			for (int j = 1; j < student[i].length; j++) {
				System.out.print(student[i][j] + "\t");
			}
			System.out.println();
		}
		// 석차를 기준으로 오름차순 정렬
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (student[i][5] < student[j][5]) {
					for (int k = 0; k < student[i].length; k++) {
						int temp = student[i][k];
						student[i][k] = student[j][k];
						student[j][k] = temp;
					}
					// 이름교환
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		// 출력형식[석차를 기준으로 오름차순]
		System.out.println("*** 성적일람표 ***");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < cnt; i++) {
			System.out.print(student[i][0] + "\t");
			System.out.print(name[i] + "\t");
			for (int j = 1; j < student[i].length; j++) {
				System.out.print(student[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
