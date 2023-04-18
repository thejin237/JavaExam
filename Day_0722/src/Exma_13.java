import java.util.Scanner;

/* 키보드로 번호 국어 영어 수학 입력 배열에 저장 후
 * 총점 평균 석차를 구하여 출력
 * 단 학생수는 10명이내로 한다.
*/
public class Exma_13 {
	public static void main(String[] args) {
		int hak[][] = new int[10][4];
		Scanner scn = new Scanner(System.in);
		// 입력작업
		int cnt = 0;
		for (cnt = 0; cnt < 10; cnt++) {
			System.out.print((cnt + 1) + "번째 학생정보등록 : ");
			hak[cnt][0] = scn.nextInt(); // 번호
			if (hak[cnt][0] == -99)
				break; // 번호가 -99이면 종료
			hak[cnt][1] = scn.nextInt(); // 국어
			hak[cnt][2] = scn.nextInt(); // 영어
			hak[cnt][3] = scn.nextInt(); // 수학
		}
		// 출력작업

//		  System.out.println("번호\t국어\t영어\t수학"); 
//		  for(int i=0;i<cnt;i++) {
//		  System.out.print(hak[i][0]+"\t"); 
//		  System.out.print(hak[i][1]+"\t");
//		  System.out.print(hak[i][2]+"\t"); 
//		  System.out.print(hak[i][3]+"\n"); 
//		  }

		System.out.println("번호\t국어\t영어\t수학");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(hak[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
