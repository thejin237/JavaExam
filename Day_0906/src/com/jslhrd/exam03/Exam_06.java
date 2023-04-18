package com.jslhrd.exam03;

import java.io.*;

public class Exam_06 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File file = new File(path + "/src/com/jslhrd/exam03");
		File file1 = new File("src/com/jslhrd/exam03");

		String[] fList = file.list();
		for (String str : fList) {
			System.out.println(str);
		}
		System.out.println("=============================");
		String[] fList1 = file1.list();
		for (String str : fList1) {
			System.out.println(str);
		}

	}

}
