import java.util.Scanner;

public class Exam_07 {
	
	public static void maxmin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력A:");
		int A = scanner.nextInt();
		System.out.println("입력B:");
		int B = scanner.nextInt();
		
		int max = (A>B)?A:B;
		int min = (A<B)?A:B;
		System.out.println("MAX = "+max+", MIN = "+min);
		scanner.close();
	}
	
	public static void maxmin2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력A:");
		int A = scanner.nextInt();
		System.out.println("입력B:");
		int B = scanner.nextInt();
		System.out.println("입력C:");
		int C = scanner.nextInt();
		
		int maxAB = (A>B)?A:B;
		int minAB = (A<B)?A:B;
		int maxC = (maxAB<C)?C:maxAB;
		int minC = (minAB>C)?C:minAB;
		System.out.println("MAX = "+maxC+", MIN = "+minC);
		scanner.close();
	}
	public static void main(String[] args) {
		maxmin2();
	}
	
}
