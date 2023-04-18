import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student st1 = new Student();

		System.out.print("등록:");
		st1.bun = scn.nextInt();
		st1.name = scn.next();
		st1.score = scn.nextInt();
		System.out.println("번호\t이름\t점수");
		// System.out.println(st1.bun + "\t" + st1.name + "\t" + st1.score);
		st1.stuPrint();
	}
}
