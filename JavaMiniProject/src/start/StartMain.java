package start;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		Start str = new Start();
		Scanner sc = new Scanner(System.in);
		str.start();

//		StartDAO sdao = new StartDAO();
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("[1]게임 시작  [2]정보 수정  [3]회원 탈퇴  [4]로그아웃 >> ");
//		int input = sc.nextInt();
//
//		while (true) {
//			if (input == 1) {
//				System.out.println("게임 시작!!");
//				break;
//			} else if (input == 2) {
//				// 정보 수정
//				System.out.print("회원 아이디 : ");
//				String inputId = sc.next();
//				System.out.print("비밀번호 변경 : ");
//				String inputPw = sc.next();
//				System.out.print("이름 변경 : ");
//				String inputName = sc.next();
//
//				try {
//
//					int row = sdao.updateUser(inputPw, inputName, inputId);
//
//					if (row > 0) {
//						System.out.println("정보 수정이 완료되었습니다.");
//					} else {
//						System.out.println("정보 수정에 실패하였습니다.");
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//
//				}
//
//			} else if (input == 3) {
//				// 회원 탈퇴
//				System.out.print("삭제할 회원 아이디: ");
//				String inputId = sc.next();
//
//				try {
//					int row = sdao.deleteUser(inputId);
//					if (row > 0) {
//						System.out.println("탈퇴가 완료되었습니다.");
//					} else {
//						System.out.println("탈퇴 실패했습니다.");
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//
//				}
//
//			} else if (input == 4) {
//				
//			}
//			
//			
//			
//			
//		}

	}

}
