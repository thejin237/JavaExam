package com.jslhrd.exam;
import java.util.List;

import com.jslhrd.db.MemberDAO;
import com.jslhrd.db.MemberDTO;

public class Exam_02 {

	public static void main(String[] args) {
		MemberDAO mbDAO = MemberDAO.getInstance();
		
		List<MemberDTO> mbList = mbDAO.memberSelect();
		
		// 회원번호순 오름차순 정렬
				for (int i = 0; i < mbList.size(); i++) {
					for (int j = 0; j < mbList.size(); j++) {
						if (mbList.get(i).getUsemo() < mbList.get(j).getUsemo()) {
							MemberDTO temp = mbList.get(i);
							mbList.set(i, mbList.get(j));
							mbList.set(j, temp);
						}
					} // for(j) end
				} // for(i) end
		
		System.out.println("회원번호\t고객성명\t전화번호\t성별\t생년월일\t가입일자");
		for(MemberDTO mbDTO : mbList) {
			System.out.print(mbDTO.getUsemo()+"\t\t");
			System.out.print(mbDTO.getName()+"\t\t");
			System.out.print(mbDTO.getPhone1()+"-"+mbDTO.getPhone2()+"-"+mbDTO.getPhone3()+"\t");
			String gender = "여자";
			if(mbDTO.getGender().equalsIgnoreCase("M")){
				gender="남자";
			}
			System.out.print(gender+"\t");
			System.out.print(mbDTO.getBirthday()+"\t\t");
			String regdate = mbDTO.getRegdate();
			System.out.print(regdate.substring(0,4)+"년");
			System.out.print(regdate.substring(4,6)+"월");
			System.out.print(regdate.substring(6)+"일\n");
		}
	}

}
