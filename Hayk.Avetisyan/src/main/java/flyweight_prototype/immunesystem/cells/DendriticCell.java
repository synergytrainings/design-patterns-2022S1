package flyweight_prototype.immunesystem.cells;

import flyweight_prototype.immunesystem.Receptor;
import flyweight_prototype.desease.InfectedCell;

public class DendriticCell extends Cell {

	private Receptor receptor;

	public boolean hasReceptor() {
		return this.receptor != null;
	}

	public Receptor getReceptor() {
		return receptor;
	}

	public void activate(Lymphocyte lymphocyte) {
		lymphocyte.activate(this);
	}

	public void takeSample(InfectedCell cell) {
		cell.getVirusReceptor(this).ifPresent(receptor -> this.receptor = receptor);
	}
}
