package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.db.DAO;
import com.jslhrd.db.DTO;

public class Exam_06 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		List<DTO> dtoList = dao.select6(2000);
		System.out.println("job\tMinimum");
		for(DTO dto : dtoList) {
			System.out.print(dto.getJob()+"\t");
			System.out.print(dto.getMin()+"\n");
		}
	}

}
