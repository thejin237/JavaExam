public class For_ex_02 {
	
	public static void tot(){
		int s=0;
		for(int i=10; i>0; i--) {
			s += i;
			System.out.println(i);
		}
		System.out.println("s="+s);
	}
	
	public static void main(String[] args) {
		tot();
	}

}
