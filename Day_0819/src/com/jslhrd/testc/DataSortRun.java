package com.jslhrd.testc;

public class DataSortRun {
	public static void main(String[] args) {
		String[] str = {"Seoul","Korea","Apple","Servlet"};
		DataSortExam dse = new DataSortExam(str);
		dse.alphaCount();
		dse.alphaDesc();
	}

}
