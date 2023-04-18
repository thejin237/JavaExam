import java.util.Scanner;

/* 키보드로 번호, 이름, 점수를 입력(최대 10명)
 * 입력시 번호가 0또는 10명이면 입력 종료
 * -입력종료시 전체평균을 구하여 출력하고 평균이상인 학생명단을 출력
 * -전체평균: xx
 * 평균이상 학생 명단
 * 번호		이름	점수
 * .		.		.
 * 점수가 가장 높은 학생
 * 번호:xx,	이름: xx,	점수:xx
*/
class Student {
	int bun;
	String name;
	int score;

	public Student() {
	}

	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	void stPrint() {
		System.out.println(bun + "\t" + name + "\t" + score);
	}

	void maxPrint() {
		System.out.println("번호:" + bun + "\t이름:" + name + "\t점수:" + score);
	}
}

public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student st[] = new Student[10];
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("입력:");
			int bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			String name = scn.next();
			int score = scn.nextInt();
			st[cnt] = new Student(bun, name, score);
			cnt++;
		}
		// 점수 합계
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum += st[i].score;
		}
		// 전체 평균
		double ave = (int) (sum / cnt * 10 + 0.5) / 10.;
		System.out.println("전체 평균: " + ave);

		// 평균이상 학생 명단
		System.out.println("평균이상 학생 명단");
		System.out.println("번호\t이름\t점수");
		for (int i = 0; i < cnt; i++) {
			if (st[i].score >= ave) {
				st[i].stPrint();
			}
		}

		// 점수가 가장 높은 학생
		System.out.println("점수가 가장 높은 학생");
		Student max = st[0];
		for (int i = 0; i < cnt; i++) {
			if (max.score < st[i].score) {
				max = st[i];
			}
		}
		max.maxPrint();
	}

}
