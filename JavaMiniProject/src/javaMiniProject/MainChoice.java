package javaMiniProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import chapter.Chap1;
import chapter.Chap2;
import chapter.Chap3;
import chapter.Chap4;
import chapter.Chap5;

public class MainChoice {

	public void searchClue(String id) {

		Scanner sc = new Scanner(System.in);

		// 로그인 유저 아이디 저장

		DAO dao = new DAO();
		PreparedStatement psmt = null;
		ArrayList<String> al = new ArrayList<String>();
		String cp = "";
		String tempstr = "";

		while (true) {

			dao.conn();

			ResultSet rs = null;
			String sql = "SELECT USER_SP FROM TB_SAVEP WHERE USER_ID = ?";

			try {

				psmt = dao.conn.prepareStatement(sql);

				psmt.setString(1, id);
				rs = psmt.executeQuery();
				if (rs.next()) {
					if (rs.getString(1) != (null)) {
						System.out.println("여기");
						tempstr = rs.getString(1);
						String[] splitValues = tempstr.split(",");
						for (String value : splitValues) {
							al.add(value);
						}
					} else if (rs.getString(1) == (null)) {
						al.add("칠판");
						al.add("간식통");
						al.add("내PC");
						al.add("선생님PC");
						al.add("뜬금없이놓여있는어항");
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dao.dbClose();
			}
			
			Chap1 ch1 = new Chap1();
			Chap2 ch2 = new Chap2();
			Chap3 ch3 = new Chap3();
			Chap4 ch4 = new Chap4();
			Chap5 ch5 = new Chap5();
			
			while (true) {

				// 선택지
				System.out.println("수상한 곳들이 있다..");
				System.out.println("어디를 확인해볼까?");

				for (int i = 0; i < al.size(); i++) {
					System.out.println("[" + (i + 1) + "]" + " " + al.get(i));
				}
				System.out.print(">> ");
				
				int choice = sc.nextInt();
				
				int correctNum = 0;
				
				switch (choice) {
				
				case 1 :
					correctNum = ch1.choo1();
					break;
					
				case 2 :
					correctNum = ch2.choo2();
					break;
					
				case 3 :
					correctNum = ch3.choo3();
					break;
					
				case 4 :
					correctNum = ch4.choo4();
					break;
					
				case 5 :
					ch5.choo5();
					break;
				}
				
				
				
				// 정답 선택지 삭제
				if (correctNum!=0) {
				al.remove(correctNum - 1);
				}
				
				// 선택지 백업
				cp = "";
				for (int i = 0; i < al.size(); i++) {
					cp += al.get(i) + ",";
				}

				try {
					sql = "UPDATE TB_SAVEP SET USER_SP = ? WHERE USER_ID=?";
					dao.conn();

					psmt = dao.conn.prepareStatement(sql);

					psmt.setString(1, cp);
					psmt.setString(2, id);

					psmt.executeUpdate();

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					dao.dbClose();
				}
			}
		}
	}
}
