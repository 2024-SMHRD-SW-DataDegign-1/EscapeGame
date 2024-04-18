package game;

import java.util.Scanner;

public class Game2 {
	
	Scanner sc = new Scanner(System.in);
	AnswerCheck g2Ans = new AnswerCheck();
	
	public void g2() {
//		//이건 칠판하자
//		
//		System.out.println("for(int i = 0; i < 5; i++) {\r\n"
//				+ "	for(int j = 0; j < i ; j++) {\r\n"
//				+ "		System.out.print(\" \");	\r\n"
//				+ "	}\r\n"
//				+ "	for(int j = 5; j > i; j'??') {\r\n"
//				+ "		System.out.print(\"*\");\r\n"
//				+ "	}\r\n"
//				+ "	System.out.println();\r\n"
//				+ "}");
//		
//		System.out.println();
//		System.out.println("결과:   *****\r\n"
//				+ "	****\r\n"
//				+ "	 ***\r\n"
//				+ "	  **\r\n"
//				+ "	   *");
//		
//		System.out.println();
//		System.out.println("?? 를 채우시오.");
		
		System.out.println("컴퓨터 메모장에 증감연산자를 사용한 메모가 보인다.  \n");
		
		System.out.println("		int Number = 39;\r\n"
				+ "		\r\n"
				+ "		Number++;\r\n"
				+ "		++Number;\r\n"
				+ "		Number--;\r\n"
				+ "		Number++;\r\n"
				+ "		Number++;\r\n"
				+ "		--Number;\r\n"
				+ "		++Number;	\r\n"
				+ "		\r\n");
		
		System.out.println("		Number = ?");
		System.out.println();
		
		System.out.println("'Number를 맞추라는 건가...'");
		System.out.println();
		
		g2Ans.g2Ansewr();
			
			
			
			
		}
		
		
	
	}


