import java.util.Scanner;
public class IfExam_07 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max=a;
		int min=a;
		if(max<b) {
			max=b;
		}
		else if(min>b) {
			min=b;
		}
		if(max<c) {
			max=c;
		}
		else if(min>c) {
			min=c;
		}
		System.out.println("MAX = " + max);
		System.out.println("MIN = " + min);
		scn.close();
	}
}
