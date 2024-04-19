package chapter;

import java.util.Scanner;

import game.Game2;

public class Chap2 {

	public int choo2() {
		
		int result = 0;

		Scanner sc = new Scanner(System.in);
		Game2 game2 = new Game2();
		
	
			
			// if choose 2번선택지...
			// 내 pc를 선택하면 이게 나오게 ㄱㄱ
			System.out.println("내 PC는 전원이 꺼져있다. 콘센트가 있으나 이중 2개는 고장난 것이고 나머지 1개만이 전원이 들어오는 구역이다.");
			System.out.println(" ");
			// 선택지는 총 3개이며 A, B, C 콘센트가 있으며 이중에 정답은 예시로 C 콘센트로 한다. ++ 나중에 수정본에선 random 이용해서
			
			while(true) {
			
			System.out.print("A, B, C 콘센트가 있다. 어디에 꽃을까? >> ");
			String socket = sc.next();
			System.out.println();

			if (socket.equals("B")) {
				System.out.println("'파지직...'");
				// 셋 중 하나 랜덤으로 할 예정
				System.out.println("해당 콘센트에 꽂으니 전원이 들어오며 부팅되자마자 내 PC 화면에 문제가 출력되고 있다.\n");
				if (game2.g2())
					result = 2;
				// 이 사이에 정답 체크 메소드 들어가고 정답 선택지 삭제 후 다시 둘러볼 곳 선택지 c0.choo0() 메소드 실행되게 할 거
				break;

			} else {
				System.out.println(socket+" 콘센트는 아닌 듯 하다. 다시 둘러보자.\n");
			}
			
		}

		return result;

	}

}
