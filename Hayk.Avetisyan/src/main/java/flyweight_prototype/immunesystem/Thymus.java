package flyweight_prototype.immunesystem;

import flyweight_prototype.Generator;
import flyweight_prototype.immunesystem.cells.BCell;
import flyweight_prototype.immunesystem.cells.TCell;

import java.util.*;

/**
 * Flyweight factory
 */
public class Thymus {

	private final Map<String, Receptor> receptorRegistry = new HashMap<>();

	public TCell createTCell() {
		String randomKey = Generator.nextKey();
		Receptor receptor = receptorRegistry.computeIfAbsent(randomKey, Receptor::new);
		return new TCell(receptor);
	}

	public BCell createBCell() {
		String randomKey = Generator.nextKey();
		Receptor receptor = receptorRegistry.computeIfAbsent(randomKey, Receptor::new);
		return new BCell(receptor);
	}
}
