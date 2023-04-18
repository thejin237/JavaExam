package com.jslhrd.util;

public interface Data {
	int getMax(int... var);
	int getMin(int... var);
	void sort(int[] var, boolean bool);//true(오름), false(내림)
	default int getSum(int... var) {
		int sum=0;
		for(int i =0; i<var.length;i++) {
			sum+=i;
		}
		return sum;
	}
}
