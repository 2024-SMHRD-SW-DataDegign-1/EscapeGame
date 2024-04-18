package javaMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	
	// 연결
		public void conn() {
			System.out.println(" ");
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");

				String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
				String user = "campus_24SW_DD_p1_4";
				String password = "smhrd4";

				conn = DriverManager.getConnection(url, user, password);

				// 테스트용. 배포 시 삭제
//				if (conn != null) {
//					System.out.println("DB 연결에 성공하였습니다!! \\(=▽=)/");
//					System.out.println(" ");
//				} else {
//					System.out.println("DB 연결에 실패하였습니다.. (=▽=)...");
//					System.out.println(" ");
//				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// 닫기
		public void dbClose() {
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
