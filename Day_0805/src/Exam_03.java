class BB {
	int a;
	int b;
	// 생성자-->객체 생성 시 호출
	BB() {
		System.out.println("BB() 생성자 초기화");
		a = 10;
		b = 100;
	}
	// 인스턴스 초기화 블럭-->객체 생성 시 호출
	{
		System.out.println("인스턴스 초기화 블럭");
		a = 20;
		b = 150;
	}
	// 정적초기화 블럭--> 가장 먼저 단 한번만 호출
	static {
		System.out.println("정적 초기화 블럭");
	}

}

public class Exam_03 {
	public static void main(String[] args) {
		System.out.println("BB -1");
		BB b1 = new BB();
		System.out.println("a=" + b1.a);
		System.out.println("b=" + b1.b);

		System.out.println("BB -2");
		BB b2 = new BB();
		System.out.println("a=" + b2.a);
		System.out.println("b=" + b2.b);

		System.out.println("BB -3");
		BB b3 = new BB();
		System.out.println("a=" + b3.a);
		System.out.println("b=" + b3.b);
	}
}
