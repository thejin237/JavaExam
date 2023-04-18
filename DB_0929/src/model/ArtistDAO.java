package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.DBManager;

public class ArtistDAO {
	private ArtistDAO() {
	}

	private static ArtistDAO instance = new ArtistDAO();

	public static ArtistDAO getInstance() {
		return instance;
	}
	
	public void tableCreate() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "create table tbl_artist_201905("
				+"artist_id char(4) not null primary key, "
				+"artist_name varchar(20), "
				+"artist_gender char(1), "
				+"artist_birth char(8), "
				+"talent char(1), "
				+"agency varchar(20))";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}

	public int artistWrite() {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into tbl_artist_201905(artist_id, artist_name, artist_gender, artist_birth, talent, agency) "
				+ "values(?,?,?,?,?,?)";
		int row = 0;
		System.out.println("오디션 지원자 정보 등록 화면");
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.print("참가번호 :");
			pstmt.setString(1, scn.next());
			System.out.print("이름 :");
			pstmt.setString(2, scn.next());
			System.out.print("성별:");
			pstmt.setString(3, scn.next());
			System.out.print("생년월일 :");
			pstmt.setString(4, scn.next());
			System.out.print("특기 :");
			pstmt.setString(5, scn.next());
			System.out.print("소속사 :");
			pstmt.setString(6, scn.next());
			scn.close();
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		System.out.println("등록이 완료되었습니다");

		return row;
	}
	
	public List<ArtistDTO> artistSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select artist_id, artist_name, artist_gender, artist_birth, talent, agency "
				+ "from tbl_artist_201905";
		List<ArtistDTO> artistList = new ArrayList<ArtistDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				dto.setArtist_birth(rs.getString("artist_birth"));
				dto.setArtist_gender(rs.getString("artist_gender"));
				dto.setTalent(rs.getString("talent"));
				dto.setAgency(rs.getString("agency"));
				artistList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return artistList;
	}
	
	public int pointWrite() {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_point_201905(serial_no, artist_id, mento_id, point) "
				+ "values(?,?,?,?)";
		int row = 0;
		System.out.println("심사위원 채점결과 등록화면");
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.print("채점번호 :");
			pstmt.setInt(1, scn.nextInt());
			System.out.print("참가번호 :");
			pstmt.setString(2, scn.next());
			System.out.print("멘토아이디 :");
			pstmt.setString(3, scn.next());
			System.out.print("점수 :");
			pstmt.setInt(4, scn.nextInt());
			scn.close();
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	public List<PointDTO> pointSelect(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select serial_no, artist_id, mento_id, point from tbl_point_201905";
		
		List<PointDTO> pointList = new ArrayList<PointDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PointDTO dto = new PointDTO();
				dto.setSerial_no(rs.getInt("serial_no"));
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setMento_id(rs.getString("mento_id"));
				dto.setPoint(rs.getInt("point"));
				pointList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return pointList;
	}
	
	public List<ArtistDTO> Select8(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select a.artist_id, a.artist_name, a.artist_gender, sum(point) as sum, round(avg(point),2) as avg\r\n" + 
				"    from tbl_artist_201905 a, tbl_point_201905 p \r\n" + 
				"        where a.artist_id = p.artist_id\r\n" + 
				"            group by a.artist_id, a.artist_name, a.artist_gender\r\n" + 
				"                order by sum desc";
		
		List<ArtistDTO> artistList = new ArrayList<ArtistDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				dto.setArtist_gender(rs.getString("artist_gender"));
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getDouble("avg"));
				artistList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return artistList;
	}
	
	public int pointUpdate() {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update tbl_point_201905 set point = ? where serial_no = ?";
		int row = 0;
		System.out.println("심사위원 채점결과 수정화면");
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.print("채점번호 :");
			int serial_no = scn.nextInt();
			System.out.print("점수 :");
			pstmt.setInt(1, scn.nextInt());
			scn.close();
			pstmt.setInt(2, serial_no);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	public void pointDelete() {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete tbl_point_201905 where serial_no = ?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.println("심사위원 채점결과 삭제화면");
			System.out.print("채점번호 :");
			pstmt.setInt(1, scn.nextInt());
			scn.close();
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void artistDelete() {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete tbl_artist_201905 where artist_id = ?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.println("참가자 정보 삭제화면");
			System.out.print("참가번호 :");
			pstmt.setString(1, scn.next());
			scn.close();
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public int mentoWrite() {
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_mento_201905(mento_id, mento_name) "
				+ "values(?,?)";
		int row = 0;
		System.out.println("심사위원 등록");
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.print("멘토아이디 :");
			pstmt.setString(1, scn.next());
			System.out.print("이름 :");
			pstmt.setString(2, scn.next());
			scn.close();
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	public List<ArtistDTO> joinSelect(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select serial_no, p.artist_id, artist_name, artist_birth, point, m.mento_name \r\n" + 
				"    from tbl_artist_201905 art, tbl_point_201905 p, tbl_mento_201905 m \r\n" + 
				"        where art.artist_id = p.artist_id and p.mento_id=m.mento_id";
		List<ArtistDTO> artistList = new ArrayList<ArtistDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArtistDTO dto;
			while(rs.next()) {
				dto = new ArtistDTO();
				dto.setSerial_no(rs.getInt("serial_no"));
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				dto.setArtist_birth(rs.getString("artist_birth"));
				dto.setPoint(rs.getInt("point"));
				dto.setMento_name(rs.getString("mento_name"));
				artistList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return artistList;
	}
}
