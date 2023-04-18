/*1. Source Data
 * 번호: 5	2	7	4	9	6	3	1	8
 * 점수: 78	55	96	88	69	70	85	77	90
 * 
 * 2. 번호순 정렬(오름차순)
 * 번호: 1	2	3	4	5	6	7	8	9
 * 점수: 77	55	85	88	78	70	96	90	69
 * 
 * 3. 점수순 정렬(내림차순)
 * 번호: 7	8	4	3	5	1	6	9	2
 * 점수: 96	90	88	85	78	77	70	69	55
*/
public class Exam_02 {
	public static void main(String[] args) {
		int bun[] = { 5, 2, 7, 4, 9, 6, 3, 1, 8 };
		int score[] = { 78, 55, 96, 88, 69, 70, 85, 77, 90 };
		System.out.println("Source Data");
		System.out.print("번호:\t");
		for (int i = 0; i < bun.length; i++) {
			System.out.print(bun[i] + "\t");
		}
		System.out.print("\n점수:\t");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();
		// 번호순 정렬(오름차순)
		for (int i = 0; i < bun.length - 1; i++) {
			for (int j = i + 1; j < bun.length; j++) {
				if (bun[i] > bun[j]) {
					int temp = bun[i];
					bun[i] = bun[j];
					bun[j] = temp;
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		System.out.println("=====번호순 정렬(오름차순)=====");
		System.out.println("Source Data");
		System.out.print("번호:\t");
		for (int i = 0; i < bun.length; i++) {
			System.out.print(bun[i] + "\t");
		}
		System.out.print("\n점수:\t");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();

		// 점수순 정렬(내림차순)
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					temp = bun[i];
					bun[i] = bun[j];
					bun[j] = temp;
				}
			}
		}
		System.out.println("=====점수순 정렬(내림차순)=====");
		System.out.println("Source Data");
		System.out.print("번호:\t");
		for (int i = 0; i < bun.length; i++) {
			System.out.print(bun[i] + "\t");
		}
		System.out.print("\n점수:\t");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();
	}
}
