import java.sql.*;

/* SQL: CRUD(Create(Insert), Read(Select), Update, Delete)
*/
public class Exam_04 {
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
			String sql = "delete from department where dno='70'";
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);// return int / insert, update, delete
			// rs = stmt.executeQuery(sql);
			if (cnt == 1) {
				System.out.println("complete delete");
			} else {
				System.out.println("fail delete");
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
