package com.jslhrd.exam03;

/* File Class
 * 1. To manage File and Directory(Folder)
*/
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) {
		File dir = new File("src");// Current project file
		boolean bool = dir.isDirectory();
		System.out.println(bool);

		File file1 = new File("c:/Users/websnet/abc.txt");
		File file2 = new File("c:/Users/websnet", "abc.txt");

		File file3 = new File(dir, "abc.txt");
		System.out.println(file1);
		System.out.println(file2);
		System.out.println(file3);
	}

}
