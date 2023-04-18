/* 메소드 유형
 * 1. 반환타입X, 매개변수X
 * 2. 반환타입X, 매개변수O
 * 3. 반환타입O, 매개변수X	--> Required return
 * 4. 반환타입O, 매개변수O
*/
public class Exam_01 {

	public static void main(String[] args) {

	}

	// 1. 반환타입X, 매개변수X
	static void sum() {

	}

	// 2. 반환타입X, 매개변수O
	static void sum2(int a, int b) {// 매개변수는 배열, 클래스, 기본 자료형 모두 가능

	}

	// 3. 반환타입O, 매개변수X
	static int sum3() {// 반환타입은 배열, 클래스, 기본 자료형
		return 1;// 반환타입과 일치해야 한다.
	}

	// 2. 반환타입O, 매개변수O
	static int sum4(int a, int b, int c[]) {
		return 0;
	}
}
