//표준출력(System.out.print()/println()
//표준입력(System.in.read()); 1문자를 입력받아서 정수로 변환
public class Exam_04 {
	public static void main(String[] args) throws Exception{
		System.out.print("입력하세요?");
		int ch1 = System.in.read();
		int ch2 = System.in.read();
		int ch3 = System.in.read();
		System.out.print("입력값은:" + ch1);
		System.out.print("입력값은:" + ch2);
		System.out.print("입력값은:" + ch3);
	}

}
