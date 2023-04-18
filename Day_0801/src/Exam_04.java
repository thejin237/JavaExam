/* 매개변수의 수가 변함: 가변인자
*/
public class Exam_04 {
	public static void main(String[] args) {
		int max = scoreMax(40, 50);
		System.out.println(max);
		max = scoreMax(40, 50, 90);
		System.out.println(max);
		max = scoreMax(40, 60, 50, 95);
		System.out.println(max);
		max = scoreMax(30, 40, 70, 43, 50);
		System.out.println(max);
		max = scoreMax(30, 40, 70, 43, 50, 99);
		System.out.println(max);
	}

	static int scoreMax(int... a) {// 가변인자-- 배열
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max; // max값 리턴
		// 리턴값은 오직 1개의 값만 반환이 가능하다.
		// 여러 개의 값을 이턴하고자 하는경우 식별자를 배열로 선언한다.
	}

}
