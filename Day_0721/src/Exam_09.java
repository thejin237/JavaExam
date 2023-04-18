import java.util.Scanner;

//10진수를 2진수로 변환
//배열이용
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("10진수 입력(1024이내): ");
			int dec = scn.nextInt();
			if (dec == -99) {
				System.out.println("프로그램 종료");
				break;
			}
			if (dec >= 1024) {
				System.out.println("입력오류");
				continue;
			}

			// 2진수 변환
			int bin[] = new int[10];
			int mok = dec;
			for (int i = 0; i < bin.length; i++) {
				bin[i] = mok % 2;
				mok /= 2;
			}
			for (int j = bin.length - 1; j >= 0; j--) {
				System.out.print(bin[j] + "\t");
			}
			System.out.println();
		}
	}
}
