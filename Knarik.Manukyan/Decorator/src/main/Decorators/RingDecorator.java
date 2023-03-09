package main.Decorators;

import main.Ring;

public abstract class RingDecorator implements Ring {
	Ring ring;

	public RingDecorator(Ring ring) {
		this.ring = ring;
	}

	public double getPrice() {
		return ring.getPrice();
	}

	public double getSize() {
		return ring.getSize();
	}

	public double getWeight() {
		return ring.getWeight();
	}

	public String getDescription() {
		return ring.getDescription();
	}
}
