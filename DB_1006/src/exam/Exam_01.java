package exam;

import java.util.List;
import java.util.Scanner;

import model.ExamDAO;
import model.StudentDTO;

public class Exam_01 {

	public static void main(String[] args) {
		ExamDAO dao = ExamDAO.getInstance();
		Scanner scn = new Scanner(System.in);
		
		StudentDTO sdto = new StudentDTO();
		System.out.println("학생등록 화면");
		System.out.print("학년 : ");
		sdto.setSyear(scn.next());
		System.out.print("반 : ");
		sdto.setSclass(scn.next());
		System.out.print("번호 : ");
		sdto.setSno(scn.next());
		System.out.print("이름 : ");
		sdto.setSname(scn.next());
		System.out.print("생년월일 : ");
		sdto.setBirth(scn.next());
		System.out.print("성별 : ");
		sdto.setGender(scn.next());
		System.out.print("전화번호 : ");
		scn.nextLine();
		String[] tel = scn.nextLine().split(" ");
		sdto.setTel1(tel[0]);
		sdto.setTel2(tel[1]);
		sdto.setTel3(tel[2]);
		dao.studentInsert(sdto);
		scn.close();
		
		List<StudentDTO> list = dao.select1();
		System.out.println("학년\t반\t번호\t이름\t생년월일\t성별\t전화번호");
		for(StudentDTO dto : list) {
			System.out.print(dto.getSyear()+"\t");
			System.out.print(dto.getSclass()+"\t");
			System.out.print(dto.getSno()+"\t");
			System.out.print(dto.getSname()+"\t");
			System.out.print(dto.getBirth().substring(0,4)+"년");
			System.out.print(dto.getBirth().substring(4,6)+"월");
			System.out.print(dto.getBirth().substring(6)+"일\t");
			String gender = "여";
			if(dto.getGender().equalsIgnoreCase("M")) {
				gender = "남";
			}
			System.out.print(gender + "\t");
			System.out.println(dto.getTel1()+"-"+dto.getTel2()+"-"+dto.getTel3());
		}
	}

}
