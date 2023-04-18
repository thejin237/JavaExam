package com.jslhrd.testc;

public class DataSortExam extends DataSort {
//toLowerCase() 소문자로 변경
//toUpperCase() 대문자로 변경
	DataSortExam(String[] data) {
		super(data);
	}

	// 알파벳 카운트
	@Override
	public void alphaCount() {
		alphaPrint();
		int arr[] = new int[26];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length(); j++) {
				int num = data[i].toUpperCase().charAt(j);
				arr[num - 65]++;
			}
		}
		for (char ch = 65; ch <= 90; ch++) {
			System.out.print(ch + "\t");
		}
		System.out.print("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\n");
	}

	// 문자열 뒤집기
	@Override
	public void alphaDesc() {
		System.out.println("문자열 뒤집기");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " : ");
			String str = "";
			for (int j = 0; j < data[i].length(); j++) {
				str = data[i].charAt(j) + str;
			}
			System.out.println(str);
		}
	}

}
