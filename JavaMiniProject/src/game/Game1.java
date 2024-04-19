package game;

import java.util.Scanner;

public class Game1 {

	Scanner sc = new Scanner(System.in);
	AnswerCheck g1AnsC = new AnswerCheck();

	public void g1() {

//		int[][] array = new int[3][3];
//
//		int num = 19;
//
//		for (int j = 0; j <= 2; j++) {
//			if (j % 2 == 0) {
//				for (int i = 0; i < 3; i++) {
//					array[j][i] = num+=2;
//				}
//			} else {
//				for (int i = 2; i >= 0; i--) {
//					array[j][i] = num+=2;
//				}
//
//			}
//
//		}
//
//		for (int j = 0; j < array.length; j++) {
//			for (int i = 0; i < array[j].length; i++) {
//				System.out.print(array[j][i] + "\t");
//			}
//			System.out.println();
//		}
		
		System.out.println("		int[][] array = new int[3][3];\r\n"
				+ "\r\n"
				+ "		int num = 19;\r\n"
				+ "\r\n"
				+ "		for (int j = 0; j <= 2; j++) {\r\n"
				+ "			if (j % 2 == 0) {\r\n"
				+ "				for (int i = 0; i < 3; i++) {\r\n"
				+ "					array[j][i] = num+=2;\r\n"
				+ "				}\r\n"
				+ "			} else {\r\n"
				+ "				for (int i = 2; i >= 0; i--) {\r\n"
				+ "					array[j][i] = num+=2;\r\n"
				+ "				}\r\n"
				+ "\r\n"
				+ "			}\r\n"
				+ "\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		for (int j = 0; j < array.length; j++) {\r\n"
				+ "			for (int i = 0; i < array[j].length; i++) {\r\n"
				+ "				System.out.print(array[j][i] + \"\\t\");\r\n"
				+ "			}\r\n"
				+ "			System.out.println();\r\n"
				+ "		}");
		System.out.println();
		System.out.println("이 코드는 이차원 배열 코드입니다.");
		System.out.println("해당 코드에 대한 출력값 중 정답을 선택하시오.\n");

		System.out.println("	[1]			[2]			[3]			[4]			[5]	\r\n"
				+ "19	20	21   |   19	20	21   |   21	23	25   |   21	23	25   |   21	27	33\r\n"
				+ "22	23	24   |   24	23	22   |   27	29	31   |   31	29	27   |   23	29	35\r\n"
				+ "25	26	27   |   25	26	27   |   33	35	37   |   33	35	37   |   25	31	37");

		int answer = 4;
		System.out.println();

	}

}
