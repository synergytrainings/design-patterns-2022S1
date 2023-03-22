package flyweight_prototype.immunesystem.cells;

import flyweight_prototype.Generator;
import flyweight_prototype.immunesystem.Antibody;
import flyweight_prototype.immunesystem.Receptor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Context & Prototype
 */
public class BCell extends Lymphocyte {

	public BCell(Receptor receptor) {
		super(receptor);
	}

	public boolean match(Receptor receptor) {
		return active && this.receptor.match(receptor);
	}

	public Collection<Antibody> releaseAntibodies() {

		int count = Generator.nextInt(1000);
		Collection<Antibody> antibodies = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			antibodies.add(new Antibody(receptor));
		}

		return antibodies;
	}
}
