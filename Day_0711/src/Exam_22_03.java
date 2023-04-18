
public class Exam_22_03 {
	public static void con() {
		int i = 0;
		int j = 1;
		int k = 1;
		
		do{
			i += 1;
			j *= i;
			k += j;
		}while(i<10);
		System.out.println(k);
	}
	public static void main(String[] args) {
		con();
	}
}
