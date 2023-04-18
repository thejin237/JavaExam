package com.jslhrd.exam;

import com.jslhrd.dao.DeptDAO;
import com.jslhrd.dto.DeptDTO;

public class DeptDelete {

	public static void main(String[] args) {
		DeptDAO dao = DeptDAO.getInstance();
		
		DeptDTO dept = new DeptDTO();
		dept.setDno(50);
		int row = dao.deptDelete(dept);
		if(row==1) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}

}
