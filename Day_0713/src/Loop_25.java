import java.util.Scanner;

//약수구하기(약수는 자신이하의 자연수 중에서 자신을 나누었을 때 나머지가 0인 수)
public class Loop_25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int l = 1;
		int n = scn.nextInt();
		while (l <= n) {
			int m = (int) (n / l);
			int g = n - (m * l);
			if (g == 0) {
				if(l!=n) {
					System.out.print(l + ",");
				}else {
					System.out.print(l);
				}
			}
			l += 1;
		}
	}
}
