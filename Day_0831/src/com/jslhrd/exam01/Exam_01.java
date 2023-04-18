package com.jslhrd.exam01;

import java.util.*;

//list -> ArrayList, Vector, LinkedList
//제네릭 타입: <>
public class Exam_01 {

	public static void main(String[] args) {
		// List list new List(); interface 는 객체 생성 불가
		ArrayList aList = new ArrayList();
		List list = new ArrayList(); // 모든 객체(Object)를 저장 현장에서 많이 사용
		List<String> slist = new ArrayList(); // String 객체만 저장

		// 데이터 추가
		list.add(1234);// 정수(Integer)객체 -> Object객체로 변환
		boolean bool = list.add("java");// String객체 -> Object객체로 변환
		System.out.println(bool);
		list.add(3.14);

		System.out.println(list);// list의 데이터를 꺼내온 것이 아닌 들여다보기만 함.
		list.add(1, "김학생");
		System.out.println(list);

		Object obj = list.set(0, "AA");// 0번 위치 객체를 반환하고, 0번 객체를 변경
		System.out.println(obj);
		System.out.println(list);

		boolean flag = list.contains("java");
		if (flag) {
			System.out.println("java는 " + list.indexOf("java") + "에 있음");
		} else {
			System.out.println("java는 없음");
		}

		Object obj2 = list.get(0);
		System.out.println(obj2);

		System.out.println(list.isEmpty());// list가 비어있지 않기 때문에 false
		System.out.println(list.size());// 4

		Object obj3 = list.remove(0);// 해당 인덱스의 객체를 반환하고 삭제
		System.out.println(list);
		System.out.println("삭제된 객체: " + obj3);

	}

}
