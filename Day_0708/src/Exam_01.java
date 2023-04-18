import java.util.Scanner;
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력(이름 국어 영어 수학):");
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int mat = scanner.nextInt();
		
		int tot = kor+eng+mat;
		int avr = tot/3;
		
		String reason = "";
		String jud = "";
		if(40>kor||40>eng||40>mat) {
			jud = "불합격"; reason = "과락";
		}else if(avr<60) {
			jud = "불합격"; reason = "평균미만";
		}else {
			jud = "합격";
		}
		
		System.out.println("이름:"+name);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avr);
		System.out.println("판정:"+jud);
		if(jud.equals("불합격")) {
		System.out.println("불합격사유:"+reason);
		}
		scanner.close();
	}
}
