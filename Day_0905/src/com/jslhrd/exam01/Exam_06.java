package com.jslhrd.exam01;

//FIFO(First In First Out)
//Queue
import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		// Queue que = new Queue(); 불가 Queue is interface
		Queue<Integer> que = new LinkedList();
		// 삽입
		que.offer(100);
		que.offer(200);
		que.add(500);
		que.offer(300);
		que.offer(400);
		System.out.println("size: " + que.size());
		// 첫번째 객체(확인)
		System.out.println("첫번째 객체: " + que.peek());// 객체 제거 안됨
		// 전체 객체 제거
		while (!que.isEmpty()) {
			System.out.println("size : " + que.size());
			System.out.println("객체 : " + que.poll());
		}
	}

}
