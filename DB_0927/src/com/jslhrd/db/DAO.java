package com.jslhrd.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.util.DBManager;

public class DAO {
	public DAO() {
	}

	private static DAO instance = new DAO();

	public static DAO getInstance() {
		return instance;
	}

	public DTO select1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select max(salary) as max, min(salary) as min, sum(salary) as sum, round(avg(salary)) as avg from employee";
		DTO dto = new DTO();

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto.setMax(rs.getInt("max"));
				dto.setMin(rs.getInt("min"));
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getInt("avg"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}

	public List<DTO> select2() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select job, max(salary) as max, min(salary) as min, sum(salary) as sum, round(avg(salary))as avg from employee group by job";

		List<DTO> dtoList = new ArrayList<DTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DTO dto = new DTO();
				dto.setJob(rs.getString("job"));
				dto.setMax(rs.getInt("max"));
				dto.setMin(rs.getInt("min"));
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getInt("avg"));
				dtoList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dtoList;
	}

	public List<DTO> select3() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select job, count(*) count from employee group by job";

		List<DTO> dtoList = new ArrayList<DTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DTO dto = new DTO();
				dto.setJob(rs.getString("job"));
				dto.setCount(rs.getInt("count"));
				dtoList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dtoList;
	}

	public int select4() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select count(manager) count from employee";

		int count = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return count;
	}

	public int select5() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select max(salary)-min(salary) as dif from employee";

		int dif = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dif = rs.getInt("dif");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dif;
	}

	public List<DTO> select6(int sal) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select job, min(salary) as min from employee"
				+ " group by job having not min(salary)<? order by min(salary) desc";
		List<DTO> dtoList = new ArrayList<DTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sal);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DTO dto = new DTO();
				dto.setJob(rs.getString("job"));
				dto.setMin(rs.getInt("min"));
				dtoList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dtoList;
	}

	public List<DTO> select7() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select dno, count(dno) count, round(avg(salary),2) avg from employee group by dno";
		List<DTO> dtoList = new ArrayList<DTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DTO dto = new DTO();
				dto.setDno(rs.getInt("dno"));
				dto.setCount(rs.getInt("count"));
				dto.setAvgd(rs.getDouble("avg"));
				dtoList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dtoList;
	}
	
	public List<DTO> select8(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select department.dname, department.loc, count(department.dname) as count, round(avg(salary)) as avg "
				+"from employee, department where employee.dno = department.dno group by department.dname, department.loc";
		List<DTO> dtoList = new ArrayList<DTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DTO dto = new DTO();
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				dto.setCount(rs.getInt("count"));
				dto.setAvg(rs.getInt("avg"));
				dtoList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dtoList;
	}

}
