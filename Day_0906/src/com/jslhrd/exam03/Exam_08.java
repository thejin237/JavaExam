package com.jslhrd.exam03;

import java.io.*;

public class Exam_08 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		File file = new File(path);
		File[] fList = file.listFiles();
		for (int x = 0; x < fList.length; x++) {
			if (fList[x].isDirectory()) {
				System.out.println(fList[x].getName() + "  <dir>");
				File f = new File(fList[x].getName());
				String[] str = f.list();
				for (String sFile : str) {
					System.out.println("\t" + sFile);
				}
			} else {
				System.out.println(fList[x].getName());
			}
		}
	}

}
