package flyweight_prototype.desease;

import flyweight_prototype.immunesystem.Receptor;

public class Virus implements Cloneable {

	private Receptor receptor;

	public Virus(Receptor receptor) {
		this.receptor = receptor;
	}

	public Receptor getReceptor() {
		return receptor;
	}

	@Override
	public Object clone() {
		try {
			Virus clone = (Virus) super.clone();
			clone.receptor = receptor;
			return clone;
		} catch (Exception ignore) {
			return null;
		}
	}
}
