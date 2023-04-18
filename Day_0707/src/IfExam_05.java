import java.util.Scanner;
public class IfExam_05 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		System.out.println("MAX = " + max);
		scn.close();
	}
}
