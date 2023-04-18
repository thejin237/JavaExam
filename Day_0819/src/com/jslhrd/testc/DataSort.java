package com.jslhrd.testc;

public abstract class DataSort {
	public String[] data;
	public DataSort(String[] data) {
		this.data = data;
	}
	public void alphaPrint() {
		System.out.println("영문자 분리 출력");
		for(int i= 0;i<data.length;i++) {
			System.out.print(data[i]+" : ");
			for(int j=0; j<data[i].length();j++) {
				char ch = data[i].charAt(j);
				System.out.print(ch+" ");
			}
			System.out.print("\n");
		}
	}
	//영문자별 빈도수 계산
	public abstract void alphaCount();
	
	//영문자 역순 출력
	public abstract void alphaDesc();
}
