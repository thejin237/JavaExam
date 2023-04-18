package exam;

import model.ExamDAO;

public class CreateExam2 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		String tbname = "dept3";
		String dno = "dno";
		String dname = "dname";
		String loc = "loc";
		dao.createExam2(tbname, dno, dname, loc);
	}

}
