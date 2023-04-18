import java.util.Arrays;

public class Exam_11 {
	public static void main(String[] args) {
		int arr[] = { 25, 50, 33, 54, 7 };
		// for()문을 이용한 배열 내용 출력
		System.out.println("일반 for()을 이용한 배열 요소 출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		// 확장 for()문을 이용한 배열 내용 출력
		// 배열의 처음부터 마지막까지 출력에 용이함
		System.out.println("확장 for()을 이용한 배열 요소 출력");
		for (int i : arr) {// 배열arr의 처음값부터 마지막값까지 i에 반복대입
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}