package com.jslhrd.exam03;

import java.io.*;

public class Exam_07 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File file = new File(path);
		File[] fList = file.listFiles();
		for (int x = 0; x < fList.length; x++) {
			if (fList[x].isDirectory()) {
				System.out.println(fList[x].getName() + "<dir>");
			} else {
				System.out.println(fList[x].getName());
			}
		}
	}

}
