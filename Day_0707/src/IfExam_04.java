import java.util.Scanner;

/* 점수가 80~90 사이면 "Pass", 아니면"No"
 * 점수 >=80 && 점수<=90
 * 
 */
public class IfExam_04 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		int scr = scn.nextInt();

		if (scr >= 80) {
			if (scr <= 90) {
				System.out.println("Pass");
			}
		} else {
			System.out.println("No");
		}
		scn.close();
	}
}
