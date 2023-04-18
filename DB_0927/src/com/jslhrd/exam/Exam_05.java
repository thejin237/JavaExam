package com.jslhrd.exam;

import com.jslhrd.db.DAO;

public class Exam_05 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		int max = dao.select5();
		System.out.println("difference");
		System.out.println(max);
		
	}

}
