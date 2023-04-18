
public class Exam_01 {
	public static void main(String[] args) {
		int sMax = scoreMax(5, 7, 4);// 3개의 인수중 최대값 찾기
		System.out.println("sMax : " + sMax);
		sMax = scoreMax(9, 3, 5, 7, 8);// 5개의 인수중 최대값 찾기
		System.out.println("sMax : " + sMax);

		int values[] = { 7, 8, 5, 3, 8 };// 5개의 배열 인수중 최소값 찾기
		int vMin = valueMin(values);
		System.out.println("vMin : " + vMin);
		vMin = valueMin(new int[] { 4, 6, 8, 3, 2, 9, 6, 8 });// 8개의 배열 인수중 최소값 찾기
		System.out.println("vMin : " + vMin);
	}

	static int scoreMax(int... a) {// 배열로 인식, 배열과는 다름 (int... a!=int[] a)
		System.out.print("Data : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		int sMax = a[0];
		for (int i = 1; i < a.length; i++) {
			if (sMax < a[i]) {
				sMax = a[i];
			}
		}
		return sMax;
	}

	static int valueMin(int[] values) {
		System.out.print("Data : ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();
		int vMin = values[0];
		for (int i = 1; i < values.length; i++) {
			if (vMin > values[i]) {
				vMin = values[i];
			}
		}
		return vMin;
	}
}
