//Bubble Sort (버블 정렬)
public class Exam_03 {
	public static void main(String[] args) {
		int values[] = { 90, 70, 50, 80, 77, 85, 95 };
		System.out.println("Source Data");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();
		// 오름차순 정렬
		for(int i=0;i<values.length-1;i++) {
			for(int j=0;j<values.length-i-1;j++) {
				if(values[j]>values[j+1]) {
					int temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
				}
			}
		}
		System.out.println("Source Data");
		for (int k = 0; k < values.length; k++) {
			System.out.print(values[k] + "\t");
		}
	}
}
