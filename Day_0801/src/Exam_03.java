public class Exam_03 {
	public static void main(String[] args) {
		int score[] = { 10, 90, 56, 88, 75, 46, 79 };
		int a = 10, b = 30, c = 70;

		// 1. a,b,c 세 개의 변수를 이용한 대중소를 찾아서 출력하는 메소드 작성
		maxMidMin(a, b, c);
		// 2. score배열을 이용하여 합계를 구하여 반환하는 메소드 작성
		System.out.println(scoreSum(score));
		// 3. score 배열을 이용하여 내림차순 정렬 메소드 작성
		arange(score);
	}

	static void maxMidMin(int a, int b, int c) {
		int max = a;
		int mid = a;
		int min = a;
		for (int i = 0; i < 3; i++) {
			if (max < b) {
				max = b;
				if (b < c) {
					max = c;
					mid = b;
				} else if (b > c) {
					mid = c;
				}
			} else if (min > b) {
				min = b;
				if (b > c) {
					mid = b;
					min = c;
				}
			}
		}
		System.out.println("대:" + max + ",중:" + mid + ",소:" + min);
	}

	static int scoreSum(int score[]) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

	static void arange(int score[]) {
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.print(score[i] + "\t");
		}
	}
}
