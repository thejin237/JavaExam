/*	1	2	3	4	5
 * 10	9	8	7	6
 * 11	12	13	14	15
 * 20	19	18	17	16
 * 21	22	23	24	25
*/
public class Exam_02 {

	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= 5; j++) {
					cnt++;
					System.out.print(cnt + "\t");
				}
				cnt += 5;
			} else {
				for (int k = 1; k <= 5; k++) {
					System.out.print(cnt + "\t");
					cnt--;
				}
				cnt += 5;
			}
			System.out.println();
		}
	}
}
