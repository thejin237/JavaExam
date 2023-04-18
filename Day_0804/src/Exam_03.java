class point {
	// 멤버변수
	int x;
	int y;

	// 멤버메소드
	void paint() {
		System.out.println(x + "부터" + y + "까지 그림을 그립니다");
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		point p1, p2, p3;// 참조변수 또는 레퍼런스변수
		p1 = new point();// 객체를 생성해서 참조주소를 대입
		p2 = new point();// 객체를 생성해서 참조주소를 대입
		p3 = new point();// 객체를 생성해서 참조주소를 대입

		p1.x = 100;
		p1.y = 200;
		p2 = p1;
		p3.x = 150;
		p3.y = 250;
		if (p1.x > p3.x) {

		}

	}

}
