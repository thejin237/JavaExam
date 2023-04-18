public class Exam_01 {

	public static void main(String[] args) throws Exception {
		System.out.print("입력:");
		int input = System.in.read();
		if(input>96 && input<123) {
			System.out.println("입력된 키 "+(char)input+"는 소문자입니다.");
		}else if(input>64 && input<91) {
			System.out.println("입력된 키 "+(char)input+"는 대문자입니다.");
		}else if(input>47 && input<58) {
			System.out.println("입력된 키 "+(char)input+"는 숫자입니다.");
		}else{
			System.out.println("입력된 키 "+(char)input+"는 특수문자입니다.");
		}
	}
}

