package com.jslhrd.ex05;

import java.io.*;
import java.util.*;

public class StudentInput {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(new File("Student.dat"))));

		Object obj = ois.readObject();
		List<Student> lStu = (List) obj;
		for (Student stu : lStu) {
			int tot = stu.getKor() + stu.getEng() + stu.getMat();
			int ave = tot / 3;
			System.out.print(stu.getBun() + "\t");
			System.out.print(stu.getName() + "\t");
			System.out.print(stu.getKor() + "\t");
			System.out.print(stu.getEng() + "\t");
			System.out.print(stu.getMat() + "\t");
			System.out.println(tot + "\t" + ave);
		}

		ois.close();

	}

}
