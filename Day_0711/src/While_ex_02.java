public class While_ex_02 {

	public static void con() {
		int i = 0; 
		int s = 0;
		while(true) {
			i+=1;
			s+=i;
			if(i==10) {
				break;
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		con();
		
	}
}

