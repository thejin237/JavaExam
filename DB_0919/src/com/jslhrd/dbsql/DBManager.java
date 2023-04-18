package com.jslhrd.dbsql;
import java.sql.*;
public class DBManager {
	public static Connection getConnection() {
		Connection myConn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return myConn;
	}
	
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			conn.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt, Statement stmt,ResultSet rs) {
		try {
			rs.close();
			stmt.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
