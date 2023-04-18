import java.util.Scanner;

//사칙연산 계산기
class Cal2 {
	double a;
	double b;
	String logic;

	void sw(String logic) {
		switch (logic) {
		case "+":// 덧셈
			this.add(a, b);
			break;
		case "-":// 뺄셈
			this.sub(a, b);
			break;
		case "*":// 곱셈
			this.mul(a, b);
			break;
		case "/":// 나눗셈
			this.div(a, b);
			break;
		}
	}

	// +
	void add(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		for (int i = 1; i <= x.length - 1; i++) {
			sum += x[i];// 덧셈 계산
		}
		sumPrint(sum);
	}

	// -
	void sub(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		for (int i = 1; i <= x.length - 1; i++) {
			sum -= x[i];// 뺄셈 계산
		}
		sumPrint(sum);
	}

	// *
	void mul(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		for (int i = 1; i <= x.length - 1; i++) {
			sum *= x[i];// 곱셈 계산
		}
		sumPrint(sum);
	}

	// /
	void div(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		for (int i = 1; i <= x.length - 1; i++) {
			sum /= x[i];// 나눗셈 계산
		}
		sumPrint(sum);
	}

	void sumPrint(double sum) {
		if (sum * 10 % 10 == 0) {// 소수점 첫째자리 가 0이면
			System.out.println("= " + (int) sum);// 정수형변환 후 sum출력
		} else {// 소수점 첫째자리가 0이 아니면
			System.out.println("= " + sum);// sum 출력
		}
	}
}

public class Exam_05_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Cal2 c = new Cal2();
		while (true) {
			System.out.print("입력(숫자 연산자 숫자)(0:종료):");
			c.a = scn.nextDouble();
			if (c.a == 0) {
				System.out.println("계산기 프로그램을 종료합니다.");
				break;
			}
			c.logic = scn.next();
			c.b = scn.nextDouble();
			c.sw(c.logic);// Cal2클래스의 매개변수 c.logic으로 참조변수 c의 sw()메소드 호출
		}
	}

}
