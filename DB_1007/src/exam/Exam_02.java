package exam;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import database.DAO;
import database.JoinedDTO;
import database.ProductDTO;

public class Exam_02 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();

		List<ProductDTO> pdList = dao.productSelect();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("작업지시 등록 화면");
			int worknoMax = dao.worknoMaxSelect();
			String workno = String.format("%8d", worknoMax + 1);
			System.out.println("작업지시번호 : " + workno);
			System.out.print("제품코드     : ");
			String p_code = scn.next().toUpperCase();
			boolean flag = false;
			for (ProductDTO dto : pdList) {
				if (dto.getP_code().equals(p_code)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				JoinedDTO jDTO = new JoinedDTO();
				jDTO.setW_workno(workno);
				jDTO.setP_code(p_code);
				while (true) {
					System.out.print("수량         : ");
					String quentity = scn.next();
					while (!Pattern.matches("\\d{1,3}", quentity)) {
						System.out.println("입력오류");
						System.out.print("수량         : ");
						quentity = scn.next();
					}
					if (Integer.parseInt(quentity) <= 0 || Integer.parseInt(quentity) >= 1000) {
						System.out.println("입력오류");
					} else {
						jDTO.setW_quentity(Integer.parseInt(quentity));
						break;
					}
				}
				System.out.print("작업시작일   : ");
				jDTO.setW_workdate(scn.next());
				dao.worklistInsert(jDTO);
			} else {
				System.out.println("등록된 제품코드가 없습니다");
				worknoMax--;
				continue;
			}
			System.out.println("작업지시등록을 계속합니다(Y/N)");
			String cont = scn.next();
			if (cont.equalsIgnoreCase("Y")) {
				continue;
			} else if (cont.equalsIgnoreCase("N")) {
				List<JoinedDTO> list = dao.joinedSelect();
				System.out.println("\t\t\t\t작업지시조회");
				System.out.println("작업지시번호\t제품코드\t제품명\t제품규격\t제품구분\t수량\t작업시작일");
				for (JoinedDTO dto : list) {
					System.out.print(dto.getW_workno().substring(0, 4) + "-");
					System.out.print(dto.getW_workno().substring(4) + "\t");
					System.out.print(dto.getP_code() + "\t");
					System.out.print(dto.getP_name() + "\t");
					System.out.print(dto.getP_size() + "\t");
					System.out.print(dto.getP_type() + "\t");
					System.out.print(dto.getW_quentity() + "\t");
					System.out.print(dto.getW_workdate().substring(0, 4) + "-");
					System.out.print(dto.getW_workdate().substring(4, 6) + "-");
					System.out.print(dto.getW_workdate().substring(6) + "\n");
				}
				break;
			} // if(cont) end
		} // while end
	}// main end

}
