public class Exam_09 {
	public static void main(String[] args) {
		int score[] = { 45, 67, 89, 90, 88, 76, 80, 67 };
		System.out.print("자료: ");
		int tot = 0;
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
			tot += score[x]; // 배열 요소 합계
		}
		System.out.print("=" + tot + "\n");
		System.out.println("평균: " + tot / score.length);
	}
}
