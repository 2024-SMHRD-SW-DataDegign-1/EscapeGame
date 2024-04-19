package lockDoor;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javaMiniProject.MainChoice;
import start.Start;

public class RandomReward {
	
	public void lockDoor2 (String id, int reward1, int reward2, int reward3, int reward4) {
		
		Ending end = new Ending();
		Start str = new Start();
		Sleep slp = new Sleep();
		MainChoice mc = new MainChoice();

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println();
				System.out.println("[1] 수상한 곳을 찾아본다.");
				System.out.println("[2] 잠긴 문을 열어본다.");
				System.out.println("[3] 자신의 운명을 받아들인다.");
				System.out.print("나의 선택은? >> ");
				int choice = sc.nextInt();
				if (choice == 1) {
					mc.searchClue(id, reward1, reward2, reward3, reward4);

				}

				else if (choice == 2) {
					System.out.println("===== 문이 잠겨있다 =====");

					while (true) {
						System.out.print("[1] 비밀번호 입력하기 ");
						System.out.println("[2] 돌아가기");
						System.out.print(">> ");
						choice = sc.nextInt();

						int[] arr = new int[4];
						if (choice == 1) { // 비밀번호 입력하기
							for (int i = 1; i < 5; i++) {
								System.out.print(i + "번째 비밀번호를 입력하시오 → ");
								arr[i - 1] = sc.nextInt();
							}
							if (reward1 == arr[0] && reward2 == arr[1] && reward3 == arr[2] && reward4 == arr[3]) {
								System.out.println();
								end.Ending();
								str.start();
							} else {
								System.out.println(" 문이 안열린다 ");
							}
						} else if (choice == 2) { // 돌아가기
							break;
						}
					}
				} else {
					// 게임포기
					if (choice == 3) {
						System.out.print("===== 게임 종료 =====\r\n");
						str.start();
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
