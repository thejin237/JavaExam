import java.util.Scanner;

/* 검색기법
 * 1. 선형 검색(숫자, 순서)
 * 2. 2진 검색
*/
public class Exam_06 {

	public static void main(String[] args) {
		int values[] = { 90, 70, 50, 80, 77, 85, 95 };
		System.out.println("Source Data");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();

		// 검색
		Scanner scn = new Scanner(System.in);
		System.out.println("검색할 데이터 입력");
		int val = scn.nextInt();
		scn.close();
		for (int i = 0; i < values.length; i++) {
			if (val == values[i]) {
				System.out.println(val + "데이터는" + (i + 1) + "번째 있음");
				System.exit(0);
				break;
			}
		}
		System.out.println(val + "데이터 없음");
	}

}
