public class Exam_000 {
	public static void main(String[] args) {
		char a = 'A'+1;
		int b = 20;
		int c = a + b;
		char d = 10200;

		System.out.println(a);			//문자형 출력
		System.out.println((int) a);	//char에서 int형으로 강제형변환
		System.out.println(c);			//char + int = int형으로 자동변환
		System.out.println(d);			//char형에 정수 저장으로 빈줄 출력
		System.out.println((int)d);		//int형으로 강제변환하여 출력
	}
}
