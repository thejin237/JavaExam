//클래스 구성요소
class AA {// 멤버 필드만으로 구성된 클래스
	int x;// 멤버 필드(변수)
	int y;
}

class BB {// 멤버 메소드만으로 구성된 클래스
	void test() {
	}// 멤버 메소드

	int add() {
		return 0;
	}
}

class CC {// 멤버 필드, 멤버 메소드, 다른 클래스의 필드로 구성
	int x;
	int y;
	AA a;// 포함관계: 클래스 내에 다른 클래스 필드를 포함

	// 생성자 오버로딩
	public CC() {

	}

	public CC(int x) {
		this(x, 100);
		this.x = x;
	}

	public CC(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA a = new AA();// 참조필드(변수)
		int b = 10;// 일반필드(변수)
		String s = "AA";// 참조필드(변수),String클래스 오버라이딩처리로 값이 출력되는 것으로 보임
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);

		a.x = 30;
		a.y = 20;
		System.out.println("x=" + a.x);
		System.out.println("y=" + a.y);

		CC c = new CC();
		c.x = 50;
		c.y = 45;
		c.print();

		CC c2 = new CC(100);
		c2.print();
		CC c3 = new CC(100, 200);
		c3.print();
	}

}
