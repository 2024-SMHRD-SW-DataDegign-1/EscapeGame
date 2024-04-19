package game;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Game3 {

	Scanner sc = new Scanner(System.in);
	AnswerCheck g3AnsC = new AnswerCheck();
	Random rm = new Random();
	AnswerCheck AnsC = new AnswerCheck();

		
	public boolean g3() {

	System.out.println("이건 경남쌤과 배웠던 로또 번호 추첨 코드...?\n");
//		int[] lotto = new int[5];
//		System.out.println("====로또타임====");
//		System.out.println("이번주 출력 번호는요...!!두구두구두구!!");
//
//		for (int i = 0; i < 5; i++) {
//			lotto[i] = rm.nextInt(10) + 1;
//
//			for (int j = 0; j < i; j++) {
//				if (lotto[j] == lotto[i]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
		
		System.out.println("		________________________________________________\r\n"
				+ "		| int[] lotto = new int[5];			|\r\n"
				+ "		| System.out.println(\"====로또타임====\");		|\r\n"
				+ "		| System.out.println(\"이번주 출력 번호는요...!!\");	|\r\n"
				+ "		|						|\r\n"
				+ "		| for (int i = 0; i < 5; i++) {			|\r\n"
				+ "		|	lotto[i] = rm.nextInt(10) + 1;		|\r\n"
				+ "		|						|\r\n"
				+ "		|	for (int j = 0; j < i; j++) {		|\r\n"
				+ "		|		if (lotto[j] == lotto[i]) {	|\r\n"
				+ "		|			i--;			|\r\n"
				+ "		| 			break;			|\r\n"
				+ "		| 		}				|\r\n"
				+ "		| 	}		    ____________________|\r\n"
				+ "		| }		     ______|	\r\n"
				+ "		|		    |\r\n"
				+ "		| System.out.println|\r\n"
				+ "		|___________________|");
		
		System.out.println();
		System.out.println("찢어진 종이 조각에 들어갈 코드를 맞춰야 하는 건가...? \n");
		System.out.println("      [1]		  [2]			 [3]		    	   [4]			[5]\r\n"
				+ "(Arrays.(lotto));   (String(lotto));   (Arrays.toString(lotto));   (Arrays.toString());   (ToString(lotto));");

		int answer = 3;
		
		boolean result = AnsC.AnswerC(answer);
		System.out.println();
		return result;

	}
}
