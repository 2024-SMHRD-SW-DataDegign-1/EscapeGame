package lockDoor;

public class FastSleep {
	public void fastsleep() {
		try {
			Thread.sleep(10);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
