package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_12 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect12("R");
		System.out.println("ename");
		for(EmptDTO dto : eList) {
			System.out.print(dto.getEname()+"\n");
		}
	}

}
