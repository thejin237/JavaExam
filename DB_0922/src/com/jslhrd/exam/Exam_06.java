package com.jslhrd.exam;

import java.util.ArrayList;
import java.util.List;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_06 {
	public static void main(String[] args) {
		MemberDAO mbDAO = MemberDAO.getInstance();
		
		List<MemberDTO> mbList = new ArrayList<MemberDTO>();
		mbList = mbDAO.memberSelect();
		System.out.println("화원번호\t회원성명\t전화번호\t성별\t가입일자\t고객등급\t거주지역");
		for(MemberDTO mbDTO : mbList) {
			System.out.print(mbDTO.getCustno()+"\t\t");
			System.out.print(mbDTO.getCustname()+"\t\t");
			System.out.print(mbDTO.getPhone()+"\t");
			System.out.print(mbDTO.getGender()+"\t");
			
			String joindate = mbDTO.getJoindate();
			System.out.print(joindate.substring(0, 4) + "년");
			System.out.print(joindate.substring(4, 6) + "월");
			System.out.print(joindate.substring(6) + "일\t");
			
			String grade = "직원";
			if (mbDTO.getGrade().equals("A")) {
				grade = "VIP";
			} else if (mbDTO.getGrade().equals("B")) {
				grade = "일반";
			}
			System.out.print(grade+"\t\t");
			System.out.print(mbDTO.getCityname()+"\n");
			
		}
		
	}

}
