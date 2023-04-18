//2차원 배열, 식별자 배열명[줄수][칸수]
public class Exam_01 {
	public static void main(String[] args) {
		int value[][] = new int[5][5];
		System.out.println("value :" + value); // 주소
		System.out.println("value[0] :" + value[0]); // 주소
		System.out.println("value[0][0] :" + value[0][0]); // 값
		System.out.println("2차원 배열 출력");
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				System.out.print(value[i][j] + "\t");
			}
			System.out.println();
		}
		// 배열에 데이터 입력(1 2 3 4 . . 25)
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				k++;
				value[i][j] = k;
			}
		}
		System.out.println("2차원 배열 출력");
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				System.out.print(value[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
