package exam;

import java.text.DecimalFormat;
import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_08 {

	public static void main(String[] args) {
		ArtistDAO dao = ArtistDAO.getInstance();
		DecimalFormat df = new DecimalFormat("##.00");
		
		List<ArtistDTO> list = dao.Select8();
		for(int i = 0; i<list.size();i++) {
			int rank = 1;
			list.get(i).setRank(1);
			for(int j = 0; j<list.size();j++) {
				if(list.get(i).getAvg()<list.get(j).getAvg()) {
					rank++;
				}
			}
			list.get(i).setRank(rank);
		}
		System.out.println("참가번호\t참가자명\t성별\t총점\t평균\t등수");
		for(ArtistDTO dto : list) {
			System.out.print(dto.getArtist_id()+"\t\t");
			System.out.print(dto.getArtist_name()+"\t\t");
			String gender = "여성";
			if(dto.getArtist_gender().equalsIgnoreCase("M")) {
				gender = "남성";
			}
			System.out.print(gender+"\t");
			System.out.print(dto.getSum()+"\t");
			//System.out.print(String.format("%5.2f", dto.getAvg())+"\t");
			System.out.print(df.format(dto.getAvg())+"\t");
			System.out.print(dto.getRank()+"\n");
		}
	}

}
