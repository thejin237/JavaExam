package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_07 {

	public static void main(String[] args) {
		ArtistDAO dao = ArtistDAO.getInstance();
		
		List<ArtistDTO> artistList = dao.joinSelect();
		System.out.println("채점번호\t참가번호\t참가자명\t생년월일\t점수\t평점\t멘토");
		for(ArtistDTO dto : artistList) {
			System.out.print(dto.getSerial_no()+"\t\t");
			System.out.print(dto.getArtist_id()+"\t\t");
			System.out.print(dto.getArtist_name()+"\t\t");
			System.out.print(dto.getArtist_birth().substring(0,4)+"년");
			System.out.print(dto.getArtist_birth().substring(4,6)+"월");
			System.out.print(dto.getArtist_birth().substring(6)+"일\t");
			System.out.print(dto.getPoint()+"\t");
			String grade = "F";
			if(dto.getPoint()>=90) {
				grade = "A";
			}else if(dto.getPoint()>=80) {
				grade = "B";
			}else if(dto.getPoint()>=70) {
				grade = "C";
			}else if(dto.getPoint()>=60) {
				grade = "D";
			}
			System.out.print(grade+"\t");
			System.out.print(dto.getMento_name()+"\n");
		}
	}

}
