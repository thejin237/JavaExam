package com.jslhrd.exam01;

//LIFO(Last In First Out)
import java.util.*;

public class Exma_05 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		// 삽입
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		// stack의 객체수 확인
		System.out.println("The number of Instance in stack: " + stack.size());

		// 맨 위 객체 꺼내기
		int data = stack.peek();
		System.out.println(data);
		System.out.println("The number of Instance in stack: " + stack.size());

		// 스택안의 모든 객체 꺼내기
		while (!stack.isEmpty()) {
			System.out.println("꺼내서 제거된 객체: " + stack.pop());
			System.out.println("The number of Instance in stack: " + stack.size());
		}
	}

}
