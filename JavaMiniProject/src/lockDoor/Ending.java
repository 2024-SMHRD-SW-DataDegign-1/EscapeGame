package lockDoor;

import java.util.Scanner;

public class Ending {

	public void Ending() {

		Sleep slp = new Sleep();
		SBG sbg = new SBG();

		for (char c : " 마침내 마지막 퍼즐을 풀고 탈출의 열쇠를 획득한 당신은 강의실 문을 열 수 있게 되었습니다.\r\n 당신은 각각의 퍼즐을 풀며 점차 자신의 자바 프로그래밍 능력을 향상시켰습니다.\r\n 각 문제를 해결할 때마다 자신의 실력을 확인하고 성장함을 느끼고 있습니다.\r\n\r\n 문을 열고 나가는 순간, 자바 마스터가 당신을 칭찬하며 맞이합니다.\r\n \"훌륭한 퍼즐 해결 능력을 보여줬군요! 당신의 논리적 사고와 자바 프로그래밍 지식은 정말 탁월합니다.\r\n 이런 능력으로 미래에 더 큰 성취를 이루실 수 있을 거예요. 축하합니다!\r\n \"이제 집으로 돌아가셔도 좋습니다(씨익)\"\r\n\r\n 당신은 자바 마스터의 미소에서 왠지 모를 찝찝을 느낍니다.\r\n 하지만 상관없습니다!\r\n 당신은 이제 더 넓은 세계로 나아가 자신의 능력을 발휘할 수 있게 되었습니다.\r\n 그리고 강의실을 떠나며 당신은 이 모험을 돌이켜보며 뿌듯함과 만족감을 느낍니다.\r\n"
				.toCharArray()) {
			System.out.print(c);
			slp.sleep();
		}

		PressG("\r\n[G] \"얼른 집으로 가자!!\"\r\n ",
				"당신은 집으로 돌아와서 휴식을 취하고 있을 때, 갑자기 당신은 한가지 사실을 깨닫습니다.\r\n 바로 강의실을 떠날 때 지문을 찍지 않았다는 사실입니다.\r\n\r\n \"어떻게 이런 일이...\"\r\n 당신은 자신의 무심한 행동에 대해 후회하며 어쩔 줄 모르게 됩니다.\r\n 갑자기 자바 마스터의 말이 떠오릅니다.\r\n \"잊지 말아야 할 것이 있어요. 모든 입실에는 퇴실이 따르는 법이죠\"\r\n\r\n");
		sbg.sbg();
	}

	public static void PressG(String str1, String str2) {

		Sleep slp = new Sleep();
		Scanner sc = new Scanner(System.in);

		for (char c : str1.toCharArray()) {
			System.out.print(c);
			slp.sleep();
		}
		while (true) {
			System.out.print(">> ");
			String choice = sc.next();
			if (choice.equals("g")) {
				for (char c : str2.toCharArray()) {
					System.out.print(c);
					slp.sleep();
				}
				break;
			} else {
				for (char c : "\"키를 다시 입력해주세요\"".toCharArray()) {
					System.out.print(c);
					slp.sleep();
				}
			}
		}
	}

}
