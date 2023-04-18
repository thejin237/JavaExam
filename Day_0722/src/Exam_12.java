public class Exam_12 {
	public static void main(String[] args) {
		// int arr[] = {1,2,3,4,5};
		int arr1[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9, 10 } }; // 가변 배열
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 일반 for()
		System.out.println("일반 for() 배열 요소 출력");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		// 확장 for()
		System.out.println("확장 for() 배열 요소 출력");
		for (int a[] : arr1) { // arr1의 값이 주소값이므로 배열로 받음
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
	}
}
