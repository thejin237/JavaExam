package com.jslhrd.ex03;

import java.io.*;
import java.util.StringTokenizer;

public class Exam_03 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("src/com/jslhrd/ex03/indata.txt")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = null;
		try {
			System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균");
			while ((data = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(data, ", ");
				String[] dataArr = new String[5];
				for (int i = 0; i < 5; i++) {
					dataArr[i] = st.nextToken();
				}
				int tot = Integer.parseInt(dataArr[2]) + Integer.parseInt(dataArr[3]) + Integer.parseInt(dataArr[4]);
				int ave = tot / 3;
				for (String str : dataArr) {
					System.out.print(str + "\t");
				}
				System.out.println(tot + "\t" + ave);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
