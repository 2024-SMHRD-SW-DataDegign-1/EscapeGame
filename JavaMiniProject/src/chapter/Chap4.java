package chapter;

import java.util.Scanner;

import game.Game4;
import start.Start;

public class Chap4 {

	public int choo4() {
		Scanner sc = new Scanner(System.in);
		Start str = new Start();
		Game4 game4 = new Game4();
		int result = 0;
		while (true) {

			// if choose 4번선택지...
			// 임시용 게임오버 표현 (변경 예정) 이걸 칠판으르 해서 지운다? 지우지 않는다 -> 지우지 않으면 게임 오버
			System.out.println("칠판으로 가니 for문과 별이 그려져 있다.\n");
//			//이건 칠판하자

			System.out.println("for(int i = 0; i < 5; i++) {\r\n" + "	for(int j = 0; j < i ; j++) {\r\n"
					+ "		System.out.print(\" \");	 -->	*****\r\n" + "	}					*****\r\n"
					+ "	for(int j = 5; j > i; j'??') {		*****\r\n"
					+ "		System.out.print(\"*\");		*****\r\n" + "	}					*****\r\n"
					+ "	System.out.println();\r\n" + "}");

			System.out.println();
			System.out.println("		?? 를 채우시오.\n\n");
			System.out.println("'흐음...이게 무슨 소리지?...\n ");
			System.out.println("칠판을 지워볼까?\n");

			System.out.print("[1] 칠판 구경하기 \t[2] 지우기 >> ");

			int select = sc.nextInt();

			if (select == 1) {
				System.out.println();
				System.out.println("칠판을 지우지 않고 한참을 바라보다 탈출하지 못하고 사망했다.");
				System.out.print("===== GAME OVER =====\n");
				str.start(); // 다시 시작 하는 부분 근데 여기 start 보면 주석 처리 되어있넹

				break;
				// 게임 오버 문구 출력 후 바로 메인 메뉴로 이동

			} else if (select == 2) {
				System.out.println();
				System.out.println("지우개로 칠판을 지우니 지워지지 않는 별이 있다.\n");
				if (game4.g4()) {
					result = 4;
				}
				// System.out.println("4번 문제 출력");
				// 정식쓰가 말한... 게임 끝나면 다시 시작 메뉴로 가게 했슈
				break;
			}
		}
		return result;
	}

}
