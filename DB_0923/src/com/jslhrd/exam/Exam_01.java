package com.jslhrd.exam;

import java.util.Scanner;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_01 {
	public static void main(String[] args) {
		MemberDAO mbDAO = MemberDAO.getInstance();

		Scanner scn = new Scanner(System.in);

		while (true) {
			MemberDTO mbDTO = new MemberDTO();
			int usemo = mbDAO.usemoSelect()+1;

			System.out.print("회원번호: "+usemo+"\n");
			mbDTO.setUsemo(usemo);
			System.out.print("회원성명:");
			mbDTO.setName(scn.next());
			System.out.print("연락처:");
			String phone = scn.next();
			if(phone.substring(3,4).equals("-")) {
				String[] phoneArr = phone.split("-");
				mbDTO.setPhone1(phoneArr[0]);
				mbDTO.setPhone2(phoneArr[1]);
				mbDTO.setPhone3(phoneArr[2]);
			}else {
				mbDTO.setPhone1(phone.substring(0,3));
				mbDTO.setPhone2(phone.substring(3,7));
				mbDTO.setPhone3(phone.substring(7));
			}
			System.out.print("성별:");
			while(true) {
				String gender = scn.next();
				if(gender.equalsIgnoreCase("M")) {
					mbDTO.setGender(gender);
					break;
				}else if(gender.equalsIgnoreCase("F")) {
					mbDTO.setGender(gender);
					break;
				}else {
					System.out.println("성별입력오류");
					continue;
				}
			}
			System.out.print("생년월일:");
			mbDTO.setBirthday(scn.next());
			System.out.print("가입일자:");
			mbDTO.setRegdate(scn.next());
			scn.close(); //Scanner scn close
			mbDAO.memberWrite(mbDTO);
		}
	}//while end

}
