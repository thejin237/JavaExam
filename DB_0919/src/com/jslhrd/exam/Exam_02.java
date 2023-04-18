package com.jslhrd.exam;

import com.jslhrd.dbsql.ExamSQL;

public class Exam_02 {
	public static void main(String[] args) {
		ExamSQL sql = ExamSQL.getInstance();
		
//		//1.등록
//		int row = sql.deptWrite(70, "인사과", "대전");
//		System.out.println("row"+ row);
		
//		//2.수정(부서번호를 찾아서 부서명, 지역명 수정
//		int row = sql.deptUpdate(70, "총무과", "사용");
//		System.out.println("row"+ row);
		
//		//3.삭제(부서번호 70 삭제)
//		int row = sql.deptDelete(70);
//		System.out.println("row"+ row);
		
		//4.조회
		sql.deptList();
	}

}
