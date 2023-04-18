import java.util.Scanner;

/*
*/
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("10진수: ");
		int val = scn.nextInt();
		int mok = val;
		String bin = "";

		while (mok != 0) { // mok > 1
			int m = mok / 2;
			int n = mok % 2;
			bin = n + bin;
			mok = m;
		}
		System.out.println("10진수 " + val + "는 2진수 " + bin);
	}
}