class DD {
	// 메소드 오버로딩
	void sum() {
		System.out.println("sum()호출");
	}

	void sum(int x) {
		System.out.println("sum(int x)호출");
	}

	int sum(int x, int y) {
		System.out.println("sum(int x, int y)호출");
		return 0;
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		DD d = new DD();
		d.sum();
		d.sum(10);
		d.sum(10, 20);
	}

}
