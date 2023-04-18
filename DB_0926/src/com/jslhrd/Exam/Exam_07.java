package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_07 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect7(2000,3000);
		for(EmptDTO dto : eList) {
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getDno()+"\n");
		}
	}

}
