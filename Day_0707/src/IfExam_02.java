import java.util.Scanner;

public class IfExam_02 {

	public static void main(String[] args) {
		int a=8, b=5;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("정수입력: ");
		int sw = scn.nextInt();
		if(sw==1) {
			System.out.println(a+"+"+b+"="+(a+b));
		}else if(sw==2) {
			System.out.println(a+"-"+b+"="+(a-b));
		}else if(sw==3) {
			System.out.println(a+"*"+b+"="+(a*b));
		}else if(sw==4) {
			System.out.println(a+"/"+b+"="+(a/b));
		}else if(sw==5) {
			System.out.println(a+"%"+b+"="+(a%b));
		}else {
			System.out.println("입력오류");
		}
		System.out.println("END");
		scn.close();
	}
}
