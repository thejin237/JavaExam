package com.jslhrd.exam;

import com.jslhrd.db.DAO;

public class Exam_04 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();

		int count = dao.select4();
		System.out.println("count");
		System.out.println(count);
	}

}
