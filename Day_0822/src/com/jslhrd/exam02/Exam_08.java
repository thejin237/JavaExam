package com.jslhrd.exam02;

class AA {
	int a = 10;
}

public class Exam_08 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();

		String str1 = "Korea";
		String str2 = "Korea";

		String str3 = new String("Korea");

		System.out.println("str1==str2: " + (str1 == str2));
		System.out.println("str1==str3: " + (str1 == str3));
		System.out.println("str.equals(str2): " + str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
