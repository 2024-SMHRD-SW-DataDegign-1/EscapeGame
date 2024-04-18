package chapter;

import java.util.Scanner;

public class Chap2 {

	public void choo2() {

		Scanner sc = new Scanner(System.in);
		Chap0 c0 = new Chap0();
		
		while(true) {
			
			// if choose 2번선택지...
			System.out.println();
			System.out.println("이 근처에 있는 PC는 전원이 꺼져있다. 콘센트가 있으나 이중 2개는 고장난 것이고 나머지 1개만이 전원이 들어오는 구역이다.");
			System.out.println(" ");
			// 선택지는 총 3개이며 A, B, C 콘센트가 있으며 이중에 정답은 예시로 C 콘센트로 한다. ++ 나중에 수정본에선 random 이용해서
			
			System.out.print("A, B, C 콘센트가 있다. 어디에 꽃을까? >> ");
			String socket = sc.next();
			System.out.println();

			if (socket.equals("B")) {
				System.out.println("'파지직...'");
				// 셋 중 하나 랜덤으로 할 예정
				System.out.println("해당 콘센트에 꽂으니 전원이 들어오며 부팅되자마자 화면에 문제가 출력되고 있다.\n");
				// 정답을 고른 경우 두번째 문제 출력
				System.out.println("2번 문제 출력\n"); // 문제 여기다 적든 메소드 하등
				c0.choo0();
				break;

			} else {
				System.out.println(socket+" 콘센트는 아닌 듯 하다. 다시 둘러보자.");
			}
			
		}

		

	}

}
