/* 메소드(Method) ->함수: 기능을 수행할 수 있는 기본 단위
 * 반환타입 매소드명(매개변수리스트){//반환타입 없을 경우 void
 * 
 * 	반환(return);
 * }
*/
public class Exam_01 {
	public static void main(String[] args) {
		System.out.println("매소드 호출 테스트");
		test();
		test2();// 반환값을 저장할 공간이 없으므로 반환된 값이 버려짐.
		int s = test2();
		System.out.println("s=" + s);
		test3(10);
		System.out.println("1~10합=" + test4(1, 10));
	}

	static void test() { // 반환타입X, 매개변수X, main매소드와 동급일 경우 static으 붙임.
		System.out.println("test() 매소드가 호출");
		return;// 매소드를 종료하라는 의미가 됨. 더 이상 작업이 의미없음
	}

	static int test2() { // 반환(리턴)타입O, 매개변수X
		int s = 0;
		for (int i = 1; i <= 5; i++) {
			s += i;
		}
		return s;
	}

	static void test3(int n) { // 반환타입X, 매개변수O: 1개
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		System.out.println("1~" + n + "합: " + s);
	}

	static int test4(int n, int m) { // 반환타입O, 매개변수O: 2개
		int s = 0;
		for (int i = n; i <= m; i++) {
			s += i;
		}
		return s;
	}
}
