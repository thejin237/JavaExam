package com.jslhrd.exam03;

import java.io.*;

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		File f = new File("c:/Users/websnet/TestData");
		if (!f.exists()) {//
			f.mkdir();
		}
		File file = new File(f, "abc.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

	}

}
