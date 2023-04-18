//짝수, 홀수 합구하기
public class Loop_34 {

	public static void main(String[] args) {
		int s = 0;
		int t = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				t += i;
			} else {
				s += i;
			}
		}
	}
}
