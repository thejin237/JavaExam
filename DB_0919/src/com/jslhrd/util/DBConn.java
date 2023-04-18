package com.jslhrd.util;
import java.sql.*;
public abstract class DBConn {
	public Connection myConn;
	public DBConn() {}
	public void makeConn() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		myConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
	}
	
	public abstract void cleanup() throws Exception;
	
	public void takeDown() throws Exception{
		cleanup();
		myConn.close();
	}
}
