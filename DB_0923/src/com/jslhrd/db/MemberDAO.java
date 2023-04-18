package com.jslhrd.db;

import java.util.*;

import com.jslhrd.util.DBManager;

import java.sql.*;

public class MemberDAO {
	public MemberDAO() {
	}
	//create instance of MemberDAO as Sington
	private static MemberDAO instance = new MemberDAO();

	// getInstance of MemberDAO
	public static MemberDAO getInstance() {
		return instance;
	}// MemberDAO end

	// Write(insert) member's information
	public int memberWrite(MemberDTO mbDTO) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into tbl_member_002(usemo, name, phone1, phone2, phone3, gender, birthday, regdate)"
				+ "values(?, ?, ?, ?, ?, ?, ?, ?)";

		int row = 0;// return
		try {
			conn = DBManager.getConnection();// DBManager Connection activate
			pstmt = conn.prepareStatement(sql);// transfer sql query to oracle DB

			pstmt.setInt(1, mbDTO.getUsemo());
			pstmt.setString(2, mbDTO.getName());
			pstmt.setString(3, mbDTO.getPhone1());
			pstmt.setString(4, mbDTO.getPhone2());
			pstmt.setString(5, mbDTO.getPhone3());
			pstmt.setString(6, mbDTO.getGender());
			pstmt.setString(7, mbDTO.getBirthday());
			pstmt.setString(8, mbDTO.getRegdate());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}// memberWrite end

	// Select member's information
	public List<MemberDTO> memberSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from tbl_member_002";

		List<MemberDTO> mbList = new ArrayList<MemberDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberDTO mbDTO = new MemberDTO();//create instance of MemberDTO
				
				mbDTO.setUsemo(rs.getInt("usemo"));
				mbDTO.setName(rs.getString("name"));
				mbDTO.setPhone1(rs.getString("phone1"));
				mbDTO.setPhone2(rs.getString("phone2"));
				mbDTO.setPhone3(rs.getString("phone3"));
				mbDTO.setGender(rs.getString("gender"));
				mbDTO.setBirthday(rs.getString("birthday"));
				mbDTO.setRegdate(rs.getString("regdate"));
				mbList.add(mbDTO);
			}//while(rs) end
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mbList;// return member's List from Database
	}// memberSelect end
	
	// Select member's information
	public int usemoSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select max(usemo) as maxmo from tbl_member_002";
		
		int usemoMax = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				usemoMax = rs.getInt("maxmo");
				System.out.println("맥스확인:"+usemoMax);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return usemoMax;// return usemoMax from Database
	}// memberSelect end
	
}
