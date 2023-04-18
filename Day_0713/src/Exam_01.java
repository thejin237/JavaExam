import java.util.Scanner;

/*while or for사용
 * 문제1] 키보드로 수검번호, 점수 7개를 입력받아서 최대점수, 최소점수를 뺀 총점
 * 평균을 구하여 출력(단, 평균은 소수 세 째자리에서 반올림하여 출력한다)
 * 반복문 (for(),while(),do-while()중 하나를 반드시 사용한다.
 * 입력데이터중 첫 번째 점수는 최대, 최소점수
*/

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력자료:");
		
		String num = scn.next(); //수검번호
		int score = scn.nextInt();
		int max = score;
		int min = score;
		int tot = score;
		for(int i=0;i<6;i++) {
			score = scn.nextInt();
			if(max < score) {
				max=score;
			}else if(min > score) {
				min=score;
			}
			tot += score;
		}
		tot = tot - max - min;
		double avr = (int)((tot/5.*100+0.5)/100.);
		//출력
		System.out.println("수검번호:"+num);
		System.out.println("최대점수:"+max);
		System.out.println("최소점수:"+min);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avr);
	}

}
