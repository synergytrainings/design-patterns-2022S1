package adapter.iot;

import java.time.Duration;
import java.time.Instant;

public interface SmartThing {
	void startAt(Instant startTime, Duration duration);
}
