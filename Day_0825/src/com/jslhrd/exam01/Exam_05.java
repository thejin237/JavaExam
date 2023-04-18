package com.jslhrd.exam01;

import java.io.File;
import java.util.Scanner;

//파일로부터 읽기
public class Exam_05 {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(new File("data.txt"));
		while (scn.hasNextLine()) {
			String str = scn.nextLine();
			System.out.println(str);
		}

	}

}
