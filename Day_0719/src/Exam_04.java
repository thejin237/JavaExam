/* 배열 val에 데이터가 {2,5,7,4,9,8,1,5,9,6} 저장되어 있을 경우
 * 7에 가장 가까운 값을 찾아서 출력
*/
public class Exam_04 {
	public static void main(String[] args) {
		int val[] = { 2, 5, 7, 4, 9, 8, 1, 5, 9, 6 };
		System.out.println("배열 데이터 List");
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + "\t");
		}
		System.out.println();

		// 프로그램 작성 위치
		int data = val[0];
		int min = (val[0] > 7) ? val[0] - 7 : 7 - val[0];
		for (int j = 0; j < val.length; j++) {
			int dif = (val[j] > 7) ? val[j] - 7 : 7 - val[j];
			if (min > dif) {
				min = dif;
				data = val[j];
			}
		}
		System.out.print("7과 가장 가까운 수: " + data);
	}
}
