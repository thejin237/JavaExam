package com.jslhrd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.jslhrd.dto.StudentDTO;
import com.jslhrd.util.DBManager;

public class StudentDAO {
	private StudentDAO() {
	}

	private static StudentDAO instance = new StudentDAO();

	public static StudentDAO getInstance() {
		return instance;
	}

	// 1. 등록 메소드
	public int DeptWrite(StudentDTO sdto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0; //return
		String sql = "insert into TBL_STUDENT(syear,sclass,sno,sname,birth,gender,tel1,tel2,tel3)"
				+"values(?,?,?,?,?,?,?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, sdto.getSyear());
			pstmt.setNString(2, sdto.getSclass());
			pstmt.setNString(3, sdto.getSno());
			pstmt.setNString(4, sdto.getSname());
			pstmt.setNString(5, sdto.getBirth());
			pstmt.setNString(6, sdto.getGender());
			pstmt.setNString(7, sdto.getTel1());
			pstmt.setNString(8, sdto.getTel2());
			pstmt.setNString(9, sdto.getTel3());
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	// 2. 학생조회 메소드
	public List<StudentDTO> DeptSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> slist = new ArrayList<StudentDTO>(); //return
		String sql = "select * from tbl_student";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO sdto = new StudentDTO();
				sdto.setSyear(rs.getString("syear"));
				sdto.setSclass(rs.getString("sclass"));
				sdto.setSno(rs.getString("sno"));
				sdto.setSname(rs.getString("sname"));
				sdto.setBirth(rs.getString("birth"));
				sdto.setGender(rs.getString("gender"));
				sdto.setTel1(rs.getString("tel1"));
				sdto.setTel2(rs.getString("tel2"));
				sdto.setTel3(rs.getString("tel3"));
				slist.add(sdto);
			}
			//list = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return slist;
	}
	
	// 3. 삭제 메소드
	public int DeptDelete(StudentDTO sdto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0; //return
		String sql = "delete from TBL_STUDENT where ";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, sdto.getSyear());
			pstmt.setNString(2, sdto.getSclass());
			pstmt.setNString(3, sdto.getSno());
			pstmt.setNString(4, sdto.getSname());
			pstmt.setNString(5, sdto.getBirth());
			pstmt.setNString(6, sdto.getGender());
			pstmt.setNString(7, sdto.getTel1());
			pstmt.setNString(8, sdto.getTel2());
			pstmt.setNString(9, sdto.getTel3());
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

}
