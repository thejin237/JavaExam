class Student {
	int bun;// 묵시적 초기화 0
	String name;// 묵시적 초기화 null
	int score = 70;// 명시적 초기화

	void stuPrint() {
		System.out.println("번호: " + bun);
		System.out.println("이름: " + name);
		System.out.println("점수: " + score);
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.bun = 1;
		s1.name = "김학생";
		s1.score = 90;
		s1.stuPrint();

		Student s2 = new Student();
		s2.stuPrint();
	}

}
