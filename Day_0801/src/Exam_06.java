public class Exam_06 {
	public static void main(String[] args) {
		function(5);
	}

	static void function(int n) {
		if (n == 0) {
			return;
		}
		System.out.println("Hello World !!");
		function(n - 1);
	}
}
