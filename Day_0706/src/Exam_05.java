import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("정수입력:");
		int score = scanner.nextInt();
		
		//String str = (score%2==0)?"짝수":"홀수";
		//System.out.println(score+"는 " + str + "입니다.");
		String str = (score>=80)?"합격":"불합격";
		System.out.println(score+"는 " + str + "입니다.");
		scanner.close();
	}

}
