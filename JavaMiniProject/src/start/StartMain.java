package start;

import lockDoor.Intro;
import lockDoor.LockDoor;

public class StartMain {

	public void gameStart(String string) {

		Start str = new Start();
		LockDoor ld = new LockDoor();
		Intro open = new Intro();
		
		str.start();
		
		open.Intro();

		ld.lockDoor(string);

	}

}
