package lockDoor;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FastSleep fslp = new FastSleep();
		LockDoor ld = new LockDoor();
		Ending end = new Ending();

		for (char c : "[1] 수상한 곳을 찾아본다.\r\n[2] 잠긴 문을 열어본다.\r\n[3] 자신의 운명을 받아들인다.".toCharArray()) {
			System.out.print(c);
			fslp.fastsleep();
		}
		
		

	}

}
