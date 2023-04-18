package com.jslhrd.exam;

import java.text.SimpleDateFormat;
import java.util.*;

import com.jslhrd.dao.StudentDAO;
import com.jslhrd.dto.StudentDTO;

public class StudentExam {
	public static void main(String[] args) {
		StudentDAO sdao = StudentDAO.getInstance();
		
		//StudentWrite
		StudentDTO sdto = new StudentDTO();
		Scanner scn = new Scanner(System.in);
//		System.out.println("학생등록 화면");
//		System.out.print("학년\t:");
//		sdto.setSyear(scn.next());
//		System.out.print("반\t:");
//		sdto.setSclass(scn.next());
//		System.out.print("번호\t:");
//		sdto.setSno(scn.next());
//		System.out.print("이름\t:");
//		sdto.setSname(scn.next());
//		System.out.print("생년월일:");
//		sdto.setBirth(scn.next());
//		System.out.print("성별(M/F):");
//		sdto.setGender(scn.next());
//		System.out.print("전화번호:");
//		scn.nextLine();
//		String[] str = scn.nextLine().split(" ");
//		sdto.setTel1(str[0]);
//		sdto.setTel2(str[1]);
//		sdto.setTel3(str[2]);
//		
//		int row = sdao.DeptWrite(sdto);
//		if(row==1) {
//			System.out.println("Success");
//		}else {
//			System.out.println("fail");
//		}
		
		List<StudentDTO> slist = sdao.DeptSelect();
		System.out.println("학년\t반\t번호\t이름\t생년월일\t성별\t전화번호");
		for(StudentDTO sDTO : slist) {
			
			System.out.print(sDTO.getSyear()+"\t");//학년 출력
			System.out.print(sDTO.getSclass()+"\t");//반 출력
			System.out.print(sDTO.getSno()+"\t");//번호 출력
			System.out.print(sDTO.getSname()+"\t");//이름 출력
			//생년월일 출력
			StringBuffer sb = new StringBuffer();
			sb.append(sDTO.getBirth());
			sb.insert(4, "년");
			sb.insert(7, "월");
			sb.insert(10, "일");
			System.out.print(sb+"\t");
			//성별 출력
			if(sDTO.getGender().equalsIgnoreCase("M")) {
				System.out.print("남\t");
			}else {
				System.out.print("여\t");
			}
			//전화번호 출력
			System.out.print(sDTO.getTel1()+"-"+sDTO.getTel2()+"-"+sDTO.getTel3()+"\n");
		}
		
	}

}
