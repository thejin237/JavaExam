package com.jslhrd.exam;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
		// 오늘 날짜 생성 -1
		LocalDate now = LocalDate.now();
		String[] str = now.toString().split("-");
		String s = str[0]+str[1]+str[2];
		
		System.out.println(now);
		System.out.println(s);
		
		// 오늘 날짜 생성 -2
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		System.out.println(today);
		
	}

}
