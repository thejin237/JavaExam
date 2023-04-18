package com.jslhrd.ex01;

import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		File file = new File("abc.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] by = new byte[1024];
		int count = fis.read(by);
		for (int i = 0; i < count; i++) {
			System.out.println(i + ":" + (char) by[i]);
		}
	}

}
