package com.jslhrd.ex04;
import java.io.*;
class Point implements Serializable{
	int x=10;
	int y=20;
}
public class Exam_01 {
	public static void main(String[] args) throws Exception{
		Point p = new Point();
		System.out.println("x=" + p.x);
		System.out.println("y=" + p.y);
		File file = new File("object.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(p);
		oos.close();
	}

}
