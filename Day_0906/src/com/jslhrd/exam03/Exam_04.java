package com.jslhrd.exam03;

import java.io.File;
import java.util.Date;

public class Exam_04 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/com/jslhrd/exam03/Test.xls");
		if (file.exists()) {
			System.out.println("파일명: " + file.getName());
			System.out.println("파일경로: " + file.getPath());
			System.out.println("파일경로: " + file.getParent());
			System.out.println("파일크기: " + file.length() + "byte");
			// System.out.println("최종수정일: " + file.lastModified());//longtype
			System.out.println("최종수정일: " + new Date(file.lastModified()));
		}
		if (!file.exists()) {
			System.out.println("Create");
			file.createNewFile();
		}
	}

}
