package com.jslhrd.testa;
public abstract class MathExam {
	//두개의 정수를 큰수 반환
	public abstract int max(int a, int b);
	
	//두개의 정수를 작은수 반환
	public abstract int min(int a, int b);

	//여러개의 정수 중 큰수 반환
	public abstract int max(int... a);

	//여러개의 정수 중 작은수 반환
	public abstract int min(int... a);
}
