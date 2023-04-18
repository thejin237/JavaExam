import java.util.Scanner;

/* 키보드로 이름, 국어, 영어, 수학 입력 총점, 평균, 학점을 구하여 출력
 * 학점은 100~90 ->A, 89~80-> 'B', 79~70->'C', 69~60->'D', 59~0->'F'
*/
public class Exam_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("입력(이름 국어 영어 수학):");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		scn.close();
		int tot = kor + eng + mat;
		double avr = tot/3;
		String scalar = "F";
		
		switch((int)avr/10) {
		case 10:
		case 9:
			scalar = "A";
			break;
		case 8:
			scalar = "B";
			break;
		case 7:
			scalar = "C";
			break;
		case 6:
			scalar = "D";
			break;
		}
		
		System.out.println("이름:"+ name);
		System.out.println("총점:"+ tot);
		System.out.println("평균:"+ avr);
		System.out.println("학점:"+ scalar);
	}
}
