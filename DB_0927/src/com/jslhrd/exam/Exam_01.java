package com.jslhrd.exam;

import com.jslhrd.db.DAO;
import com.jslhrd.db.DTO;

public class Exam_01 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();

		DTO dto = dao.select1();

		System.out.println("Maximum\tMinimum\tSum\tAverage");
		System.out.print(dto.getMax() + "\t");
		System.out.print(dto.getMin() + "\t");
		System.out.print(dto.getSum() + "\t");
		System.out.print(dto.getAvg() + "\t");
	}

}
