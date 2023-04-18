package db;

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
	
	public DTO select01() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select e.ename, e.dno, d.dname from employee e, department d where e.dno=d.dno and ename='SCOTT'";
		
		DTO dto = new DTO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setEname(rs.getString("ename"));
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}
	
	public List<DTO> select02(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, dname, loc from employee e inner join department d on e.dno=d.dno";
		List<DTO> list = new ArrayList<DTO>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DTO dto = new DTO();
				dto.setEname(rs.getString("ename"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}//try end
		return list;
	}
	
	public List<MemberDTO> memSelect(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select t1.custno, custname, phone, grade, sum(price) as sum\r\n" + 
				"    from tbl_member_001 t1, tbl_money_001 t2 \r\n" + 
				"        where t1.custno=t2.custno \r\n" + 
				"            group by t1.custno, custname, phone, grade\r\n" + 
				"                order by sum(price) desc";
		List<MemberDTO> mList = new ArrayList<MemberDTO>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO mDTO = new MemberDTO();
				mDTO.setCustno(rs.getInt("custno"));
				mDTO.setCustname(rs.getString("custname"));
				mDTO.setPhone(rs.getString("phone"));
				mDTO.setGrade(rs.getString("grade"));
				mDTO.setSum(rs.getInt("sum"));
				mList.add(mDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mList;
	}
}
