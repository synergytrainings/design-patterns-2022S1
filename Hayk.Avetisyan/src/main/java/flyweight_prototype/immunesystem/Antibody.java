package flyweight_prototype.immunesystem;

import flyweight_prototype.desease.InfectedCell;


/** Context */
public class Antibody {

	private final Receptor receptor;
	private InfectedCell cell = null;

	public Antibody(Receptor receptor) {
		this.receptor = receptor;
	}

	public Receptor getReceptor() {
		return receptor;
	}

	public void attachCell(InfectedCell cell) {
		this.cell = cell;
	}

	public boolean cellAttached() {
		return this.cell != null;
	}

	public InfectedCell getCell() {
		return this.cell;
	}
}
