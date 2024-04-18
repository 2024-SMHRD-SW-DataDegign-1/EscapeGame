package javaMiniProject;

import java.util.Scanner;

public class StageChoose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 선택지는 총 5개
		// 각각 선택지는 전부 다른 문제와 분기를 보여준다.

		// 1번 선택지의 경우 2가지의 선택지가 있으며, 둘 중에 하나만이 첫번째 문제 풀이 시작
		// 나머지 선택지를 고를 경우 다시 둘러볼 곳 선택지로 되돌아가기
		// 2번 선택지의 경우 3가지의 선택지가 있으며, 셋 중 하나만이 두번째 문제 풀이 시작
		// 나머지 선택지를 고를 경우 다시 둘러볼 곳 선택지로 되돌아가기
		// 3번 선택지의 경우 분기 없이 바로 세번째 문제 풀이 시작
		// 4번 선택지의 경우 2가지의 선택지가 있으나, 둘 중 하나는 게임오버 출력 이후 처음부터 다시 시작
		// 나머지 하나는 진짜 문제이며 네번째 문제 풀이 시작
		// 5번 선택지의 경우 다시 둘러볼 곳 선택지로 되돌아가기

		// 각 번호 장소의 문제는 출제 조건이 다르며, 만약 문제 풀이에 성공했을 경우, 힌트/단서 또는 도구 등을 지급, 그리고 해당 번호
		// 선택지(메소드)는 리스트에 제거하기
		// 만약 이미 푼 문제의 장소를 갈 경우, 이미 문제 풀이에 성공했다는 문구 출력 후 되돌아가기

		// 문제 풀이를 실패했거나 오답인 경우, 재도전 선택지를 주거나 포기하고 다시 되돌아가는 선택지 출력

		System.out.println("===== 선택지 둘러보기 =====");
		System.out.println(" ");
		// 1~5번을 선택해서 각각 선택지로 이동한다. 만약 그이외의 번호일 경우 잘못된 접근입니다 출력

		System.out.print("어디로 둘러볼까? >> ");
		int choose = sc.nextInt();

		if (choose == 1) {
			// if choose 1번선택지...
			// 1번 구역으로 접근 시 2가지의 선택지가 다시 출력
			System.out.println("해당 근처의 컴퓨터로 갔으나 모니터는 비밀번호가 걸어져있다. 힌트도 있으며 내용은 다음과 같았다.");
			System.out.println(" ");
			System.out.println("악마의 숫자를 의미하는 3자리 수를 입력하라. 단 숫자는 전부 동일하다.");
			// 정답 : 666

			System.out.print("정답 입력 >> ");
			int answer1 = sc.nextInt();

			if (answer1 == 666) {
				// 정답일 경우 바로 첫번째 문제를 출력시킨다
				System.out.println("정답이다. 라고 생각한 순간 말이 끝나기 무섭게 첫번째 문제가 출력되고 있다.");
				System.out.println(" ");
				System.out.println("1번 문제 출력");

				// 오답일 경우 재도전 및 포기 선택지 출력, 이외 번호 입력 시 잘못된 입력 문구 출력
			} else {
				System.out.println("오답이다. 재도전 : 1\t 포기한다 : 2");
				int choose2 = sc.nextInt();

				if (choose2 == 1) {

				}
			}
		}

		if (choose == 2) {
			// if choose 2번선택지...
			System.out.println("이 근처에 있는 PC는 전원이 꺼져있다. 콘센트가 있으나 이중 2개는 고장난 것이고 나머지 1개만이 전원이 들어오는 구역이다.");
			System.out.println(" ");
			// 선택지는 총 3개이며 1, 2, 3번 콘센트가 있으며 이중에 정답은 예시로 2번 콘센트로 한다. ++ 나중에 수정본에선 random
			// 이용해서 셋 중 하나 랜덤으로 선택
			System.out.print("1, 2, 3번 콘센트가 있다. 어디에 꽃을까? >> ");

			int socket = sc.nextInt();

			if (socket == 2) {
				System.out.println("'파지직...'");
				// 셋 중 하나 랜덤으로 할 예정
				System.out.println("해당 콘센트에 꽂으니 전원이 들어오며 부팅되자마자 화면에 문제가 출력되고 있다.");
				System.out.println(" ");
				// 정답을 고른 경우 두번째 문제 출력
				System.out.println("2번 문제 출력");

			} else {
				System.out.println("이 콘센트가 아닌 듯 하다. 다시 꽃아보자.");
			}

		}

		if (choose == 3) {
			// if choose 3번선택지...
			System.out.println("해당 근처의 컴퓨터로 접근하니, 갑자기 모니터에 빛이 들어오며 문제가 출제되고 있었다.");
			// 3번선택지를 고르면 조건 없이 바로 세번째 문제가 출력
			System.out.println(" ");
			System.out.println("3번 문제 출력");
		}

		if (choose == 4) {
			// if choose 4번선택지...
			// 임시용 게임오버 표현 (변경 예정)
			System.out.print("해당 모니터로 갔으나 간식 바구니 위에 정체불명의 초코바가 있다. 어떻게 할까?");
			System.out.println(" ");
			System.out.print("1. 먹는다\t2. 먹지 않는다 >> ");

			int select = sc.nextInt();
			// 1 = 먹는다
			// 2 = 먹지 않는다

			// 만약 손댄 경우, 게임오버로 이어지며 손대지 않을 경우 출력문 하나 출력 후 모니터에서 네번째 문제 출력

			if (select == 1) {
				System.out.println("초코바를 먹자 마자 질식으로 쓰러졌다.");
				System.out.print("===== GAME OVER =====");
				// 게임 오버 문구 출력 후 바로 메인 메뉴로 이동
			}
			if (select == 2) {
				System.out.println("'현명한 선택이다. 아무거나 주워 먹으면 큰일난다.'");
				System.out.println("말이 끝나기 무섭게 갑자기 모니터에서 이상한 목소리와 함께 문제가 출력되고 있었다.");
				System.out.println(" ");
				System.out.println("4번 문제 출력");
			}
		}

		if (choose == 5) {
			// if choose 5번선택지...

			System.out.println("여기에는 딱히 탈출을 할 수 있을 만한 단서같은게 없는 듯 하다.");
			// 해당 대사 출력 후 다시 둘러볼 곳으로 돌아가기
		}

	}

}
