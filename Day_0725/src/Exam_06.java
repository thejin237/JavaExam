/* 2차원 배열
 * 	1	2	3	4	5	
 * 	10	9	8	7	6	
 * 	11	12	13	14	15
 * 	20	19	18	17	16
 * 	21	22	23	24	25
*/
public class Exam_06 {
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
		int l = 0; // col(열) 시작 값
		int m = arr.length - 1; // 최종값
		int n = 1; // 증가 또는 감소
		for (int i = 0; i < 5; i++) {
			for (int j = l; j != m + n; j += n) { // j=j+n;
				k++;
				arr[i][j] = k;
			}
			// 교환
			int p = l;
			l = m;
			m = p;
			n = n * (-1);
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
