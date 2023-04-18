package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.db.DAO;
import com.jslhrd.db.DTO;

public class Exam_03 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();

		List<DTO> dtoList = dao.select3();
		System.out.println("job\tcount");
		for (DTO dto : dtoList) {
			System.out.print(dto.getJob() + "\t");
			System.out.print(dto.getCount() + "\n");
		}
	}

}
