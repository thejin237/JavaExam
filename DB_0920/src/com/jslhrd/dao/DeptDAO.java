package com.jslhrd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.dto.DeptDTO;
import com.jslhrd.util.DBManager;

//DAO: Data Access Object
public class DeptDAO {
	private DeptDAO() {}
	private static DeptDAO instance = new DeptDAO();
	
	public static DeptDAO getInstance() {
		return instance;
	}
	
	//1. 등록 메소드 정의
/*	
	public void deptWrite(int dno, String dname, String loc) {
		
	}
*/
	public int deptWrite(DeptDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into department(dno, dname, loc)"
		+"values(?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getDno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			row = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//삭제-1
	public int deptDelete(DeptDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String sql = "delete from department where dno = ?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getDno());
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//삭제-2
	public int deptDelete(int dno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String sql = "delete from department where dno = ?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//수정
	public int deptUpdate(DeptDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0; // Return
		String sql = "update department set dname=? where dno=?";
		//String sql = "update department set dname=?, loc=? where dno=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getDname());
			pstmt.setInt(2, dto.getDno());
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//검색
	public DeptDTO deptSelect(int dno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;//Must be defined to use select
		
		DeptDTO dto = new DeptDTO();// Return
		String sql = "select * from department where dno = ?";
		//String sql = "update department set dname=?, loc=? where dno=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return dto;
	}
	//검색 -2
	public List<DeptDTO> deptList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;//Must be defined to use select
		
		List<DeptDTO> list = new ArrayList<DeptDTO>();// Return
		String sql = "select * from department";
		//String sql = "update department set dname=?, loc=? where dno=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DeptDTO dto = new DeptDTO();
				
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return list;
	}
}
