package flyweight_prototype.immunesystem.cells;

import flyweight_prototype.immunesystem.Antibody;
import flyweight_prototype.immunesystem.Receptor;

/**
 * Context & Prototype
 */
public class TCell extends Lymphocyte {

	public TCell(Receptor receptor) {
		super(receptor);
	}

	public boolean match(Antibody antibody) {
		return active && receptor.match(antibody.getReceptor()) && antibody.cellAttached();
	}

}
