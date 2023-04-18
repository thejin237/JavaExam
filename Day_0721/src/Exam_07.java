import java.util.Scanner;

/* 검색기법
 * 1. 선형 검색(숫자, 순서)
 * 2. 2진 검색
*/
public class Exam_07 {
	public static void main(String[] args) {
		int values[] = { 90, 70, 50, 80, 77, 85, 95 };
		System.out.println("Source Data");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();

		// 검색
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("검색할 데이터 입력:");
			int val = scn.nextInt();
			if (val == -99) {
				break;
			}
			boolean flag = false;
			int i = 0;
			for (i = 0; i < values.length; i++) {
				if (val == values[i]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(val + "데이터는" + (i + 1) + "번째 있음");
			} else {
				System.out.println(val + "데이터 없음");
			}
		}
	}
}
