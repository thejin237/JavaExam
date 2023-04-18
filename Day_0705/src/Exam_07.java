import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//객체생성
		System.out.print("입력하세요?");
		int bun = scn.nextInt();
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		System.out.println(bun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat);
		scn.close();
	}

}
