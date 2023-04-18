public class Exam_04 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.bun = 2;
		stu1.name = "김학생";
		stu1.score = 88;
		System.out.println(stu1.bun + "\t" + stu1.name + "\t" + stu1.score);

		Student stu2 = new Student(1, "김학생", 90);
		System.out.println(stu2.bun + "\t" + stu2.name + "\t" + stu2.score);
	}
}
