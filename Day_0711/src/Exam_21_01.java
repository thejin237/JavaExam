
public class Exam_21_01 {
	public static void con() {
		int i = 0;
		int j = 1;
		int k = 1;
		
		while(j<23) {
			i += 1;
			j += i;
			k += j;
			if(j==22) {
				break;
			}
		}
		System.out.println(k);
	}
	public static void main(String[] args) {
		con();
	}
}
