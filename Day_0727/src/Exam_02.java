/* 메소드의 호출
 * 1. 값에의한 호출(Call By Value)
 * 2. 참조에 의한 호출(Call By Reference)
*/
public class Exam_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("메소드 호출 전");
		System.out.println("a=" + a + ", b=" + b);

		System.out.println("메소드 호출 후");
		valueSwap(a, b);
		System.out.println("a=" + a + ", b=" + b);
	}

	static void valueSwap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}

	static void referenceSwap(int[] a) {
		int t = a[0];
		a[0] = a[1];
		a[1] = t;
	}

}
