package chapter;

import java.util.Scanner;

public class Chap0 {

	public void choo0() {

		Scanner sc = new Scanner(System.in);
		Chap1 c1 = new Chap1();
		Chap2 c2 = new Chap2();
		Chap3 c3 = new Chap3();
		Chap4 c4 = new Chap4();
		Chap5 c5 = new Chap5();

		System.out.println("===== 선택지 둘러보기 =====\n");
		System.out.println("[1]선생님 PC  [2] 내 PC  [3] 간식통  [4] 칠판  [5] 어항 // 이런 거 넣을 거임 \n ");
		System.out.print("어디로 둘러볼까? >> ");
		int choose = sc.nextInt();
		System.out.println();

	}

}
