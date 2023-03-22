package flyweight_prototype.immunesystem.cells;

import flyweight_prototype.immunesystem.Receptor;

public abstract class Lymphocyte extends Cell {

	protected boolean active = false;
	protected Receptor receptor;

	public Lymphocyte(Receptor receptor) {
		this.receptor = receptor;
	}

	public Receptor getReceptor() {
		return receptor;
	}

	public boolean isActive() {
		return active;
	}

	public void activate(DendriticCell dendriticCell) {
		if (receptor.match(dendriticCell.getReceptor())) {
			this.active = true;
		}
	}

	public void inactivate() {
		this.active = false;
	}

	@Override
	public Object clone() {
		try {
			Lymphocyte clone = (Lymphocyte) super.clone();
			clone.active = this.active;
			clone.receptor = this.receptor;
			return clone;
		} catch (Exception ignore) {
			return null;
		}
	}
}
