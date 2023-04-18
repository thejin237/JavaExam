package com.jslhrd.testa;
class ProExam implements Process{
	@Override
	public int max(int a, int b) {
		
		return 0;
	}@Override
	public int min(int a, int b) {
		
		return 0;
	}@Override
	public int max(int... a) {
		
		return 0;
	}@Override
	public int min(int... a) {
		
		return 0;
	}
	public int sum(int... a) {
		return 0 ;
	}
	@Override
	public int minArr(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		//ProExam p1 = new ProExam();
		
		//Process p = new ProExam();
		
		Process pe = new ProcessExam();
		pe.max(1,2);
		pe.max(1,2,3,4,5);
		pe.min(1,2);
		pe.min(1,2,3,4,5);
		pe.sum(1,2,3,4,5);
	}

}
