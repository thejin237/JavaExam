package com.jslhrd.util;

public class DataPro implements Data {

	@Override
	public int getMax(int... var) {
		int max = var[0];
		for (int i = 0; i < var.length; i++) {
			if (max < var[i]) {
				max = var[i];
			}
		}
		return max;
	}

	@Override
	public int getMin(int... var) {
		int min = var[0];
		for (int i = 0; i < var.length; i++) {
			if (min > var[i]) {
				min = var[i];
			}
		}
		return min;
	}

	@Override
	public void sort(int[] var, boolean bool) {

		for (int i = 0; i < var.length; i++) {
			for (int j = i + 1; j < var.length; j++) {
				if (bool) {
					if (var[i] > var[j]) {
						int temp = var[i];
						var[i] = var[j];
						var[j] = temp;
					}
				} else {
					if (var[i] < var[j]) {
						int temp = var[i];
						var[i] = var[j];
						var[j] = temp;
					}
				}
			}
		}
	}

}
