import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int stud[][] = new int[10][11]; 
		int cnt=0;
		while(cnt<10) {
			System.out.print("학생등록: ");
			stud[cnt][0]=scn.nextInt();
			if(stud[cnt][0]==0) {
				break;
			}
			for(int i=1;i<6;i++) {
				stud[cnt][i]=scn.nextInt();
			}
			stud[cnt][6]=stud[cnt][1];
			stud[cnt][7]=stud[cnt][1];
			//최대최소 계산
			for(int i=1;i<6;i++) {
				for(int j=i+1;j<6;j++) {
					if(stud[cnt][6]<stud[cnt][j]) {
						stud[cnt][6]=stud[cnt][j];
					}else if(stud[cnt][7]>stud[cnt][j]) {
						stud[cnt][7]=stud[cnt][j];
					}
				}
			}
			cnt++;
		}
		//출력
		System.out.println("*** 학생 입력자료***");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수 최소점수 합계\t평균");
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<stud[i].length-1;j++) {
				System.out.print(stud[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
