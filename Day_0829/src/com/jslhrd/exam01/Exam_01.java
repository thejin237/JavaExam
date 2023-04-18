package com.jslhrd.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 날짜관련 클래스
 * Date, Calendar, GregorianCalendar
*/
public class Exam_01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//날짜 형식화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String today = sdf.format(now);
		System.out.println(today);
	}

}
