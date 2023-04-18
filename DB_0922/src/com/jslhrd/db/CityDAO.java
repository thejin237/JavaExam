package com.jslhrd.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.util.DBManager;

public class CityDAO {
	public CityDAO() {
	}

	private static CityDAO instance = new CityDAO();

	public static CityDAO getInstance() {
		return instance;
	}

	public List<CityDTO> citySelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from tbl_city_001" ;
		List<CityDTO> cList = new ArrayList<CityDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				CityDTO cdto = new CityDTO();
				cdto.setCity(rs.getNString("city"));
				cdto.setCityname(rs.getNString("cityname"));
				cList.add(cdto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}

		return cList;
	}

}
