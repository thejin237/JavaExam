package com.jslhrd.exam03;

import java.io.File;

//Print Directory in Current project
public class Exam_05 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File file = new File(path);
		String[] fList = file.list();
		for (String str : fList) {
			System.out.println(str);
		}

	}

}
