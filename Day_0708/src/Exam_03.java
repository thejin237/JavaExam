import java.util.Scanner;

//키보드로 정수 연산자 정수를 입력받아서 사칙연산하는 프로그램
public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("입력:");
		int value1 = scn.nextInt();
		String op = scn.next();
		int value2 = scn.nextInt();
		
		System.out.print(value1 + op + value2 + "=");
		switch(op) {
		case"+":
			System.out.print(value1+value2);
			break;
		case"-":
			System.out.print(value1-value2);
			break;
		case"*":
			System.out.print(value1*value2);
			break;
		case"/":
			System.out.print(value1/value2);
			break;
		case"%":
			System.out.print(value1%value2);
			break;
		}
		scn.close();
	}

}
