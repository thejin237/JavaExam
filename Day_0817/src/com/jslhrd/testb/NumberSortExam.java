package com.jslhrd.testb;

public class NumberSortExam extends NumberSort {
	int[] numberClone = number.clone();
	
	//생성자
	NumberSortExam(int[] score) {
		super(score);
	}
	//오름차순 정렬 메소드
	@Override
	public void ascSort() {
		dataPrint();
		for (int i = 0; i < numberClone.length; i++) {
			for (int j = i + 1; j < numberClone.length; j++) {
				if (numberClone[i] > numberClone[j]) {
					int temp = numberClone[i];
					numberClone[i] = numberClone[j];
					numberClone[j] = temp;
				}
			}
		}
		numberSortPrint();
	}
	//내림차순 정렬 메소드
	@Override
	public void descSort() {
		dataPrint();
		for (int i = 0; i < numberClone.length; i++) {
			for (int j = i + 1; j < numberClone.length; j++) {
				if (numberClone[i] < numberClone[j]) {
					int temp = numberClone[i];
					numberClone[i] = numberClone[j];
					numberClone[j] = temp;
				}
			}
		}
		numberSortPrint();
	}
	//최대 최소 뺀 합계 메소드
	@Override
	public void maxMinTotal() {
		dataPrint();
		int max = numberClone[0];
		int min = numberClone[0];
		int sum = numberClone[0];
		for (int i = 1; i < numberClone.length; i++) {
			if (max < numberClone[i]) {
				max = numberClone[i];
			}
			else if (min > numberClone[i]) {
				min = numberClone[i];
			}
			sum += numberClone[i];
		}
		int tot = sum - (max + min);
		System.out.println("합계(최대-최소): " + tot + "(" + sum + "-" + max + "-" + min + ")");
	}

	// 정렬된 배열 출력
	void numberSortPrint() {
		System.out.print("Data :\t");
		for (int i = 0; i < numberClone.length; i++) {
			System.out.print(numberClone[i] + "\t");
		}
		System.out.print("\n\n");
	}

}
