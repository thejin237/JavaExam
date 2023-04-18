package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.dao.DeptDAO;
import com.jslhrd.dto.DeptDTO;

public class DeptList_2 {

	public static void main(String[] args) {
		DeptDAO dao = DeptDAO.getInstance();

		List<DeptDTO> list = dao.deptList();
		if(list.size()==0) {
			System.out.println("없음");
		}else {
			System.out.println("부서번호\t부서명\t지역명");
			for(DeptDTO dto: list) {
				System.out.print(dto.getDno()+"\t");
				System.out.print(dto.getDname()+"\t");
				System.out.print(dto.getLoc()+"\n");
			}
		}

	}

}
