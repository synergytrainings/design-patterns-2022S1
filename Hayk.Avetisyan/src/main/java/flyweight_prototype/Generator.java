package flyweight_prototype;

import java.util.Random;

public class Generator {

	private static final Random random = new Random();

	public static int nextInt(int bound) {
		return random.nextInt(bound);
	}

	public static char nextChar() {
		return (char) (random.nextInt(26) + 'a');
	}

	public static String nextKey() {
		return "" + Generator.nextChar() + Generator.nextInt(10);
	}
}
