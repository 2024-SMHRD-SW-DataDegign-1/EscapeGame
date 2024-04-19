package chapter;

import java.util.Scanner;

import game.Game3;

public class Chap3 {

	public int choo3() {
		Scanner sc = new Scanner(System.in);
		Game3 game3 = new Game3();

		int result = 0;

		// if choose 2번선택지...
		// 내 pc를 선택하면 이게 나오게 ㄱㄱ
		System.out.println("간식통 안을 뒤져보니 연희쌤이 주신 쌀과자, 초코파이와 누군가 버린 듯한 찢어진 종이 조각이 보인다.");
		System.out.println(" ");

		while (true) {
			System.out.println("흐음... 뭘 고르지? ");
			System.out.print("[1] 쌀과자  [2] 초코파이  [3]찢어진 종이 조각 >> ");
			int input = sc.nextInt();
			System.out.println();

			if (input == 1) {
				System.out.println("쌀과자 맛있네...\n");
			} else if (input == 2) {
				System.out.println("초코파이 맛있네...\n");
			} else if (input == 3) {
				System.out.println("찢어진 종이 조각을 모아보니 익숙한 코드가 보인다.");
				if (game3.g3()) {
					result = 3;
				}
				break;
			}

		}
		return result;
	}

}
