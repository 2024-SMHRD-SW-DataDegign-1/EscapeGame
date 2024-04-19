package game;

import java.util.Scanner;

public class Game2 {
	
	Scanner sc = new Scanner(System.in);
	AnswerCheck g2Ans = new AnswerCheck();
	
	public void g2() {
		
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
		
		g2Ans.g2Ansewr();
		System.out.println();
			
			
			
			
		}
		
		
	
	}


