import java.util.Scanner;

//객체 배열
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student stu[] = new Student[10];

		int cnt;
		Student student;
		for (cnt = 0; cnt < stu.length; cnt++) {
			System.out.print("학생등록:");
			int bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			String name = scn.next();
			int score = scn.nextInt();
			// stu[cnt] = new Student(bun,name,score);

			student = new Student(bun, name, score);
			stu[cnt] = student;
		}
		// 출력
		System.out.println("번호\t이름\t점수");
		for (int i = 0; i < cnt; i++) {
			stu[i].stuPrint();
		}
		// 번호를 기준으로 오름차순 정렬
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (stu[i].bun > stu[j].bun) {
					Student temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		}
		// 번호를 기준으로 오름차순 출력
		System.out.println("번호\t이름\t점수");
		for (int i = 0; i < cnt; i++) {
			stu[i].stuPrint();
		}
	}
}
