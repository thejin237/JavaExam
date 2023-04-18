import java.util.Scanner;

/* 검색기법
 * 1. 선형 검색(숫자, 순서)
 * 2. 2진 검색
*/
public class Exam_08 {
	public static void main(String[] args) {
		int values[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("Source Data");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();

		// 검색
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int val = scn.nextInt();
		int low = 0, high = values.length;
		boolean flag = false;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (values[mid] == val) {
				flag = true;
				break;
			} else if (val > values[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (flag) {
			System.out.println(val + "데이터는" + (mid + 1) + "째 있음");
		} else {
			System.out.println(val + "데이터 없음");
		}
	}
}
