package com.jslhrd.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_01 {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);

		Scanner scn = new Scanner(System.in);
		MemberDAO mdao = MemberDAO.getInstance();
		MemberDTO mdto = new MemberDTO();

		int custno = mdao.custnoMax() + 1;
		System.out.println("회원 정보 등록 화면");
		System.out.println("회원번호 : " + custno);
		mdto.setCustno(custno);
		System.out.print("회원성명 : ");
		mdto.setCustname(scn.next());
		System.out.print("회원전화 : ");
		mdto.setPhone(scn.next());
		System.out.print("성별(M/F) : ");
		mdto.setGender(scn.next());
		System.out.println("가입일자 : " + today);
		mdto.setJoindate(today);
		System.out.print("고객등급 : ");
		mdto.setGrade(scn.next());
		System.out.print("도시코드 : ");
		mdto.setCity(scn.next());
		scn.close();
		
		int row = mdao.memberWrite(mdto);
		if (row == 1) {
			System.out.println("Complete");
		} else {
			System.out.println("Fail");
		}
	}

}
