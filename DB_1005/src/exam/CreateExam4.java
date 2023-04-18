package exam;

import model.ExamDAO;

public class CreateExam4 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		String tbname = "TBL_BOOK";
		String code = "CODE";
		String title = "TITLE";
		String count = "COUNT";
		String price = "PRICE";
		String publish = "PUBLISH";
		dao.createExam4(tbname, code, title, count, price, publish);
	}

}
