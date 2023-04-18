import java.util.Scanner;

//점수 5개 입력 총점, 평균 출력
public class For_ex_03 {

	public static void tot() {
		Scanner scn = new Scanner(System.in);
		int tot = 0;
		System.out.println("입력");
		for (int i = 0; i < 5; i++) {
			int score = scn.nextInt();
			tot += score;
		}
		scn.close();
		System.out.println("총점=" + tot);
		System.out.println("평균=" + tot / 5);
	}

	public static void main(String[] args) {
		tot();
	}

}
