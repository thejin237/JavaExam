package com.jslhrd.ex01;

//byte 방식: 파일 출력
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) throws Exception {
		File file = new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		byte[] data = { 66, 68, 70, 72, (byte) '!' };
		fos.write(data);
		fos.close();
	}

}
