//사칙연산 계산기
class Cal {
	// +
	void add(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		System.out.print(x[0] + "+");
		for (int i = 1; i <= x.length - 1; i++) {
			sum += x[i];// 덧셈 계산
			System.out.print(x[i]);
			if (i != x.length - 1) {// 마지막 "+"기호 생략
				System.out.print("+");
			}
		}
		if (sum * 10 % 10 == 0) {// 소수점 첫째자리 가 0이면
			System.out.println("=" + (int) sum);// 소수점 첫째자리가 0이면
		} else {
			System.out.println("=" + sum);
		}
	}

	// -
	void sub(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		System.out.print(x[0] + "-");
		for (int i = 1; i <= x.length - 1; i++) {
			sum -= x[i];// 뺄셈 계산
			System.out.print(x[i]);
			if (i != x.length - 1) {
				System.out.print("-");
			}
		}
		if (sum * 10 % 10 == 0) {
			System.out.println("=" + (int) sum);
		} else {
			System.out.println("=" + sum);
		}
	}

	// *
	void mul(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		System.out.print(x[0] + "*");
		for (int i = 1; i <= x.length - 1; i++) {
			sum *= x[i];// 곱셈 계산
			System.out.print(x[i]);
			if (i != x.length - 1) {
				System.out.print("*");
			}
		}
		if (sum * 10 % 10 == 0) {
			System.out.println("=" + (int) sum);
		} else {
			System.out.println("=" + sum);
		}
	}

	// /
	void div(double... x) {
		double sum = x[0];// 첫 입력 값을 sum에 저장
		System.out.print(x[0] + "/");
		for (int i = 1; i <= x.length - 1; i++) {
			sum /= x[i];// 나눗셈 계산
			System.out.print(x[i]);
			if (i != x.length - 1) {
				System.out.print("/");
			}
		}
		if (sum * 10 % 10 == 0) {
			System.out.println("=" + (int) sum);
		} else {
			System.out.println("=" + sum);
		}
	}

}

public class Exam_05 {
	public static void main(String[] args) {
		Cal c = new Cal();
		// 덧셈 메소드 add() 호출
		c.add(30, 40, 20);
		c.add(30, 40, 20.66);
		c.add(30.412, 40.5243, 60.0638, 60);

		// 뺏셈 메소드 sub() 호출
		c.sub(330, 40, 20);
		c.sub(30, 40, 20);
		c.sub(330, 40, 20.66);
		c.sub(30.412, 40.5243, 60.0638, 60);

		// 곱셈 메소드 mul() 호출
		c.mul(40, 20);
		c.mul(100, 20);
		c.mul(30.4, 40.52, 60.0638, 60);

		// 나눗셈 메소드 div() 호출
		c.div(40, 20);
		c.div(100, 20);
		c.div(30.4, 40.52, 60.0638, 60);
	}

}
