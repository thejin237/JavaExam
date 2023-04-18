import java.util.Scanner;

/* 키보드로 이름, 국어, 영어, 수학 입력 총점, 평균, 학점을 구하여 출력
 * 학점은 100~90 ->A, 89~80-> 'B', 79~70->'C', 69~60->'D', 59~0->'F'
*/
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("입력(이름 국어 영어 수학):");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		scn.close();
		int tot = kor + eng + mat;
		double avr = (int)tot/3;
		String scalar = "A";
		
		if(avr<60) {
			scalar = "F";
		}else if(avr<70) {
			scalar = "D";
		}else if(avr<80) {
			scalar = "C";
		}else if(avr<90) {
			scalar = "B";
		}
		System.out.println("이름:"+ name);
		System.out.println("총점:"+ tot);
		System.out.println("평균:"+ avr);
		System.out.println("학점:"+ scalar);
	}
}
