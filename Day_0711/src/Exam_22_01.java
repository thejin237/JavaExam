public class Exam_22_01 {
	public static void con() {
		int i = 0;
		int j = 1;
		int k = 1;
		
		while(i<10) {
			i += 1;
			j *= i;
			k += j;
		}
		System.out.println(k);
	}
	public static void main(String[] args) {
		con();
	}
}
