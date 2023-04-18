package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_15 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect15(500);
		System.out.println("ename\tsalaet\tcommission");
		for(EmptDTO dto : eList) {
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getSalary()+"\t");
			System.out.print(dto.getCommission()+"\n");
		}
	}

}