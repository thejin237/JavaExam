import java.util.Arrays;

public class Exam_10 {
	public static void main(String[] args) {
		int arr[] = { 25, 50, 33, 54, 7 };
		// arr : 첫번째 요소의 위치
		// arr[0] : 0번 요소의 값(변수)
		System.out.println("arr\n" + Arrays.toString(arr));

		int arr2[] = arr;
		System.out.println("arr 값: " + arr);
		System.out.println("arr2 값: " + arr2);
		System.out.println("arr[0] 값: " + arr[0]);
		System.out.println("arr2[0] 값: " + arr2[0]);
	}
}