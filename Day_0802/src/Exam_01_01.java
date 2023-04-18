
public class Exam_01_01 {
	// 메소드 오버로딩(메소드 이름은 동일, 매개변수의 타입 또는 갯수가 달라야한다)
	static int scoreMax(int a, int b,int c) {
		return 0;
	}
	static int scoreMax(int a, int b,int c, int d, int e) {
		return 0;
	}
	
	public static void main(String[] args) {
		int sMax = scoreMax(5, 7, 4);// 3개의 인수중 최대값 찾기
		System.out.println("sMax : " + sMax);
		sMax = scoreMax(9, 3, 5, 7, 8);
		System.out.println("sMax : " + sMax);

		int values[] = { 7, 8, 5, 3, 8 };
		int vMin = valueMin(values);
		System.out.println("vMin : " + vMin);
		vMin = valueMin(new int[] { 4, 6, 8, 3, 2, 9, 6, 8 });
		System.out.println("vMin : " + vMin);
	}
	static int valueMin(int[] values) {
		return 0;
	}
}
