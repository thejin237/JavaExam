package com.jslhrd.exam01;

import java.util.Calendar;

//달력 Calendar
public class Exam_02 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;//월 (0 ~ 11)
		int date = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);//요일(1(일) ~ 7(토))
		
		String weekday="";
		switch(week) {
		case 1:
			weekday="일요일";
			break;
			
		case 2:
			weekday="월요일";
			break;
			
		case 3:
			weekday="화요일";
			break;
			
		case 4:
			weekday="수요일";
			break;
			
		case 5:
			weekday="목요일";
			break;
			
		case 6:
			weekday="금요일";
			break;
			
		case 7:
			weekday="토요일";
			break;
			
		}
		
		System.out.println(year+"년"+month+"월"+date+"일"+weekday);
	}
}
