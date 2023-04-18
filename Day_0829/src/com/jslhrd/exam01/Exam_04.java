package com.jslhrd.exam01;

import java.text.DecimalFormat;

/*숫자 형식화 클래스 DecimalFormat
 * 	0
 * 	#
 * 	.
 * 	,
 * 
*/
public class Exam_04 {
	public static void main(String[] args) {
		int money=12345;//123,45
		double pay=12345.6789;
		DecimalFormat df1 = new DecimalFormat("￦0,000,000");//한글 (ㄹ)의 한자 ￦, ＄, ￥
		DecimalFormat df2 = new DecimalFormat("￦#,###,###");
		String str1 = df1.format(money);
		String str2 = df2.format(money);
		System.out.println(str1);
		System.out.println(str2);
		
		DecimalFormat df3 = new DecimalFormat("￦0,000.000");//자동반올림
		DecimalFormat df4 = new DecimalFormat("￦#,###.000");
		String str3 = df3.format(pay);
		String str4 = df4.format(pay);
		System.out.println(str3);
		System.out.println(str4);
	}

}
