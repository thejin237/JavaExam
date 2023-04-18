package com.jslhrd.exam;

import java.util.Scanner;

import com.jslhrd.dao.DeptDAO;
import com.jslhrd.dto.DeptDTO;

public class DeptWrite2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DeptDAO dao = DeptDAO.getInstance();
		
		DeptDTO dept = new DeptDTO();
		System.out.print("부서번호:");
		int dno = scanner.nextInt();
		System.out.print("성명:");
		String dname = scanner.next();
		System.out.print("지역:");
		String loc = scanner.next();
		
		dept.setDno(dno);
		dept.setDname(dname);
		dept.setLoc(loc);
		
		int row = dao.deptWrite(dept);
		if(row==1) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록실패");
		}
	}

}
