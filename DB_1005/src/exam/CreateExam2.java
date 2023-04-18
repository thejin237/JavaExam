package exam;

import model.ExamDAO;

public class CreateExam2 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		String tbname = "TBL_MEMBER";
		String id = "ID";
		String name = "NAME";
		String regno = "REGNO";
		String hp = "HP";
		String address = "ADDRESS";
		dao.createExam2(tbname, id, name, regno, hp, address);
	}

}
