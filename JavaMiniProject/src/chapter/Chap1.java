package chapter;

import java.util.Scanner;

import game.Game1;

public class Chap1 {

	public void choo1() {

		Scanner sc = new Scanner(System.in);
		Chap0 c0 = new Chap0();
		Game1 game1 = new Game1();

		while (true) {
			// if choose 1번선택지...
			// 1번 구역으로 접근 시 2가지의 선택지가 다시 출력
			System.out.println("선생님의 컴퓨터로 갔으나 모니터는 비밀번호가 걸어져있다. 힌트도 있으며 내용은 다음과 같았다.\n");
			System.out.println("악마의 숫자를 의미하는 3자리 수를 입력하라. 단 숫자는 전부 동일하다.");
			// 정답 : 666
			
			System.out.println();

			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();

			if (answer == 666) {
				// 정답일 경우 바로 첫번째 문제를 출력시킨다
				System.out.println();
				System.out.println("정답이다. 라고 생각한 순간 컴퓨터가 열렸다.");
				System.out.println(" ");
				game1.g1();
				//System.out.println("1번 문제 출력"); // 그 후 1번 문제 메소드 불러오기 아님 문제 출력하던가
				//System.out.println("문제 다 풀면 그 부분 세이브포인트 변수에 담고... 다시 선택지 둘러보기?\n");
				c0.choo0();
				break;

			} else {
				System.out.println("오답이다. 문제를 다시 풀어봐야겠다...");

			}
		}
	}

}
