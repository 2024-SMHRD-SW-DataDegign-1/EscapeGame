package lockDoor;

public class Sleep {

	public void sleep() {
		try {
			Thread.sleep(1);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
