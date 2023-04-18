import java.util.Scanner;

/*문제2] 사원들이 ID(아이디),GD(등급),TI(근무시간)을 입력받아서
 * 주간 급여를 계산하는 프로그램을 완성하시오
 * 사원의 주간급여는 근무시간과 시급을 곱한 값으로 한다
 * 시급은 사원의 등급이 1등급인 경우 10,000원. 2등급인 경우 5,000원, 
 * 3등급인 경우 2,000원으로 한다.
 * 근무 시간이 36시간을 초과한 경우 초과근무시간에 대해 시급의 1.5배를 지급하며
 * 근무시간은 최대 50시간까지만 인정된다.
 */
public class Exam_02 {
	public static void wage() {
		System.out.println("정보입력(아이디,등급,근무시간):");
		Scanner scn = new Scanner(System.in);
		String id = scn.next();
		int gd = scn.nextInt();
		int ti = scn.nextInt();
		scn.close();
		int ti_wage = 0;
		int ovti = 0;
		int wk_wage = 0;

		// 등급에 따른 시급처리
		switch (gd) {
		case 1:
			ti_wage = 10000;
			break;
		case 2:
			ti_wage = 5000;
			break;
		case 3:
			ti_wage = 2000;
			break;
		}

		// 36시간 초과 시급1.5배 근무시간 50시간이상은 50까지만 인정
		if (ti > 36) {
			ovti = ti - 36;
			if (ti >= 50) {
				ovti = 14; // ovti=50-36;
			}
			wk_wage = (int) ((ti_wage * 36) + (ti_wage * 1.5 * ovti));
		} else {
			wk_wage = ti_wage * ti;
		}

		// 출력
		System.out.println("아이디\t" + "등급\t" + "시급\t" + "근무시간\t" + "주간급여");
		System.out.print(id + "\t" + gd + "\t" + ti_wage + "\t" + ti + "\t\t" + wk_wage);
	}

	public static void main(String[] args) {
		wage();
	}
}
