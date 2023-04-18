package com.jslhrd.ex02;

//문자방식(Text)
import java.io.*;

public class Exam_01 {
	public static void main(String[] args) throws Exception {
		File file = new File("data.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		pw.print("안녕하세요");
		pw.println("Java Programming");
		pw.println("Hello");
		pw.println("1 ");

		pw.close();
	}

}
