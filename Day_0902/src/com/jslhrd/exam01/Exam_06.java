package com.jslhrd.exam01;
import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "김학생"), 98);
		map.put(new Student(3, "강학생"), 90);
		map.put(new Student(2, "박학생"), 75);
		map.put(new Student(1, "김학생"), 98);
		map.put(new Student(1, "고학생"), 90);
		map.put(new Student(3, "김학생"), 55);
		
		System.out.println(map);
		Set<Map.Entry<Student, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Student, Integer> entry = iter.next();
			System.out.println(entry);
		}
		System.out.println(map.values());
		Set<Student> keySet = map.keySet();//키만 분류
		Collection<Integer> value = map.values();//값만 분류
		Iterator<Integer> iter2 = value.iterator();
		
		int tot = 0;
		while(iter2.hasNext()) {
			tot+=iter2.next();
		}
		System.out.println("Total: " + tot);
		System.out.println("MAX: " + Collections.max(value));
		System.out.println("MIN: " + Collections.min(value));
	}

}
