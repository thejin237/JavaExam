import java.util.Scanner;
/* 키보드로 이름, 국어, 영어, 수학을 입력 받아서
 * 총점, 평균, 비고를 구하여 출력
 * 1. 평균은 소수이하 둘째자리에서 반올림하여 처리
 * 2. 비고는 평균이 85이상"Pass"아니면"NoPass"출력한다.
*/
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름:");
		String name = scanner.nextLine();
		System.out.println("국어:");
		int kor = scanner.nextInt();
		System.out.println("영어:");
		int eng = scanner.nextInt();
		System.out.println("수학:");
		int mat = scanner.nextInt();

		int tot = kor + eng + mat;
		double avr = (int)(tot/3.*10+0.5)/10.;
		String remark = (avr>=80)?"Pass":"NoPass";
		System.out.println("이름:" + name);
		System.out.println("총점\t"+"평균\t"+"비고");
		System.out.println(tot+"\t"+avr+"\t"+remark);
		scanner.close();
	}
}
