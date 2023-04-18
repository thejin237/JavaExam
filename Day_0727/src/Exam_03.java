/* 메소드의 호출
 * 1. 값에의한 호출(Call By Value)
 * 2. 참조에 의한 호출(Call By Reference)
*/
public class Exam_03 {

	public static void main(String[] args) {
		int a[] = { 10, 20 };
		System.out.println("메소드 호출 전");
		System.out.println("a[0]=" + a[0] + ", a[1]=" + a[1]);

		System.out.println("메소드 호출 후");
		referenceSwap(a);
		System.out.println("a[0]=" + a[0] + ", a[1]=" + a[1]);
	}

	static void referenceSwap(int[] a) {
		int t = a[0];
		a[0] = a[1];
		a[1] = t;
	}

}
