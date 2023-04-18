package exam;

import model.ArtistDAO;

public class Exam_01 {

	public static void main(String[] args) {
		ArtistDAO artistDAO =  ArtistDAO.getInstance();
		
		//artistDAO.tableCreate();
		artistDAO.artistWrite();
	}

}
