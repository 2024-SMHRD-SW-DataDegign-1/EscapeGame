package start;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import chapter.Chap0;
import javaMiniProject.Account;
import javaMiniProject.DAO;

public class Start {

	public void start() {
		DAO dao = new DAO();

		PreparedStatement psmt = null;

		StartDAO sdao = new StartDAO();
		Account acc = new Account();
		Start str = new Start();
		int rec = 0;
		RecordDAO rdao = new RecordDAO(); // 본게임이랑 연결 부분
		Chap0 c0 = new Chap0(); // 이거 잠깐 연결해보려고 하는 거임
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		String Checkpw = null;

		System.out.println();
		System.out.print("[1]게임 시작  [2]정보 수정  [3]회원 탈퇴  [4]로그아웃 >> ");
		int input = sc.nextInt();

		while (true) {
			if (input == 1) {
				System.out.println();

				break;
			} else if (input == 2) {
				// 정보 수정
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String Pw = sc.next();

				try {

					dao.conn();

					String sql = "SELECT USER_PW FROM TB_USER WHERE USER_ID=?";
					psmt = dao.conn.prepareStatement(sql);

					psmt.setString(1, id);

					rs = psmt.executeQuery();

					if (rs.next()) {
						Checkpw = rs.getString(2);

						if (Pw.equals(Checkpw)) {

							System.out.print("비밀번호 변경 : ");
							String inputPw = sc.next();
							System.out.print("이름 변경 : ");
							String inputName = sc.next();

							try {

								int row = sdao.updateUser(inputPw, inputName, id);

								if (row > 0) {
									System.out.println("정보 수정이 완료되었습니다.\n");
									System.out.println("현재 이름		: " + inputName);
									System.out.println("현재 비밀번호	: " + inputPw);
									str.start();

								} else {
									System.out.println("수정 실패..");
								}
							} catch (Exception e) {
								e.printStackTrace();

							}

						}
					} else {
						id = "";
						System.out.println("아이디 혹은 비밀번호가 다릅니다.");
						System.out.println("");

					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					dao.dbClose();
				}

			} else if (input == 3) {
				// 회원 탈퇴

				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String Pw = sc.next();

				try {

					dao.conn();

					String sql = "SELECT USER_PW FROM TB_USER WHERE USER_ID=?";
					psmt = dao.conn.prepareStatement(sql);

					psmt.setString(1, id);

					rs = psmt.executeQuery();

					if (rs.next()) {
						Checkpw = rs.getString(1);

						if (Pw.equals(Checkpw)) {

							System.out.print("비밀번호 변경 : ");
							String inputPw = sc.next();
							System.out.print("이름 변경 : ");
							String inputName = sc.next();

							try {

								int row = sdao.updateUser(inputPw, inputName, id);

								if (row > 0) {
									System.out.println("정보 수정이 완료되었습니다.\n");
									System.out.println("현재 이름		: " + inputName);
									System.out.println("현재 비밀번호	: " + inputPw);
									str.start();

								} else {
									System.out.println("수정 실패..");
								}
							} catch (Exception e) {
								e.printStackTrace();

							}

						}
					} else {
						id = "";
						System.out.println("아이디 혹은 비밀번호가 다릅니다.");
						System.out.println("");

					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					dao.dbClose();
				}

				try {

					int row = sdao.deleteUser(id);
					if (row > 0) {
						System.out.println("탈퇴가 완료되었습니다.\n");
						str.start();
					} else {
						System.out.println("탈퇴 실패..");
					}
					acc.account();
				} catch (Exception e) {
					e.printStackTrace();

				}

			} else if (input == 4) {
				System.out.println();
				System.out.println("로그아웃이 되었습니다!\n");
				acc.account();
				// str.start();
				break;

			}

		}

	}

}
