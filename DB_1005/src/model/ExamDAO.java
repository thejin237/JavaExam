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
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "TRACK9";
		String pw = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	//createExam1
	public void createExam1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "CREATE TABLE TBL_MEMBER(\r\n" + 
				"    ID VARCHAR2(20),\r\n" + 
				"    NAME VARCHAR2(20) NOT NULL,\r\n" + 
				"    REGNO VARCHAR2(13) UNIQUE NOT NULL,\r\n" + 
				"    HP VARCHAR2(13) UNIQUE,\r\n" + 
				"    ADDRESS VARCHAR2(100),\r\n" + 
				"    PRIMARY KEY(ID)\r\n" + 
				")";

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
	public void createExam2(String tbname, String id, String name, String regno, String hp, String address) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "CREATE TABLE "+tbname+"(\r\n" + 
				"    "+id+" VARCHAR2(20),\r\n" + 
				"    "+name+" VARCHAR2(20) NOT NULL,\r\n" + 
				"    "+regno+" VARCHAR2(13) UNIQUE NOT NULL,\r\n" + 
				"    "+hp+" VARCHAR2(13) UNIQUE,\r\n" + 
				"    "+address+" VARCHAR2(100),\r\n" + 
				"    PRIMARY KEY("+id+")\r\n" + 
				")";

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
	
	//createExam3
	public void createExam3() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "CREATE TABLE TBL_BOOK(\r\n" + 
				"    CODE NUMBER(4),\r\n" + 
				"    TITLE VARCHAR2(50) NOT NULL,\r\n" + 
				"    COUNT NUMBER(6),\r\n" + 
				"    PRICE NUMBER(10),\r\n" + 
				"    PUBLISH VARCHAR(50),\r\n" + 
				"    PRIMARY KEY(CODE)\r\n" + 
				")";

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
	}// createExam3 end
	
	// createExam4
	public void createExam4(String tbname, String code, String title, String count, String price, String publish) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "CREATE TABLE "+tbname+"(\r\n" + 
				"    "+code+" NUMBER(4),\r\n" + 
				"    "+title+" VARCHAR2(50) NOT NULL,\r\n" + 
				"    "+count+" NUMBER(6),\r\n" + 
				"    "+price+" NUMBER(10),\r\n" + 
				"    "+publish+" VARCHAR(50),\r\n" + 
				"    PRIMARY KEY("+code+")\r\n" + 
				")";
		
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
	}// createExam4 end

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
