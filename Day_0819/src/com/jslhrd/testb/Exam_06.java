package com.jslhrd.testb;

import java.io.IOException;

//예외처리
public class Exam_06 {
	public static void main(String[] args) {
		try {
			int a = System.in.read();
		}catch(IOException e) {
			e.printStackTrace();//예외처리내용 출력
			System.out.println(e.getMessage());//에러메세지 출력
		}
	}

}
