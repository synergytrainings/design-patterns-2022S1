package adapter.iot.adapters;

import adapter.electronics.Microwave;

import java.time.Duration;
import java.time.Instant;

public class MicrowaveAdapter extends BaseAdapter {

	private Microwave microwave;

	public MicrowaveAdapter(Microwave microwave) {
		this.microwave = microwave;
	}

	@Override
	public void startAt(Instant startTime, Duration duration) {
		new Thread(() -> {

			Duration startFrom = Duration.ofMillis(startTime.toEpochMilli() - Instant.now().toEpochMilli());
			System.out.println("Microwave will start from " + startFrom.toMillis() + " ms");

			wait(startFrom);
			microwave.start(duration);

		}).start();
	}
}
