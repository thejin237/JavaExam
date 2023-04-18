package com.jslhrd.db;

import java.sql.*;

import com.jslhrd.util.DBManager;
import java.util.*;

public class MemberDAO {
	public MemberDAO() {}
	
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}
	
	// 마지막번호 검색
	public int custnoMax() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select max(custno) mc from tbl_member_001";
		int custno =0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				custno = rs.getInt("mc");//custno = rs.getInt(1);
			}
			
		}catch(Exception e){
			
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return custno;
		
	}
	
	
	public int memberWrite(MemberDTO mdto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into tbl_member_001(custno, custname, phone, gender, joindate, grade, city)"
				+"values(?,?,?,?,?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mdto.getCustno());
			pstmt.setString(2, mdto.getCustname());
			pstmt.setString(3, mdto.getPhone());
			pstmt.setString(4, mdto.getGender());
			pstmt.setString(5, mdto.getJoindate());
			pstmt.setString(6, mdto.getGrade());
			pstmt.setString(7, mdto.getCity());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	//select
	public List<MemberDTO> memberSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select custno, custname, phone, gender, joindate, grade, cityname\r\n" + 
				"from tbl_member_001, tbl_city_001 where tbl_member_001.city = tbl_city_001.city";
		
		List<MemberDTO> mlist = new ArrayList<MemberDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO mdto = new MemberDTO();
				mdto.setCustno(rs.getInt("custno"));
				mdto.setCustname(rs.getString("custname"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setGender(rs.getString("gender"));
				mdto.setJoindate(rs.getString("joindate"));
				mdto.setGrade(rs.getString("grade"));
				mdto.setCityname(rs.getString("cityname"));
				mlist.add(mdto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mlist;
	}	
		
		//select
		public List<MemberDTO> salesSelect() {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select custno, custname, phone, grade, \r\n" + 
					"from tbl_member_001, tbl_city_001 where tbl_member_001.city = tbl_city_001.city";
			
			List<MemberDTO> mlist = new ArrayList<MemberDTO>();
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					MemberDTO mdto = new MemberDTO();
					mdto.setCustno(rs.getInt("custno"));
					mdto.setCustname(rs.getString("custname"));
					mdto.setPhone(rs.getString("phone"));
					mdto.setGender(rs.getString("gender"));
					mdto.setJoindate(rs.getString("joindate"));
					mdto.setGrade(rs.getString("grade"));
					mdto.setCityname(rs.getString("cityname"));
					mlist.add(mdto);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			}
			return mlist;
	}
	
}
