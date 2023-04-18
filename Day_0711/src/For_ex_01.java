public class For_ex_01 {
	
	public static void tot(){
		int s=0;
		for(int i=1; i<=10; i++) {
			s += 1;
			System.out.print("i="+i+"\t");
			System.out.println("s="+s);
		}
		System.out.println("s="+s);
	}
	
	public static void main(String[] args) {
		tot();
	}

}
