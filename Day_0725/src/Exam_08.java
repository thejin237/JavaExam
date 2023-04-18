/* 2차원 배열
 * 	1	2	3	4	5
 * 	16	17	18	19	6
 * 	15	24	25	20	7
 * 	14	23	22	21	8
 * 	13	12	11	10	9
*/
public class Exam_08 {
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
		int k = 0; // 1~25까지 숫자 출력 이용
		int b = 1; // 부호(+,-)
		int r = 0; // row
		int c = -1;// col
		int f = arr.length;

		while (f >= 0) {
			for (int n = 0; n < f; n++) {
				k++;
				c += b;
				arr[r][c] = k;
			}
			f--;
			for (int n = 0; n < f; n++) {
				k++;
				r += b;
				arr[r][c] = k;
			}
			b = b * (-1);
		}
		// 배열 내용 출력
		for (int i = 0; i < 5; i++) { // row(행)
			System.out.print(i + ":\t");
			for (int j = 0; j < 5; j++) { // col(열)
				if (arr[i][j] != 0) { // 0이 아니면 출력하지 않음, 배열인지 알기 어려우므로 0을 출력
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
