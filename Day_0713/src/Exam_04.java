import java.util.Scanner;

/*키보드로 정수를 입력받아서 합계, 평균을 구하여 출력
 * 입력: 75 88 95 70 84 72 54 67 ....-99
 * 합계: xx
 * 평균: xx.x
 * 
 * 조건: 1. 입력자료중 -99가 입력되면 출력 후 종료한다.
 * 		 2. 입력자료 중에서 75 ~ 90 사이 데이터만 사용한다.
*/
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = scn.nextInt();
			if(75<=num && num<=90) {
				sum+=num;
				cnt++;
			}else if(num==-99) {
				break;
			}
		}
		double avr = (int)((sum/cnt*100+0.5)/100.);
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avr);
	}
}
