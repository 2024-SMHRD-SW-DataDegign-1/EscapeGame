package game;

import java.util.Scanner;

public class AnswerCheck {

	Scanner sc = new Scanner(System.in);
	
	public void g1AnswerC() {
		
		while (true) {
			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();
			
			if (answer == 3) {
				System.out.println("정답");
				// 여기서 자물쇠 번호 1개 받는 메소드 사용하면 될 것 같은데..?
				break;
			} else if (answer != 3) {
				System.out.println("오답");
			}
		}
		
	}

	public void g2Ansewr() {

		while (true) {
			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();

			if (answer == 42) {
				System.out.println("정답");
				// 여기서 자물쇠 번호 1개 받는 메소드 사용하면 될 것 같은데..?
				break;
			} else if (answer != 42) {
				System.out.println("오답");
			}
		}

	}
	


}
