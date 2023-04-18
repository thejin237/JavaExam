package exam;

import model.ExamDAO;

public class CreateExam {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		dao.createExam();
		//dao.dropExam();
	}

}
