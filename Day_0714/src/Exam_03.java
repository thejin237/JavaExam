import java.util.Scanner;

/*키보드로 정수를 입력받아서 소수를 갖는 프로그램 작성
 * 입력 : 7 9 11 33 13 55 77 65 67 . .  -99(종료)
 * 
 * 출력
 * 입력자료수: xx
 * 소수의갯수: xx
*/
public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		int x;
		int data = 0;
		int sosu = 0;
		while (true) {
			int num = scn.nextInt();
			if (num == -99) {
				break;
			}
			data++;
			for (x = 2; x <= num; x++) {
				if (num % x == 0) {
					break;
				}
			}
			if (num == x) {
				sosu++;
			}
		}
		System.out.println("입력자료수: " + data);
		System.out.println("소수의갯수: " + sosu);
	}
}