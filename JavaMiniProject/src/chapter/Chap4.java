package chapter;

import java.util.Scanner;

import start.Start;

public class Chap4 {

	public void choo4() {

		while (true) {

			Scanner sc = new Scanner(System.in);
			Chap0 c0 = new Chap0();
			Start str = new Start();

			// if choose 4번선택지...
			// 임시용 게임오버 표현 (변경 예정)
			System.out.println("해당 모니터로 갔으나 책상 위에 정체불명의 초코바가 있다. 어떻게 할까?\n");
			System.out.print("1. 먹는다\t2. 먹지 않는다 >> ");

			int select = sc.nextInt();
			// 1 = 먹는다
			// 2 = 먹지 않는다

			// 만약 손댄 경우, 게임오버로 이어지며 손대지 않을 경우 출력문 하나 출력 후 모니터에서 네번째 문제 출력

			if (select == 1) {
				System.out.println();
				System.out.println("초코바를 먹자 마자 질식으로 쓰러졌다.");
				System.out.print("===== GAME OVER =====\n");
				str.start();	// 다시 시작 하는 부분임!!
				
				break;
				// 게임 오버 문구 출력 후 바로 메인 메뉴로 이동
			} else if (select == 2) {
				System.out.println();
				System.out.println("현명한 선택이다. 아무거나 주워 먹으면 큰일난다.\n");
				System.out.println("말이 끝나기 무섭게 갑자기 모니터에서 이상한 목소리와 함께 문제가 출력되고 있었다.\n");
				System.out.println("4번 문제 출력");
				c0.choo0();	// 정식쓰가 말한... 게임 끝나면 다시 시작 메뉴로 가게 했슈
				break;
			}
		}

	}

}
