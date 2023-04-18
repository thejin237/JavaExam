public class Exam_22_02 {
	public static void con() {
		int j = 1;
		int k = 1;
		
		for(int i=1;i<11;i++) {
			j *= i;
			k += j;
		}
		System.out.println(k);
	}
	public static void main(String[] args) {
		con();
	}
}
