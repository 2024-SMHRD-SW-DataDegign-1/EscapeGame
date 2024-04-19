package lockDoor;

public class Sleep {

	public void sleep() {
		try {
			Thread.sleep(45);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
