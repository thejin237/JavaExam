import java.util.Scanner;

// 키보드로 N개의 데이터를 입력받아서 합과 평균을 구하여 출력
//단, 입력자료중에 -99가 있으면 입력자료의 끝으로 판단 프로그램을 종료한다.
public class While_ex_03 {
	
	public static void sum(){
		Scanner scn = new Scanner(System.in);
		int tot = 0;
		int cnt = 0;
		System.out.print("데이터입력:");
		while(true) {
			int score = scn.nextInt();
			if(score==-99) {
				break;
			}
			cnt++;
			tot+=score;
			System.out.print("합:"+tot);
			System.out.print("평균:"+tot/cnt);
		}
		scn.close();
	}
	public static void main(String[] args) {
		sum();
	}

}
