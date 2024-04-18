package javaMiniProject;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import chapter.Chap0;
import start.RecordDAO;
import start.Start;

public class LockDoor {

	public void lockDoor(String id) {
		

		Random ran = new Random();
		int reward1 = ran.nextInt(9) + 1;
		int reward2 = ran.nextInt(9) + 1;
		int reward3 = ran.nextInt(9) + 1;
		int reward4 = ran.nextInt(9) + 1;
//		System.out.println(reward1);
//		System.out.println(reward2);
//		System.out.println(reward3);
//		System.out.println(reward4);
		
		Start str = new Start();

		SBG sb = new SBG();
		MainChoice mc = new MainChoice();
		Scanner sc = new Scanner(System.in);
		Chap0 c0 = new Chap0();

		while (true) {
			try {
				System.out.println("[1] 수상한 곳을 찾아본다.");
				System.out.println("[2] 잠긴 문을 열어본다.");
				System.out.print("나의 선택은? >> ");
				int choice = sc.nextInt();
				System.out.println();
				if (choice == 1) {
					
					mc.searchClue(id);
				} else if (choice == 2) {
					System.out.println("===== 문이 잠겨있다 =====");

					while (true) {
						System.out.print("[1] 비밀번호 입력하기 ");
						System.out.println("[2] 돌아가기");
						System.out.print(">> ");
						choice = sc.nextInt();

						int[] arr = new int[4];
						if (choice == 1) {
							for (int i = 1; i < 5; i++) {
								System.out.print(i + "번째 비밀번호를 입력하시오 → ");
								arr[i - 1] = sc.nextInt();
							}
							if (reward1 == arr[0] && reward2 == arr[1] && reward3 == arr[2] && reward4 == arr[3]) {
								System.out.println(" 드디어 탈출이다 ! ! !");
								for(int j = 0; j < 5; j++) {
								System.out.println(".");
								} System.out.println();
								System.out.println("아.. 맞다.. 지문..!");
								sb.sbg();
								str.start();
							}
						} else {
							System.out.println(" 문이 안열린다 ");
						}
					}
				} else if (choice == 2) {
					break;
				} else {

				}

			} catch (InputMismatchException e) {
				System.out.println("비정상적인 접근입니다.");
				sc.nextLine();
				continue;
			}

		}

	}

}
