/* 2차원 배열
 * 	1	6	11	16	21
 * 	2	7	12	17	22
 * 	3	8	13	18	23
 * 	4	9	14	19	24
 * 	5	10	15	20	25
*/
public class Exam_02 {
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
				// arr[j][i]=++cnt; 아래와 같음
				cnt++;
				arr[j][i] = cnt;
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
