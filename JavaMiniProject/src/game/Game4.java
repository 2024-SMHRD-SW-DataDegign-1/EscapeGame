package game;

import java.util.Scanner;

public class Game4 {

	Scanner sc = new Scanner(System.in);
	AnswerCheck g4AnsC = new AnswerCheck();

	public void g4() {
		
		System.out.println();
		System.out.println("결과:   *****\r\n"
				+ "	****\r\n"
				+ "	 ***\r\n"
				+ "	  **\r\n"
				+ "	   *");
		
		System.out.println();
		System.out.println("?? 를 채우시오.");
		

		g4AnsC.g4AnswerC();

	}

}
