public class Exam_20_02 {
	public static void con() {
		int s = 0;
		int sw = 0;
		
		for(int i=0;i<10;i++) {
			if(sw==0) {
				s +=i;
				sw=1;
			}else {
				s -= i;
				sw=0;
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		con();
	}
}
