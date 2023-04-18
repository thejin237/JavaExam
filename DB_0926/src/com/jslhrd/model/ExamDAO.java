package com.jslhrd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.util.DBManager;

public class ExamDAO {
	public ExamDAO() {}
	private static ExamDAO instance = new ExamDAO();
	public static ExamDAO getInstance() {
		return instance;
	}
	
	public List<EmptDTO> empSelect(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary, salary*300 pay from employee";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				eDTO.setPay(rs.getInt("pay"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect2(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary, salary*12+100 pay from employee order by pay desc";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				eDTO.setPay(rs.getInt("pay"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect3(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary from employee where salary>? order by salary desc";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 2000);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public EmptDTO empSelect4(int dno){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, dno from employee where eno=?";
		
		EmptDTO eDTO = new EmptDTO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				eDTO.setEname(rs.getString("ename"));
				eDTO.setDno(rs.getInt("dno"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return eDTO;
	}
	
	public List<EmptDTO> empSelect5(int a, int b){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary from employee where salary not between ? and ? ";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a);
			pstmt.setInt(2, b);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect6(String hiredate1, String hiredate2){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename,job, hiredate from employee where hiredate between ? and ? ";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hiredate1);
			pstmt.setString(2, hiredate2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setJob(rs.getString("job"));
				eDTO.setHiredate(rs.getString("hiredate"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect7(int dno1, int dno2){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, dno from employee where dno in(?, ?) order by ename";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 20);
			pstmt.setInt(2, 30);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setDno(rs.getInt("dno"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect8(int sal1, int sal2, int dno1, int dno2){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary, dno from employee where salary between ? and ? and dno in(?, ?) order by ename";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sal1);
			pstmt.setInt(2, sal2);
			pstmt.setInt(3, dno1);
			pstmt.setInt(4, dno2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				eDTO.setDno(rs.getInt("dno"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect9(String hiredate){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, hiredate from employee where hiredate like ?";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hiredate+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setHiredate(rs.getString("hiredate"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect10(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, job from employee where manager is null";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setJob(rs.getString("job"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect11(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary, commission from employee where commission is not null order by salary, commission";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				eDTO.setCommission(rs.getInt("commission"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect12(String ename){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename from employee where ename like ?";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "__"+ename+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect13(String ename1,String ename2){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename from employee where ename like ? and ename like ?";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ename1+"%");
			pstmt.setString(2, "%"+ename2+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect14(String job1, String job2, int sal1, int sal2, int sal3){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, job, salary from employee where job in(? , ?) and salary not in(?,?,?)";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, job1);
			pstmt.setString(2, job2);
			pstmt.setInt(3, sal1);
			pstmt.setInt(4, sal2);
			pstmt.setInt(5, sal3);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setJob(rs.getString("job"));
				eDTO.setSalary(rs.getInt("salary"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
	
	public List<EmptDTO> empSelect15(int comm){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select ename, salary, commission from employee where commission >= ?";
		
		List<EmptDTO> empList = new ArrayList<EmptDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, comm);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmptDTO eDTO = new EmptDTO();
				eDTO.setEname(rs.getString("ename"));
				eDTO.setSalary(rs.getInt("salary"));
				eDTO.setCommission(rs.getInt("commission"));
				empList.add(eDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return empList;
	}
}
