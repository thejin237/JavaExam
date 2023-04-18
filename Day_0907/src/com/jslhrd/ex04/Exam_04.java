package com.jslhrd.ex04;
import java.io.*;
import java.util.*;
public class Exam_04 {
	public static void main(String[] args) throws Exception{
		//파일로부터 객체를 읽어서 출력
		
		ObjectInputStream oos = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(
								new File("objdata.dat"))));
		
		Object obj = oos.readObject();
		List<String> list = (List)obj;
		for(String str : list) {
			System.out.println(str);
		}
		
		oos.close();
		
	}

}
