package javaMiniProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;

import chapter.Chap;
import chapter.Chap1;
import chapter.Chap2;
import chapter.Chap3;
import chapter.Chap4;
import chapter.Chap5;
import game.TheFinalProblem;

public class MainChoice {

	private HashMap<String, Class<?>> placeClassMap;

	public MainChoice() {
		// HashMap 초기화 및 장소와 클래스 매핑
		placeClassMap = new HashMap<>();
		placeClassMap.put("칠판", Chap1.class);
		placeClassMap.put("간식통", Chap2.class);
		placeClassMap.put("내PC", Chap3.class);
		placeClassMap.put("선생님PC", Chap4.class);
		placeClassMap.put("뜬금없이놓여있는어항", Chap5.class);
	}

	public void searchClue(String id, int reward1, int reward2, int reward3, int reward4) {

		Scanner sc = new Scanner(System.in);

		// 로그인 유저 아이디 저장

		DAO dao = new DAO();
		PreparedStatement psmt = null;
		ArrayList<String> al = new ArrayList<String>();
		String cp = "";
		String tempstr = "";
		int result = 0;

		while (true) {
			
			al.clear();
			
			dao.conn();

			ResultSet rs = null;
			String sql = "SELECT USER_SP FROM TB_SAVEP WHERE USER_ID = ?";

			try {

				psmt = dao.conn.prepareStatement(sql);

				psmt.setString(1, id);
				rs = psmt.executeQuery();
				if (rs.next()) {
					if (rs.getString(1) != (null)) {
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

			while (true) {
				// 선택지
				System.out.println("수상한 곳들이 있다..");
				System.out.println("어디를 확인해볼까?\r\n");

				for (int i = 0; i < al.size(); i++) {
					System.out.println("[" + (i + 1) + "]" + " " + al.get(i));
				}
				System.out.print(">> ");

				int choice = sc.nextInt();

				String selectedPlace = al.get(choice - 1);
				Class<?> selectedClass = placeClassMap.get(selectedPlace);

				try {
					// 해당 클래스의 인스턴스 생성
					Chap chapInstance = (Chap) selectedClass.newInstance();

					// 선택한 장소의 기능 실행
					result = chapInstance.performAction();

					break;

					// 결과에 따른 처리 등...
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}

			int correctNum = result;
			
			
			TheFinalProblem fp = new TheFinalProblem();
			
			fp.finalP(correctNum, reward1, reward2, reward3, reward4);
			
			
			
			

			// 정답 선택지 삭제
			if (correctNum != 0) {
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
