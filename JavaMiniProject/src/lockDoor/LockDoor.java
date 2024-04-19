package lockDoor;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import chapter.Chap0;
import javaMiniProject.MainChoice;
import start.Start;

public class LockDoor {
	
	public void lockDoor(String id) {

		Random ran = new Random();
		int reward1 = ran.nextInt(9) + 1;
		int reward2 = ran.nextInt(9) + 1;
		int reward3 = ran.nextInt(9) + 1;
		int reward4 = ran.nextInt(9) + 1;
//		System.out.print(reward1+"+"+ reward2+"+" +reward3+"+"+ reward4);
		RandomReward rr = new RandomReward();
		
		rr.lockDoor2(id,reward1,reward2, reward3, reward4);

	}

}
