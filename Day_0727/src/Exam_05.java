import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];

		// 입력 메소드 호출
		input(score, scn);
		// 출력 메소드 호출
		print(score);

	}

	static void input(int s[], Scanner scn) {
		System.out.print("입력:");
		for (int i = 0; i < 5; i++) {
			s[i] = scn.nextInt();
		}
	}

	// 출력 메소드
	static void print(int t[]) {
		System.out.println("데이터 출력");
		for (int i = 0; i < 5; i++) {
			System.out.print(t[i] + "\t");
		}
	}
}
