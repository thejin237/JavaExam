/* 인스턴스 멤버: 인스턴스(객체)가 생성될 때 생성이 된다.
 * 정적멤버: 클래스가 로딩되는 순간 생성된다.
*/
class AA {
	int a;// 인스턴스 멤버
	String name;// 인스턴스 멤버

	static int age;// 정적 멤버: 객체생성없이 접근 가능, 객체간 공유에 활용

	void test() {// 인스턴스 멤버
		age = 100;// 인스턴스 멤버에 정적멤버의 포함은 가능하다.
	}

	static void add() {// 정적 멤버에 인스턴스 멤버를 포함할 수 없다.
		age = 100;
		// a=100;//잘못된 활용(x)
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		// 정적 멤버: 객체생성 없이 접근 가능
		System.out.println("age=" + AA.age);
		AA aa = new AA();
		AA bb = new AA();
		aa.a = 100;
		aa.age = 200;
		System.out.println("a=" + aa.a);// 100
		System.out.println("age=" + aa.age);// 200
		System.out.println("---------------------");
		System.out.println("b=" + bb.a);// 0
		System.out.println("age=" + bb.age);// 200 객체관계 없이 age값을 공유
	}
}
