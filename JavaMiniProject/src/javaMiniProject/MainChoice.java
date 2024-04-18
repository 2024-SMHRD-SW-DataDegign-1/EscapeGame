package javaMiniProject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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

		
		
		
		
		
		
		
		ArrayList<String> al = new ArrayList<String>();

		al.add("칠판");
		al.add("간식통");
		al.add("내PC");
		al.add("선생님PC");
		al.add("뜬금없이 놓여있는 어항");

		
		
		
		
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
