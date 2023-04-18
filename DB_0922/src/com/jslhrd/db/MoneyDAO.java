package com.jslhrd.db;

import java.sql.*;
import java.util.*;

import com.jslhrd.util.DBManager;

public class MoneyDAO {
	private MoneyDAO() {}
	private static MoneyDAO instance = new MoneyDAO();
	
	public static MoneyDAO getInstance() {
		return instance;
	}
	
	// write(insert)
	public int moneyWrite(MoneyDTO mdto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row=0;
		String sql = "insert into tbl_money_001(custno, saleno, pcost, amount, price, pcode, sdate)"
				+"values(?,?,?,?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mdto.getCustno());
			pstmt.setInt(2, mdto.getSaleno());
			pstmt.setInt(3, mdto.getPcost());
			pstmt.setInt(4, mdto.getAmount());
			pstmt.setInt(5, mdto.getPrice());
			pstmt.setString(6, mdto.getPcode());
			pstmt.setString(7, mdto.getSdate());
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return row;
		
	}

	// Select
	public List<MoneyDTO> moneySelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from tbl_money_001";
		
		List<MoneyDTO> mlist = new ArrayList<MoneyDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MoneyDTO mdto = new MoneyDTO();
				mdto.setCustno(rs.getInt("custno"));
				mdto.setSaleno(rs.getInt("saleno"));
				mdto.setPcost(rs.getInt("pcost"));
				mdto.setAmount(rs.getInt("amount"));
				mdto.setPrice(rs.getInt("price"));
				mdto.setPcode(rs.getString("pcode"));
				mdto.setSdate(rs.getString("sdate"));
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
