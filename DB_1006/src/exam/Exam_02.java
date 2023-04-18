package exam;

import java.util.List;
import java.util.Scanner;

import model.ExamDAO;
import model.JoinedDTO;
import model.StudentDTO;

public class Exam_02 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		Scanner scn = new Scanner(System.in);
		List<StudentDTO> stuList = dao.select1();
		System.out.println("학생등록 화면");
		while(true) {
			JoinedDTO jdto = new JoinedDTO();
			System.out.print("학년 : ");
			String syear = scn.next();
			System.out.print("반 : ");
			String sclass = scn.next();
			System.out.print("번호 : ");
			String sno = scn.next();
			boolean flag = false;
			for(StudentDTO sdto : stuList) {
				if(sdto.getSyear().equals(syear)&&sdto.getSclass().equals(sclass)&&sdto.getSno().equals(sno)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println("등록된 학생이 없습니다.");
				continue;
			}else {
				jdto.setSyear(syear);
				jdto.setSclass(sclass);
				jdto.setSno(sno);
				System.out.print("국어 : ");
				jdto.setKor(scn.nextInt());
				System.out.print("영어 : ");
				jdto.setEng(scn.nextInt());
				System.out.print("수학 : ");
				jdto.setMat(scn.nextInt());
				dao.scoreInsert(jdto);
				System.out.println("성적정보가 등록되었습니다.");
				break;
			}
		}
		scn.close();
		
		List<JoinedDTO> jList = dao.select2();
		System.out.println("학년\t반\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(JoinedDTO dto : jList) {
			System.out.print(dto.getSyear()+"\t");
			System.out.print(dto.getSclass()+"\t");
			System.out.print(dto.getSno()+"\t");
			System.out.print(dto.getSname()+"\t");
			System.out.print(dto.getKor()+"\t");
			System.out.print(dto.getEng()+"\t");
			System.out.print(dto.getMat()+"\t");
			int tot = dto.getKor()+dto.getEng()+dto.getMat();
			System.out.print(tot+"\t");
			double avg = (int)(tot/3.*10+0.5)/10.;
			System.out.println(avg);
		}
	}

}
