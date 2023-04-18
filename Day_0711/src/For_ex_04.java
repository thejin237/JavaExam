import java.util.Scanner;

/*키보드로 점수 최대 5개를 입력 총점 평균 출력
 * 단, 입력값에 -(음수) 가 있는 경우는 제외하고 5개 입력한다.
*/
public class For_ex_04 {
	
	public static void tot(){
		Scanner scn = new Scanner(System.in);
		int tot = 0;
		int cnt = 0;
		System.out.println("입력");
		/*
		 * for(int i=0; i<5; i++) { 
		 * int score = scn.nextInt(); 
		 * if(score<0) {
		 * i--;
		 * continue; 
		 * }
		 *	tot+=score;
		 */	
			while(cnt<5) {
			int score = scn.nextInt();
			if(score<0) {
				continue;
			}
			scn.close();
			cnt++;
			tot+=score;
	}
		System.out.println("총점="+tot);
		System.out.println("평균="+tot/5);
	}
	
	public static void main(String[] args) {
		tot();
	}

}
