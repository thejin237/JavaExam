import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.print("입력: ");
			int num = scn.nextInt();
			int score = scn.nextInt();
			if (num == 0) {
				break;
			}
			if (num < 0 || num > 100) {
				System.out.println("번호입력오류");
				continue;
			}
			if (score < 0 || score > 100) {
				System.out.println("점수입력오류");
				continue;
			}
			System.out.println(num + "," + score);
			count++;
		}
	}

}
