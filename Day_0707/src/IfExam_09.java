import java.util.Scanner;
public class IfExam_09 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int m=0;
		if(a<b) {
			m=a; a=b; b=m;
		}
		if(a<c) {
			m=a; a=c; c=m;
		}
		if(b<c) {
			m=b; b=c; c=m;
		}
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		scn.close();
	}
}
