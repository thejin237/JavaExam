import java.util.Scanner;

/* 번호, 국어, 영어, 수학 점수를 입력 받아서
 * 총점, 평균을 구하여 출혁하는 프로그램 작성
 * 단, 평균은 소수이하 3째자리에서 반올림하여 출력
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("번호:");
		int bun = scanner.nextInt();
		System.out.println("국어:");
		int kor = scanner.nextInt();
		System.out.println("영어:");
		int eng = scanner.nextInt();
		System.out.println("수학:");
		int mat = scanner.nextInt();
		
		int tot = kor + eng + mat;
		double ave = (int)(tot/3.*1000+0.5)/1000.;
		
		System.out.println("번호 :" + bun);
		System.out.println("총점 :" + tot);
		System.out.println("총점 :" + ave);
		scanner.close();
	}

}
