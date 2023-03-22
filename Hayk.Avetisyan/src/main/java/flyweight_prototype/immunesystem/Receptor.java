package flyweight_prototype.immunesystem;

/** Flyweight, Decorator */
public class Receptor {

	private final String key;

	public Receptor(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public boolean match(Receptor receptor) {
		return this.key.equals(receptor.key);
	}
}
