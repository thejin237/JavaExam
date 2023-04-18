package com.jslhrd.exam01;

//inheritance Thread Class and override run() method
class ThreadA extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("ThreadA: " + i);
			try {
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
		super.run();
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("ThreadB: " + i);
			try {
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
		super.run();
	}
	
}

public class Exam_02 {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();

	}

}
