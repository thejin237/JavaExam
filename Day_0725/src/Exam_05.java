/* 2차원 배열
 * 	1	
 * 	3	2	
 * 	6	5	4
 * 	10	9	8	7
 * 	15	14	13	12	11
*/
public class Exam_05 {
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
			for (int j = i; j >= 0; j--) {
				// arr[i][j]=++cnt; 아래와 같음
				cnt++;
				arr[i][j] = cnt;
			}
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
