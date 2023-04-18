import java.util.Arrays;

public class Exam_09 {
	public static void main(String[] args) {
		int arr[] = { 25, 50, 33, 54, 7 };
		int arr2[] = new int[arr.length];

		// 연산을 할 수 없으나 간단하게 배열값 확인 가능
		// System.out.println(Arrays.toString(arr));

		// 배열 복제 1.(배열의 원본데이터를 보존하여 재사용하고자 할 때 사용
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}

		// 배열 복제 2. 배열명.clone(); / Object 클래스 clone() 메소드 이용
		int arr3[] = arr.clone();

		// 배열 복제 3. System 클래스 arraycopy() 메소드 이용
		// 배열의 개수를 먼저 결정(배열을 먼저 선언)

		int arr4[] = new int[arr.length];
		System.arraycopy(arr, 0, arr4, 0, arr.length);

		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] < arr2[j]) {
					int t = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = t;
				}
			}
		}
		System.out.println("arr\n" + Arrays.toString(arr));
		System.out.println("arr2\n" + Arrays.toString(arr2));
		System.out.println("clone복제 arr3\n" + Arrays.toString(arr3));
		System.out.println("arraycopy arr4\n" + Arrays.toString(arr4));
	}
}