public class Exam_20_03 {
	public static void con() {
		int i = 0;
		int s = 0;
		int sw = 0;
		
		do{
			i +=1;
			if(sw==0) {
				s +=i;
				sw=1;
			}else {
				s -= i;
				sw=0;
			}
		}while(i<10);
		System.out.println(s);
	}
	public static void main(String[] args) {
		con();
	}
}
