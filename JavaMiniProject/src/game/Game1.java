package game;

import java.util.Scanner;

public class Game1 {

	Scanner sc = new Scanner(System.in);
	AnswerCheck AnsC = new AnswerCheck();

	public boolean g1() {
		System.out.println("컴퓨터에는 문제가 나와있겠지.. 여긴 나중에 정합세 ");
		System.out.println("일단 정답은 1이라 해봅시다");
		
		int answer = 1;
		
		boolean result = AnsC.AnswerC(answer);
		System.out.println();
		return result;
		
		 
		
		
		


	}

}
