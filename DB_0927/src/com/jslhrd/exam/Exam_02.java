package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.db.DAO;
import com.jslhrd.db.DTO;

public class Exam_02 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();

		List<DTO> dtoList = dao.select2();
		System.out.println("job\tMaximum\tMinimum\tSum\tAverage");
		for (DTO dto : dtoList) {
			System.out.print(dto.getJob() + "\t");
			System.out.print(dto.getMax() + "\t");
			System.out.print(dto.getMin() + "\t");
			System.out.print(dto.getSum() + "\t");
			System.out.print(dto.getAvg() + "\n");
		}
	}

}
