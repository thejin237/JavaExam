import java.util.Scanner;
/* 키보드로 정수 연산자 정수 입력하여 산술연산하는 프로그램
 * 산술연산: 7*5
 * 결과: 7 * 5 = 35
*/
public class IfExam_10 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("산술연산: ");
		int a=scn.nextInt();
		String op=scn.next();
		int b=scn.nextInt();
		int result = 0;
		if(op.equals("+")) {
			result = a+b;
		}else if(op.equals("-")) {
			result = a-b;
		}else if(op.equals("*")) {
			result = a*b;
		}else if(op.equals("/")) {
			result = a/b;
		}else if(op.equals("%")) {
			result = a%b;
		}else{
			System.out.println("연산자 오류");
			System.exit(1);
		}
		System.out.println(a + op + b + "="+ result);
		scn.close();
	}
}
