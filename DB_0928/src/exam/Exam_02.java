package exam;

import java.util.List;

import db.DAO;
import db.DTO;

public class Exam_02 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		List<DTO> list = dao.select02();
		System.out.println("ename\tdname\tloc");
		for(DTO dto : list) {
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getDname()+"\t");
			System.out.print(dto.getLoc()+"\n");
		}
	}

}
