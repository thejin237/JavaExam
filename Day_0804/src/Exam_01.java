/* - 개체(Entity): 정보를 표현하는 단위, 속성은 있을 수 있지만 기능이 없음.
 * - 객체(Object): 사물(전산에서 소프트웨어, 시스템), 사상, 개념 단위
 * 객체에는 속성과 기능이 포함되어 있음.
 * 속성은 변수로 만들고, 기능(동작)은 메소드를 이용하여 만든다.
 * 객체지향 프로그래밍(OOP): Object Oriented Programming
 * 절차지향 프로그래밍: 모듈, 함수를 만들어놓고 호출하여 개발
*/
public class Exam_01 {
	public static void main(String[] args) {
		Mouse m1;// 참조변수선언
		m1 = new Mouse();// 객체 생성(인스턴스화)

		System.out.println("마우스 색상: " + m1.color);
		System.out.println("마우스 버튼수: " + m1.butten);
		System.out.println("마우스 용도: " + m1.memo);

		m1.color = "검정";
		m1.butten = 3;
		m1.memo = "게임용";

		System.out.println("마우스 색상: " + m1.color);
		System.out.println("마우스 버튼수: " + m1.butten);
		System.out.println("마우스 용도: " + m1.memo);

		System.out.println();
		m1.doubleClick();

		Mouse m2 = new Mouse();// m2 객체 생성
		System.out.println("마우스 색상: " + m2.color);
		System.out.println("마우스 버튼수: " + m2.butten);
		System.out.println("마우스 용도: " + m2.memo);

	}

}
