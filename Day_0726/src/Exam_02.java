import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String arr[][]=new String[10][3];
		int cnt=0;
		while(cnt<10) {
			System.out.print("등록:");
			arr[cnt][0]=scn.next();
			if(arr[cnt][0].equals("0")) {
				break;
			}
			arr[cnt][1]=scn.next();
			arr[cnt][2]=scn.next();
			cnt++;
		}
		int age[][]=new int[11][8];
		int mok=0;
		for(int i=0;i<cnt;i++) {
			int data=Integer.parseInt(arr[i][2]);
			mok=data/10;
			if(mok>=6){
				mok=6;
			}
			System.out.print(arr[i][mok]+"\t");
			for(int j=0;j<arr.length;j++) {
				
			}
		}
	}

}
