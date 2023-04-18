package com.jslhrd.exam01;
import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("123");
		list.add("356");
		list.add("423");
		System.out.println(list);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1011, "김학생");
		map.put(1102, "박학생");
		map.put(1121, "이학생");
		map.put(1154, "홍학생");
		map.put(1123, "장학생");
		System.out.println(map);
		//Set keySet = map.keySet();//Return key only to Set
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);
		Iterator<Map.Entry<Integer, String>> iter = entry.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> m = iter.next();
			System.out.print(m.getKey()+"=");
			System.out.print(m.getValue()+"\n");
		}
		
	
		
	}

}
