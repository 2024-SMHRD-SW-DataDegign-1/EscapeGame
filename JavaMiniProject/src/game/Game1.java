package game;

import java.util.Scanner;

public class Game1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void g1() {
		System.out.println("컴퓨터 메모장에 증감연산자를 사용한 메모가 보인다.  \n");
		System.out.println("	int Number = 39;\r\n"
				+ "\r\n"
				+ "	Number;		-> 39\r\n"
				+ "	Number++;	-> (  )\r\n"
				+ "	++Number;	-> 41\r\n"
				+ "	Number--;	-> (  )\r\n"
				+ "	Number++;	-> 41\r\n"
				+ "	Number++;	-> (  )\r\n"
				+ "	--Number;	-> (  )\r\n"
				+ "	++Number;	-> 42");
		
		System.out.println();
		System.out.println("빈 칸에 들어갈 숫자를 차례대로 적으시오\n");
		
		System.out.println("'빈 칸에 들어갈 숫자..?'/n");
		
		System.out.print("정답 >> ");
		String answer = sc.next();
		
		if(answer.equals("40 40 42 41")) {
			System.out.println("정답입니다. ");
		}
		
		
		
		
		
		//System.out.println(Number);
		
	}

}
