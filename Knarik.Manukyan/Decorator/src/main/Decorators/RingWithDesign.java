package main.Decorators;

import main.Ring;

public class RingWithDesign extends RingDecorator {
	double jewelerWorkPrice;

	public RingWithDesign(Ring ring, double jewelerWorkPrice) {
		super(ring);
		this.jewelerWorkPrice = jewelerWorkPrice;
	}

	public double getPrice() {
		return super.getPrice() + jewelerWorkPrice;
	}

	public String getDescription() {
		return String.format("%s\n %s", super.getDescription(), "with design");
	}

	protected String getOriginalDescription() {
		return super.getDescription();
	}
}
