package start;

import lockDoor.LockDoor;

public class StartMain {

	public void gameStart(String string) {

		Start str = new Start();
		LockDoor ld = new LockDoor();

		str.start();

		ld.lockDoor(string);

	}

}
