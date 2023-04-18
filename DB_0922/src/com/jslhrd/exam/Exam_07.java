package com.jslhrd.exam;

import java.util.ArrayList;
import java.util.List;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_07 {
	public static void main(String[] args) {
		MemberDAO mbDAO = MemberDAO.getInstance();
		
		List<MemberDTO> mbList = new ArrayList<MemberDTO>();
		mbList = mbDAO.salesSelect();
		System.out.println("화원번호\t회원성명\t전화번호\t고객등급\t매출");
		for(MemberDTO mbDTO : mbList) {
			System.out.print(mbDTO.getCustno()+"\t\t");
			System.out.print(mbDTO.getCustname()+"\t\t");
			System.out.print(mbDTO.getPhone()+"\t");
			
			String grade = "직원";
			if (mbDTO.getGrade().equals("A")) {
				grade = "VIP";
			} else if (mbDTO.getGrade().equals("B")) {
				grade = "일반";
			}
			System.out.print(grade+"\n");
			
		}
		
	}

}
