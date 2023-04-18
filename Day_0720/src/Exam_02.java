import java.util.Scanner;

/* 키보드로 10진수 입력 2, 8, 16진수로 변환
 * 1. 입력값이 0이면 종료한다.
 * 2. 입력값이 1보다 작으면 "오류" 출력후 재입력
 * 3. 변환 진수가 2, 8, 16 이외의 값은 "오류"출력후 재입력
 * 
 * 입력예시
 * 10진수: 15
 * 변환진수: 2
 * 2진수 1111
*/
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("10진수: ");
			int dec = scn.nextInt();
			if (dec == 0) {
				break;
			}
			if (dec < 1) {
				System.out.println("입력오류");
				continue;
			}
			System.out.print("변환진수: ");
			int con = scn.nextInt();
			if (con != 2 && con != 8 && con != 16) {
				System.out.println("입력오류");
				continue;
			}
			scn.close();
			// 진법변환
			String str = "";
			int mok = dec;
			while (mok != 0) {
				int m = mok / con; // 몫
				int n = mok % con; // 나머지
				switch (n) {
				case 10:
					str = "A" + str;
					break;
				case 11:
					str = "B" + str;
					break;
				case 12:
					str = "C" + str;
					break;
				case 13:
					str = "D" + str;
					break;
				case 14:
					str = "E" + str;
					break;
				case 15:
					str = "F" + str;
					break;
				default:
					str = n + str;
				}
				mok = m;
			}
			System.out.println(con + "진수" + str);
		}
	}
}
