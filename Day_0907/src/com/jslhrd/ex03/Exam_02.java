package com.jslhrd.ex03;
import java.util.*;
import java.io.*;
//Scanner
public class Exam_02 {
	public static void main(String[] args) {
		File file = null;
		Scanner scn = null;
		try {
			file = new File("src/com/jslhrd/ex03/indata.txt");
			scn = new Scanner(file);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String data = null;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(scn.hasNext()) {
			data = scn.nextLine();
			StringTokenizer st = new StringTokenizer(data,", ");
			String[] strData = new String[5];
			for(int i = 0; i < strData.length;i++) {
				strData[i] = st.nextToken();
			}
			int tot = Integer.parseInt(strData[2])+Integer.parseInt(strData[3])+Integer.parseInt(strData[4]);
			int ave = tot/3;
			System.out.print(strData[0]+"\t"+strData[1]+"\t"+strData[2]+"\t"+strData[3]+"\t"+strData[4]+"\t");
			System.out.println(tot+"\t"+ave);
		}
		
		
	}

}
