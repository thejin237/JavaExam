package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.db.DAO;
import com.jslhrd.db.DTO;

public class Exam_08 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		List<DTO> dtoList  = dao.select8();
		System.out.println("dname\t\tLocation\tNumber of People\tSalary");
		for(DTO dto : dtoList) {
			System.out.print(dto.getDname()+"\t");
			System.out.print(dto.getLoc()+"\t");
			System.out.print(dto.getCount()+"\t");
			System.out.print(dto.getAvg()+"\n");
		}
	}

}
