package com.jslhrd.testa;

public interface Process {
	int max(int a, int b);

	int min(int a, int b);

	int max(int... a);

	int min(int... a);
	
	int minArr(int[] a);
	
	default int sum(int...a) {
		int sum = 0;
		for(int i=0; i<a.length;i++) {
			sum+=i;
		}
		return sum;
	}
}
