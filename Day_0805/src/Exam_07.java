import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Person[] person = new Person[10];
		int cnt = 0;
		while (cnt < person.length) {
			System.out.print("학생등록:");
			int bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			person[cnt] = new Person(bun, name, kor, eng, mat);
			cnt++;
		}
		// 석차 계산
		PersonProcess pro = new PersonProcess();// PersonProcess의 객체(인스턴스) 생성
		pro.personRank(person, cnt);// personRank()메소드 호출

		// 번호순 오름차순 정렬 전 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t석차");
		for (int i = 0; i < cnt; i++) {
			person[i].personPrint();
		}
		// 번호순 정렬
		pro.personSort(person, cnt);// personSort()메소드 호출

		// 번호순 오름차순 정렬 후 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t석차");
		for (int i = 0; i < cnt; i++) {
			person[i].personPrint();
		}
	}
}
