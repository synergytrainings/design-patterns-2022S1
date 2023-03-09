package main.Decorators;

import main.Ring;

public class RingWithEngraving extends RingWithDesign {
	String text;

	public RingWithEngraving(Ring ring, String text, double jewelerWorkPrice) {
		super(ring, jewelerWorkPrice);
		this.text = text;
	}

	public String getDescription() {
		return String.format("%s\n %s\n\t%s", super.getOriginalDescription(), "with engraving, which says ", text);
	}

}
