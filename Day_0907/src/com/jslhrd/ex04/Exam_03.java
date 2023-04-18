package com.jslhrd.ex04;
import java.io.*;
import java.util.*;
public class Exam_03 {
	public static void main(String[] args) throws Exception{
		List<String> list = new ArrayList();
		
		list.add("Java");
		list.add("JSP");
		list.add("C");
		list.add("C++");
		list.add("Servlet");
		list.add("Db");
		list.add("Oracle");
		
		//객체를 파일로 저장
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(
								new File("objdata.dat"))));
		
		oos.writeObject(list);
		
		oos.close();
		
	}

}
