package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class DAO {
	private DAO() {}
	private static DAO instance = new DAO();
	public static DAO getInstance() {
		return instance;
	}
	
	public List<ProductDTO> productSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT P_CODE, P_NAME, P_SIZE, P_TYPE, P_PRICE FROM TBL_PRODUCT_201909 ORDER BY P_CODE";
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setP_code(rs.getString("P_CODE"));
				dto.setP_name(rs.getString("P_NAME"));
				dto.setP_size(rs.getString("P_SIZE"));
				dto.setP_type(rs.getString("P_TYPE"));
				dto.setP_price(rs.getInt("P_PRICE"));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public void productInsert(ProductDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TBL_PRODUCT_201909(P_CODE, P_NAME, P_SIZE, P_TYPE, P_PRICE)\r\n" + 
				"    VALUES(?,?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getP_code());
			pstmt.setString(2, dto.getP_name());
			pstmt.setString(3, dto.getP_size());
			pstmt.setString(4, dto.getP_type());
			pstmt.setInt(5, dto.getP_price());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public List<JoinedDTO> joinedSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT W_WORKNO, PD.P_CODE, PD.P_NAME, PD.P_SIZE, PD.P_TYPE, W.W_QUENTITY, W.W_WORKDATE\r\n" + 
				"    FROM TBL_WORKLIST_201909 W, TBL_PRODUCT_201909 PD\r\n" + 
				"        WHERE W.P_CODE = PD.P_CODE\r\n" + 
				"            ORDER BY W_WORKNO";
		List<JoinedDTO> list = new ArrayList<JoinedDTO>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				JoinedDTO dto = new JoinedDTO();
				dto.setW_workno(rs.getString("W_WORKNO"));
				dto.setP_code(rs.getString("P_CODE"));
				dto.setP_name(rs.getString("P_NAME"));
				dto.setP_size(rs.getString("P_SIZE"));
				dto.setP_type(rs.getString("P_TYPE"));
				dto.setW_quentity(rs.getInt("W_QUENTITY"));
				dto.setW_workdate(rs.getString("W_WORKDATE"));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public void worklistInsert(JoinedDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TBL_WORKLIST_201909(W_WORKNO, P_CODE, W_QUENTITY, W_WORKDATE)\r\n" + 
				"    VALUES(?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getW_workno());
			pstmt.setString(2, dto.getP_code());
			pstmt.setInt(3, dto.getW_quentity());
			pstmt.setString(4, dto.getW_workdate());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public int worknoMaxSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT MAX(W_WORKNO) AS MAX FROM TBL_WORKLIST_201909";
		int worknoMax = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("MAX")==null) {
					worknoMax = 20190000;
				}else {
					worknoMax = Integer.parseInt(rs.getString("MAX"));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return worknoMax;
	}
}
