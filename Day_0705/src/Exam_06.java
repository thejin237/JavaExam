import java.util.Scanner;

//키보드입력용 클래스 활용
//Scanner
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //참조변수 Scanner 선언
		int bun,kor,eng,mat;
		String name;
		System.out.print("번호:");
		bun = scn.nextInt();
		
		System.out.print("이름:");
		name = scn.next();
		
		System.out.print("국어:");
		kor = scn.nextInt();
		
		System.out.print("영어:");
		eng = scn.nextInt();
		
		System.out.print("수학:");
		mat = scn.nextInt();
		
		int tot = kor + eng + mat;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
		System.out.println(bun +"\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot);
		scn.close();
	}

}
