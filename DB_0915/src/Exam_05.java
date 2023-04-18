import java.sql.*;

/* SQL: CRUD(Create(Insert), Read(Select), Update, Delete)
*/
public class Exam_05 {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "hr";
		String myPass = "1234";

		Connection conn = null;
		Statement stmt = null; // To use once, For simple query Sentence
		// PreparedStatement pstmt = null;
		ResultSet rs = null; // Commend Select
		try {
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myURL, myID, myPass);
			String sql = "select * from department";
			stmt = conn.createStatement();
			// int cnt = stmt.executeUpdate(sql);//return int / insert, update, delete
			rs = stmt.executeQuery(sql);
			System.out.println("부서번호\t부서명\t지역명");
			while (rs.next()) {
				System.out.print(rs.getInt("dno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
