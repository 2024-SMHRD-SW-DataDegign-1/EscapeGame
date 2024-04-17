package start;

import java.util.Scanner;

import javaMiniProject.Account;

public class Start {

	public void start() {
		StartDAO sdao = new StartDAO();
		Account acc = new Account();
		Start str = new Start();
		GameDAO gdao = new GameDAO();	// 본게임이랑 연결 부분

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("[1]게임 시작  [2]정보 수정  [3]회원 탈퇴  [4]로그아웃 >> ");
		int input = sc.nextInt();

		while (true) {
			if (input == 1) {
				System.out.println();
				System.out.println("게임 시작 부분 입니다~~"+ "\n");
				gdao.record();	//게임 기록 물어보는 메소드
				break;
			} else if (input == 2) {
				// 정보 수정
				System.out.print("회원 아이디 : ");
				String inputId = sc.next();
				System.out.print("비밀번호 변경 : ");
				String inputPw = sc.next();
				System.out.print("이름 변경 : ");
				String inputName = sc.next();

				try {

					int row = sdao.updateUser(inputPw, inputName, inputId);

					if (row > 0) {
						System.out.println("정보 수정이 완료되었습니다.\n");
						System.out.println("현재 이름		: " + inputName);
						System.out.println("현재 아이디	: " + inputId);
						System.out.println("현재 비밀번호	: " + inputPw);
						str.start();

					} else {
						System.out.println("없는 ID 입니다.\n");
					}
				} catch (Exception e) {
					e.printStackTrace();

				}

			} else if (input == 3) {
				// 회원 탈퇴
				System.out.print("삭제할 회원 아이디: ");
				String inputId = sc.next();

				try {
					int row = sdao.deleteUser(inputId);
					if (row > 0) {
						System.out.println("탈퇴가 완료되었습니다.\n");
						acc.account();
					} else {
						System.out.println("없는 ID 입니다.\n");
					}
				} catch (Exception e) {
					e.printStackTrace();

				}

			} else if (input == 4) {
				System.out.println();
				System.out.println("로그아웃이 되었습니다!\n");
				acc.account();
				//str.start();
				break;	//break 안 넣으면 게임 시작 누르면 원래 멈춰야하는데 썅 안 멈추고 로그아웃 부분이 출력됨

			}

		}
	}

}
