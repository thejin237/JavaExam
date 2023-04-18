package exam;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import database.DAO;
import database.ProductDTO;

public class Exam_01 {

	public static void main(String[] args) {
		DAO dao = DAO.getInstance();
		
		//Select data of product
		List<ProductDTO> list = dao.productSelect();
		
		//Insert data of product
		Scanner scn = new Scanner(System.in);
		while(true) {
			ProductDTO proDTO = new ProductDTO();
			System.out.println("제품 등록 화면");
			System.out.print("제품코드 : ");
			String p_code = scn.next().toUpperCase();
			boolean flag = false;
			for(ProductDTO dto : list) {
				if(dto.getP_code().equals(p_code)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("이미 등록된 제품코드 입니다");
				continue;
			}else {
				proDTO.setP_code(p_code);
				System.out.print("제품명 : ");
				proDTO.setP_name(scn.next().toUpperCase());
				System.out.print("제품규격 : ");
				proDTO.setP_size(scn.next().toUpperCase());
				System.out.print("제품구분 : ");
				proDTO.setP_type(scn.next().toUpperCase());
				System.out.print("제품단가 : ");
				proDTO.setP_price(scn.nextInt());
				scn.close();
				dao.productInsert(proDTO);
			}
			System.out.print("제품등록을 계속합니다(Y/N)?");
			String cont = scn.next();
			if(cont.equalsIgnoreCase("Y")) {
				continue;
			}else if(cont.equalsIgnoreCase("N")) {
				DecimalFormat df = new DecimalFormat("\u00A4,000");
				list = dao.productSelect();
				System.out.println("\t\t\t제품조회");
				for(ProductDTO dto : list) {
					System.out.print(dto.getP_code()+"\t");
					System.out.print(dto.getP_name()+"\t");
					System.out.print(dto.getP_size()+"\t");
					System.out.print(dto.getP_type()+"\t");
					System.out.print(df.format(dto.getP_price())+"\n");
				}
				break;
			}
		}//while end
		
	}

}
