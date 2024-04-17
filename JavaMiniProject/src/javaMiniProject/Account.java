package javaMiniProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

	public void account() {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		GameTools gt = new GameTools();

		while (true) {
			System.out.println("이 게임이 처음이시라면? >> [1]회원가입하기");
			System.out.println("이미 회원가입이 되어있으시다면? >> [2]로그인하기");
			System.out.println("혹은 >> [3]종료하기");
			try {
				System.out.print(">> ");
				int choice = sc.nextInt();
				if (choice == 1) {
					dao.conn();
					dao.signIn();
					dao.dbClose();
					System.out.println(" ");
					continue;
				} else if (choice == 2) {
					dao.conn();
					dao.logIn();
					dao.dbClose();
					break;
				}  else if (choice == 3) {
					gt.endGame();
					System.out.println(" ");
					break;
				} else if (choice == 777) {
					System.out.println(" ");
					System.out.println("관리자 페이지");
					System.out.println("[1]회원 정보 조회 [2]회원 정보 삭제 [3]종료");
					while (true) {
						System.out.print(">> ");
						int adminChoice = sc.nextInt();
						if (adminChoice == 1) {
							dao.conn();
							dao.searchMembers();
							dao.dbClose();
						} else if (adminChoice == 2) {
							dao.conn();
							dao.deleteUser();
							dao.dbClose();
						} else {
							break;
						}

					}
					System.out.println(" ");
					continue;
				} else {
					System.out.println("비정상적인 접근입니다.");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("비정상적인 접근입니다.");
				sc.nextLine();
				continue;
			}
		}
		sc.close();
	}

}
