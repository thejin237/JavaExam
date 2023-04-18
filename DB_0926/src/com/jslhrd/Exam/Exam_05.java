package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_05 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect5(2000,3000);
		System.out.println("ename\tsalary");
		for(EmptDTO eDTO : eList) {
			System.out.print(eDTO.getEname()+"\t");
			System.out.print(eDTO.getSalary()+"\n");
		}
	}

}
