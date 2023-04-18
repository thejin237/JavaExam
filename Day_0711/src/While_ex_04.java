import java.util.Scanner;

// 키보드로 5개의 데이터를 입력받아서 총점과 평균을 구하여 출력
public class While_ex_04 {
	
	public static void sum(){
		Scanner scn = new Scanner(System.in);
		int tot = 0;
		int cnt = 0;
		System.out.print("입력:");
		while(cnt<5) {
			int score = scn.nextInt();			
			tot +=score;
			cnt++;
		}
		scn.close();
		double avr = tot/5.;
			System.out.print("총점:"+tot);
			System.out.print("평균:"+avr);
		}
	
	public static void main(String[] args) {
		sum();
	}

}
