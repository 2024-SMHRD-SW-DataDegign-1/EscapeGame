package start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StartDAO {

	Connection conn = null;
	PreparedStatement psmt = null;

	Scanner sc = new Scanner(System.in);

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

	// [2] 정보 수정
	public int updateUser(String pw, String name, String id) {

		String sql = "UPDATE TB_USER SET USER_PW=?, USER_NM=? WHERE USER_ID=?";

		int row = 0;

		try {
			conn();

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, name);
			psmt.setString(3, id);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return row;
	}

	
	// [3] 회원 탈퇴
	public int deleteUser(String inputId) {

		String sql = "delete from TB_USER where USER_ID = ?";

		int row = 0;

		try {
			conn();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}

		return row;

	}

//	

}
