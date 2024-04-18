package javaMiniProject;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import chapter.Chap0;

public class LockDoor {

	public void lockDoor() {
		
		Random ran = new Random();
		int reward1 = ran.nextInt(9)+1;
		int reward2 = ran.nextInt(9)+1;
		int reward3 = ran.nextInt(9)+1;
		int reward4 = ran.nextInt(9)+1;

		Scanner sc = new Scanner(System.in);
		Chap0 c0 = new Chap0();

		while (true) {
			try {
				System.out.print(" [1] 수상곳이 보인다. 둘러보자! ");
				System.out.print(" [2] 잠긴문이 보인다. 가보자! ");
				System.out.print(">> ");
				int choice = sc.nextInt();
				System.out.println();
				if (choice == 1) {
					c0.choo0();
				} else if (choice == 2) {
					System.out.println("===== 문이 잠겨있다 =====");
					
					while (true) {
						System.out.print("[1] 비밀번호 입력하기 ");
						System.out.println("[2] 돌아가기");
						System.out.print(">> ");
						choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("↓ 비밀번호를 입력하시오 ↓");
							int pw = sc.nextInt();
							if (pw == 0000) {
								System.out.println(" ♬ ~ 띠링 ~ ♬ ");
								System.out.println(" 문이 열렸다!! ");
								break;
							} else {
								System.out.println(" 문이 안열린다 ");
							}

						} else if (choice == 2) {
							break;
						} else {

						}
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("비정상적인 접근입니다.");
				sc.nextLine();
				continue;
			}

		}

	}

}
