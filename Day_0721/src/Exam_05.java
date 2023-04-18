public class Exam_05 {
	public static void main(String[] args) {
		int values[] = { 90, 70, 50, 80, 77, 85, 95, 85 };
		int rank[] = new int[values.length]; //0초기화
		//int rank[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
		//순위구하기
		for(int i=0;i<values.length;i++) {
			rank[i]=1;
			for(int j=0;j<values.length;j++) {
				if(values[i]<values[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("Data Output");
		System.out.print("점수:\t");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		System.out.println();
		
		System.out.print("순위:\t");
		for(int i=0;i<values.length;i++) {
			System.out.print(rank[i]+"\t");
		}
		System.out.println();
		//순위를 기준으로 오름차순 정렬
		// 순위: 1 2 3 . . .
		// 점수: 95 . . .
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values.length;j++) {
				if(rank[i]<rank[j]) {
					int temp = rank[i];
					rank[i]=rank[j];
					rank[j]=temp;
					temp = values[i];
					values[i]=values[j];
					values[j]=temp;
				}
			}
		}
		System.out.println("Data Output");
		System.out.print("순위:\t");
		for(int i=0;i<values.length;i++) {
			System.out.print(rank[i]+"\t");
		}
		System.out.println();
		System.out.print("점수:\t");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
	}
}
