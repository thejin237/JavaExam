package com.jslhrd.exam01;

import java.util.*;

/* List ->ArrayList, Vector, LinkedList
 * LinkedList: 빈번한 삽입 삭제에 사용하기 좋다.
*/
public class Exam_01 {
	public static void main(String[] args) {
		List list = new Vector();
		Vector vc = new Vector();// 동기화 메소드 사용 편리
		System.out.println("Vector 물리적 공간" + vc.capacity());// 기본 10
		System.out.println("Vector 객체 수" + vc.size());
		vc.add("AAA");
		vc.add(0);
	}

}
