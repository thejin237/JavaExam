//final -> 상수
class BB {
	final static double PI = 3.14;// final 상수화시킬 때 사용
	int a = 100;
}

public class Exam_04 {
	public static void main(String[] args) {
		BB b1 = new BB();
		System.out.println("a=" + b1.a);
		// b1.a=200*BB.PI;
		System.out.println("a=" + b1.a);
	}
}
