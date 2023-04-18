package com.jslhrd.dbsql;
import com.jslhrd.util.DeptSQL;
public class DeptWrite {
	public static void main(String[] args) throws Exception{
		DeptSQL dept = new DeptSQL();
		dept.makeConn();
		int row = dept.delpWrite();
		if(row==1)
			System.out.println("complete");
		
		dept.takeDown();
	}

}
