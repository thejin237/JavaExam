
public class Exam_001 {

	public static void main(String[] args) {
		int a = 2;
		int b = a++ + ++a * ++a + a++; // b = 2 + 4 * 5 + 5 = 27, a = 6
		System.out.println(a);
		System.out.println(b);
		int c = 2;
		int d = ++c + ++c * ++c; // d = 3 + 4 * 5 = 23 , c = 5
		System.out.println(c);
		System.out.println(d);
		int e = 2;
		int f = ++e * ++e + e++ + ++e; // f = 3 * 4 + 4 + 6 = 22, e = 6
		System.out.println(e);
		System.out.println(f);
	}
}
