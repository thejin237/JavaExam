import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = scanner.next();
		String str2 = scanner.nextLine();
		int bun = scanner.nextInt();
		int kor = scanner.nextInt();
		System.out.println("str="+str);
		System.out.println("str2="+str2);
		System.out.println("bun="+bun);
		System.out.println("kor="+kor);
		scanner.close();
	}

}
