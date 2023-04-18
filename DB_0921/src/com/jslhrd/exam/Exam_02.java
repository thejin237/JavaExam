package com.jslhrd.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.jslhrd.db.MoneyDAO;
import com.jslhrd.db.MoneyDTO;

public class Exam_02 {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);

		Scanner scn = new Scanner(System.in);
		MoneyDAO mdao = MoneyDAO.getInstance();
		MoneyDTO mdto = new MoneyDTO();

		System.out.println("회원 매출 정보 등록 화면");
		System.out.print("회원번호 : ");
		mdto.setCustno(scn.nextInt());
		System.out.print("판매번호 : ");
		mdto.setSaleno(scn.nextInt());
		System.out.print("단가 : ");
		mdto.setPcost(scn.nextInt());
		System.out.print("수량 : ");
		mdto.setAmount(scn.nextInt());
		System.out.print("가격 : ");
		mdto.setPrice(scn.nextInt());
		System.out.print("상품코드 : ");
		mdto.setPcode(scn.next());
		System.out.println("판매일자 : " + today);
		mdto.setSdate(today);
		scn.close();
		int row = mdao.moneyWrite(mdto);
		if (row == 1) {
			System.out.println("Complete");
		} else {
			System.out.println("Complete");
		}
	}

}
