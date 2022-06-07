package adapter.iot;

import tools.Predictions;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class SmartHome {
	Map<Integer, SmartThing> things = new HashMap<>();

	public void connect(Integer id, SmartThing thing) {
		this.things.put(id, thing);
	}

	public void schedule(Integer id, Instant startTime, Duration duration) {
		Predictions.checkGraterThan(startTime.toEpochMilli(), Instant.now().toEpochMilli());
		things.get(id).startAt(startTime, duration);
	}
}
