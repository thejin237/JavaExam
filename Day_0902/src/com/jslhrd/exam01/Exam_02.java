package com.jslhrd.exam01;
import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1011, "김학생");
		map.put(1102, "박학생");
		map.put(1121, "이학생");
		map.put(1154, "홍학생");
		map.put(1123, "장학생");
		System.out.println(map);
		System.out.println(map.keySet());
		
		//모든 key를 set으로 반환
		Set<Integer> keySet = map.keySet();
/*		//확장 for
		for(Integer key : keySet) {
			System.out.print(key+" : " + map.get(key));
		}
*/
		//반복자(Iterator)
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}
