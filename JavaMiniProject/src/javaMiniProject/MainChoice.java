package javaMiniProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class MainChoice {

	public void searchClue() {

		// 로그인 유저 아이디 저장
		String id = "wnstj412";

		
		
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		PreparedStatement psmt = null;
		String cp = null;

		
		
		
		
		System.out.print("[1]처음부터 [2]이어하기");
		int input = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
		
		if(input == 1) {
		al.add("칠판");
		al.add("간식통");
		al.add("내PC");
		al.add("선생님PC");
		al.add("뜬금없이 놓여있는 어항");
		} else if (input == 2) {
			
			dao.conn();
			String tempstr = null;
			
			ResultSet rs = null;
			String sql = "SELECT USER_SP FROM TB_SAVEP WHERE USER_ID = ?";
			
			try {
				
				psmt = dao.conn.prepareStatement(sql);
				
				psmt.setString(1, id);
				rs = psmt.executeQuery();

				if (rs.next()) {
				tempstr = rs.getString(1);
				}
				
				for (int i = 0; i<al.size(); i++) {
				tempstr.split(",");
				al.add(tempstr);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dao.dbClose();
			}
			
			
		}
		
		
		
		
		while (true) {

			// 선택지 백업
			
			for(int i = 0; i<al.size(); i++) {
				cp += al.get(i) + ",";
			}
			
			
			String sql = "UPDATE TB_SAVEP SET USER_SP = ? WHERE USER_ID=?";
			try {
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
			
			
			
			

			// 선택지
			System.out.println("수상한 곳들이 있다..");
			System.out.println("어디를 확인해볼까?");

			for (int i = 0; i < al.size(); i++) {
				System.out.println("[" + (i + 1) + "]" + " " + al.get(i));
			}

			
			
			
//			
//			
//			
//			
//			
//			                              게임 메인 구역
//			
//			
//			
//			
//			
			
			
			
			
			
			// 정답 선택지 입력
			int correct = 1;
			

			// 정답 선택지 삭제
			al.remove(correct-1);
		}

	}

}
