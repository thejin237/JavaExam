package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_03 {

	public static void main(String[] args) {
		MemberDAO mdao = MemberDAO.getInstance();

		List<MemberDTO> mlist = mdao.memberSelect();
		System.out.println("회원번호\t회원성명\t연락처\t\t성별\t가입일자\t고객등급\t도시코드");
		for (MemberDTO mdto : mlist) {
			System.out.print(mdto.getCustno() + "\t\t");
			System.out.print(mdto.getCustname() + "\t\t");
			System.out.print(mdto.getPhone() + "\t");
			String gender = "여";
			if (mdto.getGender().equals("M")) {
				gender = "남";
			}
			System.out.print(gender + "\t");
			String ymd = mdto.getJoindate().substring(0, 4) + "년" + mdto.getJoindate().substring(4, 6) + "월"
					+ mdto.getJoindate().substring(6) + "일";
			System.out.print(ymd + "\t");
			String grade = "직원";
			if (mdto.getGrade().equals("A")) {
				grade = "VIP";
			} else if (mdto.getGrade().equals("B")) {
				grade = "일반";
			}
			System.out.print(grade + "\t\t");
			System.out.print(mdto.getCity() + "\n");
		}

	}

}
