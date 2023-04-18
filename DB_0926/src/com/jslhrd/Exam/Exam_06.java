package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_06 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect6("1981/02/20","1981/05/01");
		System.out.println("ename\tjob\thiredate");
		for(EmptDTO eDTO : eList) {
			System.out.print(eDTO.getEname()+"\t");
			System.out.print(eDTO.getJob()+"\t");
			System.out.print(eDTO.getHiredate()+"\n");
		}
	}

}
