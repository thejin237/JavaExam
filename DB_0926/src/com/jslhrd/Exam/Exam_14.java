package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_14 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect14("CLERK","SALESMAN",1600,950,1300);
		System.out.println("ename\tjob\tsalary");
		for(EmptDTO dto : eList) {
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getJob()+"\t");
			System.out.print(dto.getSalary()+"\n");
		}
	}

}
