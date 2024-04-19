package game;

import java.util.Scanner;

public class Game2 {
	
	Scanner sc = new Scanner(System.in);
	AnswerCheck AnsC = new AnswerCheck();
	
	public boolean g2() {
		
		System.out.println("컴퓨터 메모장에 증감연산자를 사용한 메모가 보인다.  \n");
		
//		int Number = 39;
//		Number = Number++;
//		Number = ++Number;
//		Number = Number--;
//		Number = Number++;
//		Number = Number++;
//		Number = --Number;
//		Number = ++Number;
//		System.out.println(Number);

		System.out.println("		int Number = 39;\r\n"
				+ "		\r\n"
				+ "		Number = Number++;\r\n"
				+ "		Number = ++Number;\r\n"
				+ "		Number = Number--;\r\n"
				+ "		Number = Number++;\r\n"
				+ "		Number = Number++;\r\n"
				+ "		Number = --Number;\r\n"
				+ "		Number = ++Number;	\r\n"
				+ "		\r\n");
		
		System.out.println("		Number = ?");
		System.out.println();
		
		System.out.println("'Number를 맞추라는 건가...'");
		
		int answer = 40;
		
		boolean result = AnsC.AnswerC(answer);
		System.out.println();
		return result;
			
			
		}
		
		
	
	}


