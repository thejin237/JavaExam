/*	1	2	3	4	5
 * 10	9	8	7	6
 * 11	12	13	14	15
 * 20	19	18	17	16
 * 21	22	23	24	25
*/
public class Exam_03 {

	public static void main(String[] args) {
		int cnt = 0;
		int loop = 0; // +1, +9..;
		boolean flag = true;
		for (int i = 1; i <= 5; i++) {
			if (flag) {
				loop = loop + 1;
				cnt = loop;
				for (int j = 1; j <= 5; j++) {
					System.out.print(cnt + "\t");
					cnt++;
				}
				flag = false;
			} else {
				loop = loop + 9;
				cnt = loop;
				for (int k = 1; k <= 5; k++) {
					System.out.print(cnt + "\t");
					cnt--;
				}
				flag = true;
			}
			System.out.println();
		}
	}
}
