import java.util.Scanner;
/* 1~100 사이의 정수점수를 입력받아서 다음과 같이 출력
 * 점수입력: XX
 * 
 * 1. 점수가 100보다 크거나 1보다 작으면 "입력오류"
 * 2. 점수가 1~55 ->"F", 56~73 -> "D", 74~85 ->"C"
 * 	  86~92 ->"B", 93~100 ->"A"
 */
public class IfExam_03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		int scr = scn.nextInt();
		
		if(scr<1||scr>100) {
			System.out.println("입력오류");
			System.exit(1);
		}
		String str; //int a=0;
		if(scr<=55) {
			str="F";
		}else if(56<=scr&&scr<=73){
			str="D";
		}else if(74<=scr&&scr<=85){
			str="C";
		}else if(86<=scr&&scr<=92){
			str="B";
		}else {
			str="A";
		}
		System.out.println(scr+":"+str);
		scn.close();
	}
}
