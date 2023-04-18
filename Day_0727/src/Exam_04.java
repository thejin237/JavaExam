//참조호출 예제
public class Exam_04 {
	public static void main(String[] args) {
		int value[] = { 90, 55, 77, 88, 57 };
		valuePrint(value); // 메소드 참조호출에 의한 출력

		int imsi[] = value; // 배열의 주소값을 넘겨주고 출력
		for (int i = 0; i < imsi.length; i++) {
			System.out.print(imsi[i] + "\t");
		}
	}

	static void valuePrint(int a[]) { // 주소값을 매개변수로 사용
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
}
