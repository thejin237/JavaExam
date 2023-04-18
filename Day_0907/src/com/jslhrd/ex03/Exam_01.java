package com.jslhrd.ex03;
/* 키보드 입력 ->파일 출력
 * 입력 형식
 * 등록: 번호,이름,국어,영어,수학
 * 
 * 등록: 0000 -> 입력종료
 * 
 * 출력형식
 * 	번호	이름	국어	영어	수학	총점	평균
*/
import java.io.*;
import java.util.*;
public class Exam_01 {
	public static void main(String[] args) throws Exception{
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		//출력
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								new File("src/com/jslhrd/ex03/output.txt"))));
		
		pw.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(true) {
			System.out.print("등록:");
			String str = scn.nextLine();
			if(str.equals("0000")) {
				break;
			}
			String[] strArr = str.split(",");
			int tot = Integer.parseInt(strArr[2])+Integer.parseInt(strArr[3])+Integer.parseInt(strArr[4]);
			double ave = (int)(tot/3.*10+0.5)/10.;
			pw.println(str+","+tot+","+ave);
		}
		scn.close();
		pw.close();
		
	}

}
