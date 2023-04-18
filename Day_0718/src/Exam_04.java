public class Exam_04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		String str1 = "1234";
		String str2 = new String("1234");
		String str3 = null;

		System.out.println("a==b : " + (a == b));
		System.out.println("str1==str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str3 : " + str3);
	}

}
