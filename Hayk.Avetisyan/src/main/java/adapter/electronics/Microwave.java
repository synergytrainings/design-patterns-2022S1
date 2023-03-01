package adapter.electronics;

import java.time.Duration;

public class Microwave {

	private boolean started;

	public void start(Duration duration) {
		if (started) {
			System.out.println("Already started");
			return;
		}

		new Thread(() -> {
			System.out.println("Microwave turned on. duration: " + duration.toMillis()+ " ms");
			started = true;

			wait(duration);

			started = false;
			System.out.println("Microwave turned off");
		}).start();
	}

	private void wait(Duration duration) {
		try {
			Thread.sleep(duration.toMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
