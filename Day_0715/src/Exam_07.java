/*	1	2	3	4	10
 * 	5	6	7	8	36
 * 	9	10	11	12	78
 * 	13	14	15	16	136
 * 	17	18	19	20	210(누계)
*/
public class Exam_07 {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				cnt++;
				System.out.print(cnt + "\t");
				sum += cnt;
			}
			System.out.println(sum);
		}
		System.out.println();
	}
}
