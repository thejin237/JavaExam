package com.jslhrd.dbtest;
import java.sql.*;

import com.jslhrd.util.DBManager;
public class DBTest {

	public static void main(String[] args) {
		Connection conn = DBManager.getConnection();
		
		System.out.println(conn);
	}

}
