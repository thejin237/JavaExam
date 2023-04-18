package exam;

import java.util.List;
import java.util.Scanner;

import model.ExamDAO;
import model.StudentDTO;

public class Exam_03 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		
		Scanner scn = new Scanner(System.in);
		
		List<StudentDTO> stuList = dao.select1();
		while(true) {
			System.out.println("학생정보 삭제");
			System.out.print("학번입력 : ");
			String bun = scn.next();
			String syear = bun.substring(0,1);
			String sclass = bun.substring(1,3);
			String sno = bun.substring(3,5);
			boolean flag = false;
			for(StudentDTO dto : stuList) {
				if(dto.getSyear().equals(syear)&&dto.getSclass().equals(sclass)&&dto.getSno().equals(sno)) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println("학생정보가 존재하지 않습니다");
				continue;
			}else {
				dao.scoreDelete(syear, sclass, sno);
				dao.studentDelete(syear, sclass, sno);
				System.out.println("학생정보가 삭제되었습니다");
				break;
			}
		}
		scn.close();
	}

}
