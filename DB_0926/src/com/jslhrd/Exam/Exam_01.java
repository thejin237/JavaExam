package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_01 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		List<EmptDTO> eList = dao.empSelect();
		System.out.println("ename\tsalary\tpay*300");
		for(EmptDTO dto : eList) {
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getSalary()+"\t");
			System.out.print(dto.getPay()+"\n");
		}
	}

}
