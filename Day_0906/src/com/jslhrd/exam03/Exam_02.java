package com.jslhrd.exam03;

import java.io.*;

public class Exam_02 {
	public static void main(String[] args) {
		File f = new File("c:/Users/websnet/TestData");
		if (f.exists()) {
			f.delete();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println("Deleted");

		}
		if (!f.exists()) {
			f.mkdir();
			System.out.println("Made");
		}
	}

}
