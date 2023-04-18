package com.jslhrd.Exam;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_04 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		EmptDTO eDTO = dao.empSelect4(7788);
		System.out.println("ename\tdno");
		System.out.println(eDTO.getEname()+"\t"+eDTO.getDno());
	}

}
