package adapter.entrypoint;

import adapter.electronics.Fridge;
import adapter.electronics.Microwave;
import adapter.iot.SmartHome;
import adapter.iot.adapters.FridgeAdapter;
import adapter.iot.adapters.MicrowaveAdapter;

import java.time.Duration;
import java.time.Instant;

public class EntryPoint {

	public static final int FRIDGE = 1;
	public static final int MICROWAVE = 2;

	public static void main(String[] args) {
		SmartHome home = new SmartHome();

		Fridge fridge = new Fridge();
		Microwave microwave = new Microwave();

		home.connect(FRIDGE, new FridgeAdapter(fridge));
		home.connect(MICROWAVE, new MicrowaveAdapter(microwave));

		home.schedule(FRIDGE, Instant.now().plusSeconds(20), Duration.ofSeconds(10));
		home.schedule(MICROWAVE, Instant.now().plusSeconds(10), Duration.ofSeconds(40));

	}
}
