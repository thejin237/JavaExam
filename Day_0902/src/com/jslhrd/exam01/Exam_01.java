package com.jslhrd.exam01;

import java.util.*;

public class Exam_01 {
	public static void main(String[] args) {
		Map map = new HashMap();// 키(Object), 값(Object)
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		HashMap<String, Integer> map3 = new HashMap<String, Integer>();
		
		map.put("Java", 90);
		map.put("Oracle", 98);
		map.put("Phython", 80);
		map.put("Java", 98);//해당하는 key(Java)의 값을 90에서 98로 변경
		map.put("JSP", 98);
		System.out.println(map);
		
		boolean bool = map.containsKey("Java");
		boolean bool2 = map.containsValue(90);
		System.out.println(bool + ":" + bool2);
		
		//int val = map.get("Java"); Error: 반환타입이 int가 아니다.
		Object val = map.get("Java");
		System.out.println("Java: "+val);
		System.out.println("size: "+map.size());
		
	}

}
