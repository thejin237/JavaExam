package exam;

import java.util.List;

import model.ArtistDAO;
import model.PointDTO;

public class Exam_04 {

	public static void main(String[] args) {
		ArtistDAO dao = ArtistDAO.getInstance();
		
		dao.pointUpdate();
		List<PointDTO> pointList = dao.pointSelect();
		System.out.println("채점번호\t참가번호\t멘토이아디\t점수");
		for(PointDTO dto : pointList) {
			System.out.print(dto.getSerial_no()+"\t\t");
			System.out.print(dto.getArtist_id()+"\t\t");
			System.out.print(dto.getMento_id()+"\t\t");
			System.out.print(dto.getPoint()+"\n");
		}
	}

}
