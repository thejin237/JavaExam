package com.jslhrd.exam01;

import java.util.*;

class AA {
	int a;

	AA() {
	}

	AA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return a + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AA) {
			AA aa = (AA) obj;
			return a == aa.a;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return a;
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Set<AA> set = new HashSet();
		set.add(new AA(1));
		boolean bool = set.add(new AA(1));
		bool = set.add(new AA(2));
		bool = set.add(new AA(1));
		System.out.println(set);
	}

}
