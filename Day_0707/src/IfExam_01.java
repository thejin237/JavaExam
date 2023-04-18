import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		int A = scn.nextInt();
		if(A>80) {
			System.out.println("Pass");
		}else {
		System.out.println("NoPass");
		}
		System.out.println("END");
		scn.close();
	}

}
