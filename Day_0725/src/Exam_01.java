/* 2차원 배열
 * 	1	2	3	4	5
 * 	6	7	8	9	10
 * 	11	12	13	14	15
 * 	16	17	18	19	20
 * 	21	22	23	24	25
*/
public class Exam_01 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5]; // 5행5열의 2차원배열 선언
		System.out.println("Empty Array List");
		for (int i = 0; i < 5; i++) { // row(행)
			System.out.print(i + ":\t");
			for (int j = 0; j < 5; j++) { // col(열)
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		// 배열에 데이터 입력
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// arr[i][j]=++cnt; 아래와 같음
				cnt++;
				arr[i][j] = cnt;
			}
		}

		// 배열 내용 출력
		for (int i = 0; i < 5; i++) { // row(행)
			System.out.print(i + ":\t");
			for (int j = 0; j < 5; j++) { // col(열)
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
