package chapter;

import game.Game3;

public class Chap3 {

	public void choo3() {
		Game3 game3 = new Game3();
		Chap0 c0 = new Chap0();
		// if choose 3번선택지...
		System.out.println("간식통 안을 뒤져보니 구겨진 쪽지 하나가 나왔다.");
		// 3번선택지를 고르면 조건 없이 바로 세번째 문제가 출력
		System.out.println(" ");
		game3.g3();
		//System.out.println("3번 문제 출력");
		c0.choo0();
	}

}
