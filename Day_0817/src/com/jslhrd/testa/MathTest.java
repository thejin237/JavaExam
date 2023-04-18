package com.jslhrd.testa;

public class MathTest extends MathExam {

	@Override
	public int max(int a, int b) {
//		int max;
//		if(a<b) {
//			max=b;
//		}else {
//			max=a;
//		}
		int max=(a<b)?b:a;
		return max;
	}

	@Override
	public int min(int a, int b) {
//		int min;
//		if(a>b) {
//			min=b;
//		}else {
//			min=a;
//		}
		int min=(a>b)?b:a;
		return min;
	}

	@Override
	public int max(int... a) {
		int max=a[0];
		for(int i = 1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}

	@Override
	public int min(int... a) {
		int min=a[0];
		for(int i = 1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}

}
