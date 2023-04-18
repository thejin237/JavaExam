package com.jslhrd.dbsql;

import java.sql.*;

public class ExamSQL {
	private ExamSQL() {
	}

	private static ExamSQL instance = new ExamSQL();

	public static ExamSQL getInstance() {
		return instance;
	}

	// 등록 메소드
	public int deptWrite(int dno, String dname, String loc) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into department(dno, dname, loc)"
				+ "values(?,?,?)";
		int row = 0;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);;
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}// deptWrite end
	
	// 수정
	public int deptUpdate(int dno, String dname, String loc) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update department set dname=?, loc=?"
				+ "where dno=?";
		int row = 0;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);;
			pstmt.setInt(3, dno);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}//deptUpdate end
	
	// 삭제
	public int deptDelete(int dno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from department where dno=?";

		int row = 0;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}//deptUpdate end
	
	// 삭제
	public void deptList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from department";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("DNO\tDNAME\tLOC");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");//rs.getInt("DNO")
				System.out.print(rs.getString(2)+"\t");//rs.getString("dname")
				System.out.print(rs.getString(3)+"\n");//rs.getString("loc")
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			DBManager.close(conn, pstmt);
		}
	}//deptList end
	
}
