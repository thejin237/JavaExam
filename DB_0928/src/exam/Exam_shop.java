package exam;

import java.text.DecimalFormat;
import java.util.List;

import db.DAO;
import db.MemberDTO;

public class Exam_shop {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		DecimalFormat df = new DecimalFormat("###,###");
		
		List<MemberDTO> mList = dao.memSelect();
		int tot = 0;
		System.out.println("회원번호\t회원성명\t전화번호\t고객등급\t매출");
		for(MemberDTO dto : mList) {
			System.out.print(dto.getCustno()+"\t\t");
			System.out.print(dto.getCustname()+"\t\t");
			System.out.print(dto.getPhone()+"\t");
			String grade = "직원";
			if(dto.getGrade().equals("A")) {
				grade = "VIP";
			}else if(dto.getGrade().equals("B")) {
				grade = "일반";
			}
			System.out.print(grade+"\t\t");
			System.out.print(df.format(dto.getSum())+"\n");
			tot +=dto.getSum();
		}
		System.out.println("총 매출액: "+df.format(tot));
	}

}
