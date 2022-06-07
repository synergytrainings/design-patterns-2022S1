package adapter.iot.adapters;

import adapter.iot.SmartThing;

import java.time.Duration;

public abstract class BaseAdapter implements SmartThing {

	protected void wait(Duration duration) {
		try {
			Thread.sleep(duration.toMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
