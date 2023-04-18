package com.jslhrd.exam01;
import java.util.*;
public class Exam_03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//List<Integer> list = new ArrayList<Integer>();
		
		//list.add("20"); 정수타입의 객체만을 입력받는다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//list 내용 확인
		System.out.println(list);
		//list내의 객체를 검색 출력(추출)/ get()
		//1. for()
		System.out.print("for() : \t");
		for(int i=0; i<list.size();i++) {
			int score = list.get(i);
			System.out.print(score+"\t");
		}
		System.out.println();
		//2. 확장 for()
		System.out.print("확장 for() : \t");
		for(Integer score : list) {
			System.out.print(score+"\t");
		}
		System.out.println();
	}

}
