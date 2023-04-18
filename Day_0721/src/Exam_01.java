//Selection Sort(선택정렬)
public class Exam_01 {
	public static void main(String[] args) {
		int values[] = { 90, 70, 50, 80, 77, 85, 95 };
		System.out.println("Source Data");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();
		// 오름차순 정렬
		System.out.println();
		System.out.println("==========오름차순==========");
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] > values[j]) {
					int temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
		System.out.println("Source Data");
		for (int k = 0; k < values.length; k++) {
			System.out.print(values[k] + "\t");
		}
		// 내림차순 정렬
		System.out.println();
		System.out.println("==========내림차순==========");
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] < values[j]) {
					int temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
		System.out.println("Source Data");
		for (int k = 0; k < values.length; k++) {
			System.out.print(values[k] + "\t");
		}
	}
}
