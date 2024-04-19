package game;

import java.util.Scanner;

public class AnswerCheck{

	Scanner sc = new Scanner(System.in);


	public boolean AnswerC(int CAnswer) {
		
		boolean result = false;
		
		while (true) {
			System.out.println();
			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();

			if (answer==CAnswer) {
				System.out.println();
				System.out.println(answer+ "는 정답이 맞습니다.");
				System.out.println("하고 여기에 자물쇠 번호 받는 메소드 넣어야지..");
				result = true;
				break;
			} else if (answer != CAnswer) {
				System.out.println();
				System.out.println(answer+ "는 정답이 아닙니다.");
			}
		}
		
		return result;

	}


}
