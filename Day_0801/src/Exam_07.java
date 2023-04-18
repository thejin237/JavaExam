//1 ~ n까지 합계
public class Exam_07 {
	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(recu(10));
	}

	static int sum(int n) {
		int s = 0;
		for (int i = 0; i <= n; i++) {
			s += i;
		}
		return s;
	}

	// 1 ~ n 합계
	static int recu(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recu(n - 1);
	}
}
