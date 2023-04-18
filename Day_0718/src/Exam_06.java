public class Exam_06 {
	public static void main(String[] args) {
		// 배열의 선언과 동시 초기화
		int val[] = new int[5];
		val[0] = 1;
		val[1] = 2;
		val[2] = 3;
		val[3] = 4;
		val[4] = 5;

		int score[] = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
		}
	}
}
