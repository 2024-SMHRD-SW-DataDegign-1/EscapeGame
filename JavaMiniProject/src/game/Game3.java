package game;

import java.util.Scanner;

public class Game3 {

	Scanner sc = new Scanner(System.in);
	AnswerCheck AnsC = new AnswerCheck();

	public boolean g3() {
		System.out.println("이건 ");
		System.out.println("문제 만들면 문제 적고... 문제가 나와있겠지.. 여긴 나중에 정합세 ");
		System.out.println("일단 정답은 3이라 해봅시다");

		int answer = 0;
		
		boolean result = AnsC.AnswerC(answer);
		System.out.println();
		return result;

	}
}
