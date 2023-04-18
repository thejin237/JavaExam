package com.jslhrd.exam01;

public class Exam_04 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//기본 16
		//데이타 추가 append();
		sb.append("AA");
		sb.append(123);
		System.out.println(sb);
		//삽입 insert();
		sb.insert(0, "B");
		System.out.println(sb);
		//삭제 delete();
		sb.delete(1, 2);
		System.out.println(sb);
		//수정
		sb.setCharAt(0, 'K');
		System.out.println(sb);
		//문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
	}

}
