package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamDAO {
	public ExamDAO() {
	}

	private static ExamDAO instance = new ExamDAO();

	public static ExamDAO getInstance() {
		return instance;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void createExam() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "create table dept2(\r\n" + "    dno number(2) primary key,\r\n"
				+ "    dname varchar2(20) not null,\r\n" + "    loc varchar2(20)\r\n" + ")";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// createExam end

	// createExam2
	public void createExam2(String tbname, String dno, String dname, String loc) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "create table " + tbname + "(\r\n" 
				+ dno + " number(2) primary key,\r\n" 
				+ dname + " varchar2(20) not null,\r\n"
				+ loc + " varchar2(20)\r\n" + ")";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// createExam2 end

	public void dropExam() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "drop table dept2";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// dropExam end
}
