//반복처리 1~100까지 홀수, 짝수 합계
public class Loop_32 {

	public static void main(String[] args) {
		int s = 0;
		for (int i = 0; i <= 100; i += 2) {
			s += i;
		}
		System.out.println(s);
	}
}
