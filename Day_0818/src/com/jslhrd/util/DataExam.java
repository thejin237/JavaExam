package com.jslhrd.util;

public class DataExam {
	public static void main(String[] args) {
		DataArrPro dap = new DataArrPro();
		int max = dap.getMax(20,10,30,40,50,60);
		System.out.println("max = " + max);
		int min = dap.getMin(20,10,30,40,50,60);
		System.out.println("min = " + min);
		int[] arr = {20,10,30,40,50,60};
		int maxArr = dap.getMaxArr(arr);
		System.out.println("maxArr = " + maxArr);
		int minArr = dap.getMinArr(arr);
		System.out.println("minArr = " + minArr);
		
		dap.sort(arr, true);
		dap.sort(arr, false);
		
	}

}
