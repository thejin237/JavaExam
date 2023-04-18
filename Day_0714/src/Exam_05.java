import java.util.Scanner;

/*키보드로 10진수 2또는 8진수를 입력 진변환프로그램 작성
 * 입력: 13 2
 * 출력: 10진수 13은 2진수 1101
 * 입력: 13 8
 * 출력: 10진수 13은 8진수 15
 * 입력: 13 16
 * 출력: 10진수 13은 16진수 D
 * 
 * 입력: 0 종료
 * 1. 10진수가 2보다 작으면"입력오류" 출력 후 재입력
 * 2. 변환진수는 2, 8, 16이외의 값 입력시 "입력오류" 출력 후 재입력
*/
public class Exam_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("10진수: ");
			int val = scn.nextInt();
			int jin = scn.nextInt();
			if (val == 0 || jin == 0) {
				break;
			} 
			/*
			 * if(val<2 || jin != 2 || jin != 8 || jin != 16){
			 * System.out.println("입력오류"); continue; }
			 */
			int mok = val;
			String bin = "";
			while (mok != 0) { // mok > 1
				int m = mok / jin;
				int n = mok % jin;
				bin = n + bin;
				mok = m;
			}
			System.out.println("10진수 " + val + "는 " + jin + "진수 " + bin);
		}
	}
}