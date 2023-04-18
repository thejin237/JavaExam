//재귀(Recursion)함수 - 끝날 수 있는 조건을 만들어야 한다.
public class Exam_05 {
	public static void main(String[] args) {
		function();
	}

	static void function() {
		System.out.println("Hello World !!");
		function();
	}

}
