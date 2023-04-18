package exam;

import model.ExamDAO;

public class CreateExam3 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		dao.createExam3();
	}

}
