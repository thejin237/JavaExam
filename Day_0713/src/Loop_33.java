//짝수, 홀수 합구하기
public class Loop_33 {

	public static void main(String[] args) {
		int s = 0;
		int t = 0;
		int sw = 0;
		for (int i = 1; i <= 100; i++) {
			if (sw == 0) {
				sw = 1;
				s += i;
			} else {
				sw = 0;
				t += i;
			}
		}
		System.out.println(s + "\t" + t);
	}
}
