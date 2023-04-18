
/*	JDBC 구현 절차
 * 1. JDBC 드라이버 로딩
 * 2. 커넥션(Connection) -> 연결
 * 3. 명령수행(SQL): statement
 * 4. 닫기(close)
*/
import java.sql.*; //To Use library for DB Connection

public class Exam_01 {

	public static void main(String[] args) {
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Success DriverLoading");
		} catch (Exception e) {
			System.out.println("Fail DriverLoadeing");
			e.printStackTrace();
		}

		// 2. DB 연결(Connection)
		Connection myConn = null;

		try {
			myConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "1234");
			// Connection myConn = DriverManager.getConnection("DB Path","User
			// ID","Password");
			System.out.println("Success Connection");
		} catch (Exception e) {
			System.out.println("Fail Connection");
			e.printStackTrace();
		}

		// 3. 명령문 처리(Statement, PreparedStatement)
		try {
			Statement stmt = myConn.createStatement();
			int result = stmt.executeUpdate("insert into departments values(300,'jslhrd',100,1700)");
			System.out.println("Success createStatement: " + result);

			// 4. Close
			stmt.close();
			myConn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
