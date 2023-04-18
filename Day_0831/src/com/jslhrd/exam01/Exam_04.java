package com.jslhrd.exam01;
import java.util.*;
public class Exam_04 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		boolean bool = sList.isEmpty();//비어있는지 검사: true
		if(bool) {
			System.out.println("비어있음");
		}
		bool = sList.add("김학생");
		if(bool) {
			System.out.println("등록되었습니다.");
		}else {
			System.out.println("등록실패");
		}
		sList.add("강학생");
		sList.add("박학생");
		sList.add("오학생");
		sList.add("이학생");
		//중복검사
		if(sList.contains("김학생")) {
			System.out.println("등록된 학생입니다.");
		}else {
			sList.add("김학생");
		}
		
		System.out.println(sList);
/*
		System.out.println(sList.indexOf("이학생"));//위치 검색
		System.out.println(sList.remove(1));//1번 인덱스 객체 제거
		System.out.println(sList.remove("김학생"));//객체 제거
*/
		//객체 정렬
		Collections.sort(sList);//래퍼클래스, String만 정렬(사용자 정의 클래스는 정렬"안됨")
		System.out.println(sList);
		//Comparable<T> 구현
		
	}

}
