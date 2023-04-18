package com.jslhrd.ex02;
import java.io.*;
public class Exam_02{
	public static void main(String[] args) throws Exception{
		File file = new File("data.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
//		String str = br.readLine();
//		System.out.println(str);
		
		String str = "";
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
		
	}

}
