package javaMiniProject;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {

		System.out.print("================= 인트로 =================\r\n"
				+ "강의를 듣다 잠들었다. 눈을 떠보니 주변에는 아무도 없는 것을 알게 되었습니다.\r\n" + "이상한 기분이 들었고, 강의실의 분위기가 어색하게 느껴집니다.");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(" [1] \"느낌이 이상하다, 얼른 나가자!!\" ");
			System.out.print(">> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("급하게 짐을 싸서 나가려고 했지만, 강의실 문은 잠겨 있습니다.\r\n" + "당황한 당신은 문을 열기 위해 주변을 둘러볼려합니다.");
				System.out.print(" [2] \"문 주변을 둘러보자!\" ");
				System.out.print(">> ");
				choice = sc.nextInt();
				if (choice == 2) {
					System.out.print("그 순간, 문 위에 작은 화면이 나타나며 다음과 같은 메시지가 표시됩니다.\r\n" + "\r\n"
							+ "\"비밀번호를 입력하세요. 강의실을 떠나려면 정확한 비밀번호가 필요합니다.\"\r\n" + "\r\n" + "당신은 당혹스러워합니다.\r\n"
							+ "비밀번호를 입력해야만 강의실을 나갈 수 있다는 것이 너무 이상합니다.\r\n" + " \"비밀번호를 입력하라고?\"" + "당신은 어이없어합니다.");
					System.out.print(" [3] \"생각을해보자!\"");
					choice = sc.nextInt();
					if (choice == 3) {
						System.out.print("갑자기 빔 프로젝트 화면이 나타나고, 당신에게 환영의 메시지가 표시됩니다.\r\n" + "\r\n" + "\"환영합니다! \r\n"
								+ "당신은 자바 마스터의 퀴즈 방에 갇히셨습니다.\r\n" + "하지만 걱정하지 마세요.\r\n"
								+ "이곳에는 자바 마스터의 다양한 퍼즐과 단서들이 숨겨져 있습니다.\r\n"
								+ "이를 해결하여 탈출의 열쇠를 찾으세요. 그리고 코딩 마스터의 비밀을 밝혀보세요.\r\n" + "행운을 빕니다.\"\r\n" + "\r\n"
								+ "이 메시지를 보고 당신은 조금 더 긴장되기 시작했습니다.\r\n"
								+ "이제부터는 당신의 자바 프로그래밍 지식과 논리적 사고력이 시험을 받게 될 것입니다.\r\n" + "이 감각적인 모험에 동참해보세요.\r\n"
								+ "지식의 퍼즐을 풀어나가면서 코딩 마스터의 퀴즈방을 탈출하십시오.\r\n");
					}
				}
			}
		}

	}

}
