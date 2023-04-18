package exam;

import db.DAO;
import db.DTO;

public class Exam_01 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		DTO dto = dao.select01();
		System.out.println("ename\tdno\tdname");
		System.out.print(dto.getEname()+"\t");
		System.out.print(dto.getDno()+"\t");
		System.out.print(dto.getDname()+"\t");
	}

}
