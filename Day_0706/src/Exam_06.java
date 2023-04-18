import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력A:");
		int A = scanner.nextInt();
		String str = (A>=80)&(A<=90)?"합격":"불합격";
		System.out.println(A+"는 "+str+"입니다.");
		scanner.close();
	}

}
