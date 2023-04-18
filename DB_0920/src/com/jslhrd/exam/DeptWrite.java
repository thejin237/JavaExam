package com.jslhrd.exam;

import com.jslhrd.dao.DeptDAO;
import com.jslhrd.dto.DeptDTO;

public class DeptWrite {

	public static void main(String[] args) {
		DeptDAO dao = DeptDAO.getInstance();
		
		DeptDTO dept = new DeptDTO();
		dept.setDno(50);
		dept.setDname("aaaa");
		dept.setLoc("bbbb");
		
		int row = dao.deptWrite(dept);
		if(row==1) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록실패");
		}
	}

}
