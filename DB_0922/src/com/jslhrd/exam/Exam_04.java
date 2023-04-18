package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.db.MoneyDAO;
import com.jslhrd.db.MoneyDTO;

public class Exam_04 {
	public static void main(String[] args) {
		MoneyDAO mnDAO = MoneyDAO.getInstance();

		List<MoneyDTO> mnList = new ArrayList<MoneyDTO>();

		// 판매번호순 오름차순 정렬
		mnList = mnDAO.moneySelect();
		for (int i = 0; i < mnList.size(); i++) {
			for (int j = 0; j < mnList.size(); j++) {
				if (mnList.get(i).getSaleno() < mnList.get(j).getSaleno()) {
					MoneyDTO temp = mnList.get(i);
					mnList.set(i, mnList.get(j));
					mnList.set(j, temp);
				}
			} // for(j) end
		} // for(i) end

		System.out.println("회원번호\t판매번호\t단가\t수량\t가격\t상품코드\t판매일자");
		DecimalFormat df = new DecimalFormat("###,###");
		for (MoneyDTO mnDTO : mnList) {
			System.out.print(mnDTO.getCustno() + "\t\t");
			System.out.print(mnDTO.getSaleno() + "\t");
			System.out.print(mnDTO.getPcost() + "\t");
			System.out.print(mnDTO.getAmount() + "\t");
			System.out.print(df.format(mnDTO.getPrice()) + "\t");
			System.out.print(mnDTO.getPcode() + "\t\t");
			String sdate = mnDTO.getSdate();

			System.out.print(sdate.substring(0, 4) + "년");
			System.out.print(sdate.substring(4, 6) + "월");
			System.out.print(sdate.substring(6) + "일\n");
		}

	}

}
