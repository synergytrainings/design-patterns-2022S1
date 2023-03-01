package adapter.iot.adapters;

import adapter.electronics.Fridge;
import tools.Predictions;

import java.time.Duration;
import java.time.Instant;

public class FridgeAdapter extends BaseAdapter {

	private Fridge fridge;

	public FridgeAdapter(Fridge fridge) {
		this.fridge = fridge;
	}

	@Override
	public void startAt(Instant startTime, Duration duration) {
		Predictions.checkGraterThan(startTime.toEpochMilli(), Instant.now().toEpochMilli());

		new Thread(() -> {

			Duration startFrom = Duration.ofMillis(startTime.toEpochMilli() - Instant.now().toEpochMilli());
			System.out.println("Fridge will start from " + startFrom.toMillis() + " ms");

			wait(startFrom);
			fridge.turnOn();

			wait(duration);
			fridge.turnOff();

		}).start();
	}
}
