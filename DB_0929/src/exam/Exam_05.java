package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_05 {

	public static void main(String[] args) {
		ArtistDAO dao = ArtistDAO.getInstance();
		
		dao.artistDelete();
		List<ArtistDTO> artistList = dao.artistSelect();
		System.out.println("참가번호\t참가자명\t생년월일\t성별\t특기\t소속사");
		for(ArtistDTO dto : artistList) {
			System.out.print(dto.getArtist_id()+"\t\t");
			System.out.print(dto.getArtist_name()+"\t\t");
			System.out.print(dto.getArtist_birth().substring(0,4)+"년");
			System.out.print(dto.getArtist_birth().substring(4,6)+"월");
			System.out.print(dto.getArtist_birth().substring(6)+"일\t");
			String gender = "여자";
			if(dto.getArtist_gender().equalsIgnoreCase("M")) {
				gender = "남자";
			}
			System.out.print(gender+"\t");
			String talent = "랩";
			if(dto.getTalent().equals("1")) {
				talent = "댄스";
			}else if(dto.getTalent().equals("2")) {
				talent = "노래";
			}
			System.out.print(talent+"\t");
			System.out.print(dto.getAgency()+"\n");
		}
	}

}
