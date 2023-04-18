package com.jslhrd.util;
import java.sql.*;
public class DeptSQL extends DBConn {
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;//select
	public DeptSQL() {
	}
	
	// 등록메소드 선언
	public int delpWrite() throws Exception{
		String sql = "insert into department values(50,'aaaa','bbb')";
		stmt = myConn.createStatement();
		int row = stmt.executeUpdate(sql);
		return row;
	}
	
	@Override
	public void cleanup() throws Exception {
		// TODO Auto-generated method stub

	}

}
