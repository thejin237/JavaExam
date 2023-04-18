package com.jslhrd.ex04;
import java.io.*;
public class Exam_02 {
	public static void main(String[] args) throws Exception{
		File file = new File("object.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream oos = new ObjectInputStream(bis);
		
		Object obj = oos.readObject();
		Point p = (Point)obj;
		System.out.println("x=" + p.x);
		System.out.println("y=" + p.y);
		oos.close();
	}

}
