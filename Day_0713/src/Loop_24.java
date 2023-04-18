import java.util.Scanner;

//문제)임의의 값을 입력 받아 누적건수와 누적 합계(입력값이 0이면 종료)

public class Loop_24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int i = 0;
		int s = 0;

		while (true) {
			System.out.println("입력:");
			int a = scn.nextInt();
			if (a == 0) {
				break;
			}
			i++;
			s += a;
		}
		System.out.println("i값:" + i);
		System.out.println("s값:" + s);
	}
}
