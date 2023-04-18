package com.jslhrd.Exam;

import java.util.List;

import com.jslhrd.model.EmptDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_08 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		List<EmptDTO> eList = dao.empSelect8(2000,3000,20,30);
		System.out.println("ename\tsalary\tdno");
		for(EmptDTO dto : eList) {
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getSalary()+"\t");
			System.out.print(dto.getDno()+"\n");
		}
	}

}
