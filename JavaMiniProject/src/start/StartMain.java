package start;

import java.util.Scanner;

import javaMiniProject.LockDoor;

public class StartMain {

	public static void main(String[] args) {
		
		Start str = new Start();
		
		LockDoor ld = new LockDoor();
		
		Scanner sc = new Scanner(System.in);
		
		str.start();

		ld.lockDoor();

	}

}
