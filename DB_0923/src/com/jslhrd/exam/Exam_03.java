package com.jslhrd.exam;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_03 {

	public static void main(String[] args) {
		MemberDAO mbDAO = MemberDAO.getInstance();
		
		List<MemberDTO> mbList = mbDAO.memberSelect();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("회원 정보 조회 화면");
			System.out.print("회원번호:");
			int usemo = scn.nextInt();
			
			for(MemberDTO mbDTO : mbList) {
				if(mbDTO.getUsemo()==usemo) {
					
				}
			}
		}
	}

}
