public class Array2Sort {
	public static void main(String[] args) {
		int arr[][] = { { 5, 90, 77, 88 }, { 2, 77, 66, 55 }, { 4, 33, 44, 55 }, { 1, 77, 66, 77 }, { 3, 88, 77, 99 } };

		System.out.println("정렬 전 Data");
		System.out.println("번호\t국어\t영어\t수학");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		// 번호를 기준으로 오름차순 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][0] > arr[j][0]) {
					for (int k = 0; k < arr.length - 1; k++) {
						int temp = arr[i][k];
						arr[i][k] = arr[j][k];
						arr[j][k] = temp;
					}
				}
			}
		}

		System.out.println("정렬 후 Data");
		System.out.println("번호\t국어\t영어\t수학");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
