package com.jslhrd.exam01;

//implements Runnable interface
class ThreadC implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("ThreadC: " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}

class ThreadD implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("ThreadD: " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		ThreadC tc = new ThreadC();

		Thread t1 = new Thread(tc);
		Thread t2 = new Thread(new ThreadD());

		t1.start();
		t2.start();
	}

}
