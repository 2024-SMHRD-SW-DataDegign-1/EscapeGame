package javaMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import start.Start;

public class AccountDAO {

	Scanner sc = new Scanner(System.in);
	DAO dao = new DAO();
	
	Connection conn = null;
	PreparedStatement psmt = null;

	// 로그인
	public boolean logIn() {
<<<<<<< HEAD
		dao.conn();
=======
		
		conn();
		
>>>>>>> branch 'master' of https://github.com/2024-SMHRD-SW-DataDegign-1/EscapeGame
		String Checkpw = null;
		String name = null;
		ResultSet rs = null;
		boolean result = false;

		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();

		try {
<<<<<<< HEAD
			String sql = "SELECT 비밀번호, 이름 FROM 회원가입 WHERE 아이디=?";
			psmt = dao.conn.prepareStatement(sql);
=======
			String sql = "SELECT USER_PW, USER_NM FROM TB_USER WHERE USER_ID=?";
			psmt = conn.prepareStatement(sql);
>>>>>>> branch 'master' of https://github.com/2024-SMHRD-SW-DataDegign-1/EscapeGame
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			Start str = new Start();

			if (rs.next()) {
				Checkpw = rs.getString(1);
				name = rs.getString(2);
			}

			if (pw.equals(Checkpw)) {
				result = true;
				System.out.println();
				System.out.println("로그인에 성공했습니다.");
				System.out.println(name + "님 환영합니다! \\(=▽=)/");
				str.start();
				
			} else {
				result = false;
				System.out.println("아이디 혹은 비밀번호가 다릅니다.");
				System.out.println("");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dao.dbClose();
		}
		return result;
	}

	
	// 회원 가입
	public void signIn() {
<<<<<<< HEAD
		dao.conn();
=======
>>>>>>> branch 'master' of https://github.com/2024-SMHRD-SW-DataDegign-1/EscapeGame
		
		conn();

		String id = null;

		while (true) {

			ResultSet rs = null;
			String sql = "SELECT * FROM TB_USER WHERE USER_ID=?";

			try {
				System.out.print("아이디 : ");
				id = sc.next();

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);

				rs = psmt.executeQuery();

				if (rs.next() == true) {
					System.out.println("이미 가입된 아이디입니다.");
					System.out.println(" ");
					continue;
				} else {
					break;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();

		String sql = "INSERT INTO TB_USER VALUES(?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println( );
				System.out.println(name+"님의 회원가입이 성공적으로 되었습니다! \\(=▽=)/");
			} else {
				System.out.println("회원가입에 실패하였습니다... (=▽=)...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.dbClose();
		}

	}

	// 회원 정보 수정
	public void updateUser() {
<<<<<<< HEAD
		dao.conn();
		
		String sql = "UPDATE 회원가입 SET 비밀번호=?, 이름=? WHERE 아이디=?";
=======
		conn();
>>>>>>> branch 'master' of https://github.com/2024-SMHRD-SW-DataDegign-1/EscapeGame

		String sql = "UPDATE TB_USER SET USER_NM=?,USER_ID=?, USER_PW=? WHERE USER_ID=?";

		System.out.print("현재 아이디 입력 : " );
		String inputId = sc.next();
		System.out.println();
		System.out.print("변경할 아이디 : ");
		String id = sc.next();
		System.out.print("변경할 비밀번호 : ");
		String pw = sc.next();
		System.out.print("변경할 이름 : ");
		String name = sc.next();

		int row = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			psmt.setString(4, inputId);

			row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("관리자의 권한으로 " + name+"님의 회원 정보 수정이 성공적으로 되었습니다! \\(=▽=)/");
			} else {
				System.out.println("회원 정보 수정에 실패하였습니다... (=▽=)...");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dao.dbClose();
		}

	}

	// 회원 정보 삭제
	public void deleteUser() {
<<<<<<< HEAD
		dao.conn();
		
=======
		conn();

>>>>>>> branch 'master' of https://github.com/2024-SMHRD-SW-DataDegign-1/EscapeGame
		System.out.print("삭제할 ID 입력 : ");
		String id = sc.next();

		String sql = "DELETE FROM TB_USER WHERE USER_ID=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원 정보 삭제가 성공적으로 되었습니다! \\(=▽=)/");
			} else {
				System.out.println("회원 정보 삭제에 실패하였습니다... (=▽=)...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.dbClose();
		}

	}

	// 회원 정보 조회
	public void searchMembers() {
<<<<<<< HEAD
		dao.conn();
		
=======
		conn();

>>>>>>> branch 'master' of https://github.com/2024-SMHRD-SW-DataDegign-1/EscapeGame
		ResultSet rs = null;
		String sql = "SELECT * FROM TB_USER";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println("이름\t" + "아이디\t" + "비밀번호");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.dbClose();
		}

	}

}
