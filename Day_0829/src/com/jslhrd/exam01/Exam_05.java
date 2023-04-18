package com.jslhrd.exam01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*날짜, 시간, 날짜시간 생성
 * 2022-08-29
*/
public class Exam_05 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);
		
	}

}
