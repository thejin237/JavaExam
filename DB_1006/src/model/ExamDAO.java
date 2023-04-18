package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExamDAO {
	public ExamDAO() {
	}

	private static ExamDAO instance = new ExamDAO();

	public static ExamDAO getInstance() {
		return instance;
	}

	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "TRACK9";
		String pw = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// createExam1
	public void createExam1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "CREATE TABLE TBL_MEMBER(\r\n" + "    ID VARCHAR2(20),\r\n" + "    NAME VARCHAR2(20) NOT NULL,\r\n"
				+ "    REGNO VARCHAR2(13) UNIQUE NOT NULL,\r\n" + "    HP VARCHAR2(13) UNIQUE,\r\n"
				+ "    ADDRESS VARCHAR2(100),\r\n" + "    PRIMARY KEY(ID)\r\n" + ")";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// createExam end

	// createExam2
	public void createExam2(String tbname, String id, String name, String regno, String hp, String address) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "CREATE TABLE " + tbname + "(\r\n" + "    " + id + " VARCHAR2(20),\r\n" + "    " + name
				+ " VARCHAR2(20) NOT NULL,\r\n" + "    " + regno + " VARCHAR2(13) UNIQUE NOT NULL,\r\n" + "    " + hp
				+ " VARCHAR2(13) UNIQUE,\r\n" + "    " + address + " VARCHAR2(100),\r\n" + "    PRIMARY KEY(" + id
				+ ")\r\n" + ")";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// createExam2 end

	// createExam3
	public void createExam3() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "CREATE TABLE TBL_BOOK(\r\n" + "    CODE NUMBER(4),\r\n" + "    TITLE VARCHAR2(50) NOT NULL,\r\n"
				+ "    COUNT NUMBER(6),\r\n" + "    PRICE NUMBER(10),\r\n" + "    PUBLISH VARCHAR(50),\r\n"
				+ "    PRIMARY KEY(CODE)\r\n" + ")";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// createExam3 end

	// createExam4
	public void createExam4(String tbname, String code, String title, String count, String price, String publish) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "CREATE TABLE " + tbname + "(\r\n" + "    " + code + " NUMBER(4),\r\n" + "    " + title
				+ " VARCHAR2(50) NOT NULL,\r\n" + "    " + count + " NUMBER(6),\r\n" + "    " + price
				+ " NUMBER(10),\r\n" + "    " + publish + " VARCHAR(50),\r\n" + "    PRIMARY KEY(" + code + ")\r\n"
				+ ")";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// createExam4 end

	public void dropExam() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "drop table dept2";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// dropExam end

	// insert student
	public void studentInsert(StudentDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO tbl_student_201905(SYEAR, SCLASS, SNO, SNAME, BIRTH, GENDER, TEL1, TEL2, TEL3)\r\n"
				+ "    VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSyear());
			pstmt.setString(2, dto.getSclass());
			pstmt.setString(3, dto.getSno());
			pstmt.setString(4, dto.getSname());
			pstmt.setString(5, dto.getBirth());
			pstmt.setString(6, dto.getGender());
			pstmt.setString(7, dto.getTel1());
			pstmt.setString(8, dto.getTel2());
			pstmt.setString(9, dto.getTel3());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// insert student end

	// select students
	public List<StudentDTO> select1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT SYEAR, SCLASS, SNO, SNAME, BIRTH, GENDER, TEL1, TEL2, TEL3\r\n"
				+ "    FROM TBL_STUDENT_201905";
		List<StudentDTO> list = new ArrayList<StudentDTO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setSyear(rs.getString("SYEAR"));
				dto.setSclass(rs.getString("SCLASS"));
				dto.setSno(rs.getString("SNO"));
				dto.setSname(rs.getString("SNAME"));
				dto.setBirth(rs.getString("BIRTH"));
				dto.setGender(rs.getString("GENDER"));
				dto.setTel1(rs.getString("TEL1"));
				dto.setTel2(rs.getString("TEL2"));
				dto.setTel3(rs.getString("TEL3"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}// select students end
	
	// insert score
	public void scoreInsert(JoinedDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO TBL_SCORE_201905(SYEAR,SCLASS,SNO,KOR,ENG,MAT)\r\n" + 
				"    VALUES(?,?,?,?,?,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSyear());
			pstmt.setString(2, dto.getSclass());
			pstmt.setString(3, dto.getSno());
			pstmt.setInt(4, dto.getKor());
			pstmt.setInt(5, dto.getEng());
			pstmt.setInt(6, dto.getMat());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// insert score end
	
	// select students
	public List<JoinedDTO> select2() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT STU.SYEAR, STU.SCLASS, STU.SNO, SNAME, KOR,ENG, MAT\r\n" + 
				"    FROM tbl_student_201905 STU, tbl_score_201905 SCO \r\n" + 
				"        WHERE STU.SYEAR = SCO.SYEAR AND STU.SCLASS = SCO.SCLASS AND STU.SNO = SCO.SNO";
		List<JoinedDTO> list = new ArrayList<JoinedDTO>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				JoinedDTO dto = new JoinedDTO();
				dto.setSyear(rs.getString("SYEAR"));
				dto.setSclass(rs.getString("SCLASS"));
				dto.setSno(rs.getString("SNO"));
				dto.setSname(rs.getString("SNAME"));
				dto.setKor(rs.getInt("KOR"));
				dto.setEng(rs.getInt("ENG"));
				dto.setMat(rs.getInt("MAT"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}// select students end
	
	// delete score
	public void scoreDelete(String syear, String sclass, String sno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE TBL_SCORE_201905 WHERE SYEAR=? AND SCLASS=? AND SNO=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, syear);
			pstmt.setString(2, sclass);
			pstmt.setString(3, sno);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}// delete score end
	
	// delete student
	public void studentDelete(String syear, String sclass, String sno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE TBL_STUDENT_201905 WHERE SYEAR=? AND SCLASS=? AND SNO=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, syear);
			pstmt.setString(2, sclass);
			pstmt.setString(3, sno);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}// delete student end
}// ExamDAO end
