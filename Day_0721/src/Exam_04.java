//90 2
//70 7
//점수 석차
public class Exam_04 {
	public static void main(String[] args) {
		int values[] = { 90, 70, 50, 80, 77, 85, 95, 85 };
		System.out.println("Source Data");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();
		System.out.println("점수\t석차");
		for(int i=0;i<values.length;i++) {
			int r = 1;
			System.out.print(values[i]+"\t");
			for(int j=0;j<values.length;j++) {
				if(values[i]<values[j]) {
					r++;
				}
			}
			System.out.println(r);
		}
	}
}
