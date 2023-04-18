package com.jslhrd.testb;

public abstract class NumberSort {
	int[] number;

	public NumberSort(int num[]) {
		this.number = num;
	}

	public void dataPrint() {
		System.out.print("Data :\t");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
		}
		System.out.print("\n");
	}

	// data 오름차순 정렬
	public abstract void ascSort();

	// data 내림차순 정렬
	public abstract void descSort();

	// 최대 최소를 뺀 나머지 합계 출력
	public abstract void maxMinTotal();
}
