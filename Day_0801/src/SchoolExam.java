import java.util.Scanner;

/* 다음 입력형식과 같이 입력 받은 후 출력형식에 맞게
 * 출력하는 프로그램 작성
 * 1. 입력형식[반 번호 체중]
 * 등록: 1 1 62
 * 등록: 1 2 57
 * . . . .
 * 등록: 0 -->입력 종료
 * 
 * 2. 출력형식
 * 반	번호	체중
 * 1반	xx		xx
 * 		xx		xx
 * 3반	xx		xx
 * 		xx		xx
 * 2반	xx		xx
 * 최소체중: xx
 * 최대체중: xx
*/
public class SchoolExam {
	// 메인 메소드
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int student[][] = new int[20][3];

		// 입력 메소드 호출
		int cnt = input(scn, student);

		// 출력 메소드 호출(정렬 전)
		studentOutput(student, cnt);

		// 반 기준 오름 차순 정렬
		studentBanAsc(student, cnt);

		// 출력 메소드 호출(정렬 후)
		studentOutputMaxMin(student, cnt);
	}

	// 입력 메소드
	static int input(Scanner scn, int student[][]) {
		int cnt = 0;
		while (cnt < 20) {
			System.out.print("등록: ");
			student[cnt][0] = scn.nextInt(); // 반
			if (student[cnt][0] == 0) {
				return cnt;
			}
			student[cnt][1] = scn.nextInt(); // 번호
			student[cnt][2] = scn.nextInt(); // 체중
			cnt++;
		}
		return cnt;
	}

	// 출력 메소드 (테스트)
	static void studentOutput(int student[][], int cnt) {
		System.out.println("반\t번호\t체중");
		for (int i = 0; i < cnt; i++) {
			System.out.println(student[i][0] + "\t" + student[i][1] + "\t" + student[i][2]);
		}
	}

	// 반 기준 오름차순 정렬
	static void studentBanAsc(int student[][], int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (student[i][0] > student[j][0]) {
					for (int k = 0; k < student[i].length; k++) {
						int temp = student[i][k];
						student[i][k] = student[j][k];
						student[j][k] = temp;
					}
				}
			}
		}
	}

	// 출력 메소드 (최대, 최소)
	static void studentOutputMaxMin(int student[][], int cnt) {
		System.out.println("반\t번호\t체중");
		System.out.println(student[0][0] + "\t" + student[0][1] + "\t" + student[0][2]);
		int max = student[0][2];
		int min = student[0][2];
		for (int i = 1; i < cnt; i++) {
			System.out.println(student[i][0] + "\t" + student[i][1] + "\t" + student[i][2]);
			if (max < student[i][2]) {
				max = student[i][2];
			} else if (min > student[i][2]) {
				min = student[i][2];
			}
		}
		System.out.println("최소체중:" + min);
		System.out.println("최대체중:" + max);
	}
}
