package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.db.DAO;
import com.jslhrd.db.DTO;

public class Exam_07 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		List<DTO> dtoList = dao.select7();
		System.out.println("dno\tcount\tavg");
		for(DTO dto : dtoList) {
			System.out.print(dto.getDno()+"\t");
			System.out.print(dto.getCount()+"\t");
			System.out.print(dto.getAvgd()+"\n");
		}
	}

}
