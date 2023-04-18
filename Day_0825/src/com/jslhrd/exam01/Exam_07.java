package com.jslhrd.exam01;

import java.io.File;
import java.util.Scanner;

//파일로부터 읽기
public class Exam_07 {
	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(new File("src/studata.txt"));// data.txt의 파일 내용 읽기
		while (scn.hasNextLine()) {
			String[] str = scn.nextLine().split(" ");
			Student stu = new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]),
					Integer.parseInt(str[3]), Integer.parseInt(str[4]));
			System.out.println(stu);
		}
	}

}
