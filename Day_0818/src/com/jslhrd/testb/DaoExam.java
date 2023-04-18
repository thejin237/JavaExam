package com.jslhrd.testb;

public class DaoExam {
	static void dbWork(DataAccess dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

}
