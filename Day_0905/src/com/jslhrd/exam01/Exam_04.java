package com.jslhrd.exam01;

//TreeMap
import java.util.*;

public class Exam_04 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1105, "Java");
		map.put(1102, "Phthon");
		map.put(1107, "Oracle");
		map.put(1102, "Flutter");
		map.put(1108, "C++");
		System.out.println(map);
		System.out.println("------------------------------------------------");
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1105, "Java");
		tmap.put(1102, "Phthon");
		tmap.put(1107, "Oracle");
		tmap.put(1102, "Flutter");
		tmap.put(1108, "C++");
		System.out.println(tmap);
	}

}
