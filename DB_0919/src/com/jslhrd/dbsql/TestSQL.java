package com.jslhrd.dbsql;

import java.sql.*;

public class TestSQL {
	Connection conn = null;
	PreparedStatement pstmt = null;
	// Statement stmt = null;
	ResultSet re = null;

	// 등록 메소드
	public int deptWrite(int dno, String dname, String loc) {
		String sql = "insert into department(dno, dname, loc)"
				+ "values(?, ?, ?)";
		int row = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
}
