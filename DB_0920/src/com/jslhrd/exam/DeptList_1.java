package com.jslhrd.exam;

import com.jslhrd.dao.DeptDAO;
import com.jslhrd.dto.DeptDTO;

public class DeptList_1 {

	public static void main(String[] args) {
		DeptDAO dao = DeptDAO.getInstance();

		DeptDTO dept = dao.deptSelect(20);
		if(dept.getDno()==0) {
			System.out.println("없는 부서");
		}else {
			System.out.println("부서번호 : " + dept.getDno());
			System.out.println("부서명 : " + dept.getDname());
			System.out.println("지역명 : " + dept.getLoc());
		}

	}

}
