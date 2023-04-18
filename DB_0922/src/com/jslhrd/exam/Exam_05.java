package com.jslhrd.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_05 {

	public static void main(String[] args) {
		MemberDAO mbDAO = MemberDAO.getInstance();

		List<MemberDTO> mbList = new ArrayList<MemberDTO>();
		mbList = mbDAO.memberSelect();
		System.out.println(mbList);
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("입력:");
			int custno = scn.nextInt();

			for (MemberDTO mbDTO : mbList) {
				if (mbDTO.getCustno() == custno) {
					System.out.println("회원이름: " + mbDTO.getCustname());
					System.out.println("회원전화: " + mbDTO.getPhone());
					System.out.println("성별(M/F): " + mbDTO.getGender());

					String joindate = mbDTO.getJoindate();
					System.out.print("가입일자: " + joindate.substring(0, 4) + "-");
					System.out.print(joindate.substring(4, 6) + "-");
					System.out.print(joindate.substring(6) + "\n");

					String grade = "직원";
					if (mbDTO.getGrade().equals("A")) {
						grade = "VIP";
					} else if (mbDTO.getGrade().equals("B")) {
						grade = "일반";
					}
					System.out.println("고객등급: " + grade);
					System.out.println("도시코드: " + mbDTO.getCity());
				}
			}
		}

	}

}
