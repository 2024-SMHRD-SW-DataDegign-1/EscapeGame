package game;

import java.util.Scanner;


import lock.LockPW;
import lock.Test;

public class AnswerCheck{

	Scanner sc = new Scanner(System.in);
	//LockPW Lp = new LockPW();
	//Test tt = new Test();
	
	// 리턴값은 맞춘 문제 번호 못 맞추면 0 리턴,,,, 매개변수로는 두 개( 문제 번호랑 정답)

	public void g1AnswerC() {

		while (true) {
			System.out.println();
			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();

			if (answer == 1) {
				System.out.println();
				System.out.println(answer+ "는 정답이 맞습니다.");
				System.out.println("하고 여기에 자물쇠 번호 받는 메소드 넣어야지..");
				break;
			} else if (answer != 1) {
				System.out.println();
				System.out.println(answer+ "는 정답이 아닙니다.");
			}
		}

	}

	public void g2Ansewr() {

		while (true) {
			System.out.println();
			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();

			if (answer == 42) {
				System.out.println();
				System.out.println(answer+ "는 정답이 맞습니다.");
				System.out.println("하고 여기에 자물쇠 번호 받는 메소드 넣어야지..");
				//System.out.println(reward1);
				//Lp.Lpw2();
				break;
			} else if (answer != 42) {
				System.out.println();
				System.out.println(answer+ "는 정답이 아닙니다.");
			}
		}

	}

	public void g3AnswerC() {

		while (true) {
			System.out.println();
			System.out.print("정답 입력 >> ");
			int answer = sc.nextInt();

			if (answer == 3) {
				System.out.println();
				System.out.println(answer+ "는 정답이 맞습니다.");
				System.out.println("하고 여기에 자물쇠 번호 받는 메소드 넣어야지..");
				//Lp.Lpw3();
				break;
			} else if (answer != 3) {
				System.out.println();
				System.out.println(answer+ "는 정답이 아닙니다.");
			}
		}

	}
	
	
	public void g4AnswerC() {

		while (true) {
			System.out.println();
			System.out.print("정답 입력 >> ");
			String answer = sc.next();

			if (answer.equals("--")) {
				System.out.println();
				System.out.println(answer+ "는 정답이 맞습니다.");
				System.out.println("하고 여기에 자물쇠 번호 받는 메소드 넣어야지..");
				//Lp.Lpw4();
				//Lp.LpAll();
				//tt.test();
				// 여기서 자물쇠 번호 1개 받는 메소드 사용하면 될 것 같은데..?
				break;
			} else if (!answer.equals("--")) {
				System.out.println();
				System.out.println(answer+ "는 정답이 아닙니다.");
			}
		}

	}

}
