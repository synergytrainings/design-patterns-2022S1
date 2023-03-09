package main.Decorators;

import main.Decorators.stone.Stone;
import main.Ring;

public class RingWithStone extends RingWithDesign {
	Stone stone;

	public RingWithStone(Ring ring, Stone stone, double jewelerWorkPrice) {
		super(ring, jewelerWorkPrice);
		this.stone = stone;
	}

	public double getPrice() {
		return super.getPrice() + stone.getPrice();
	}

	public double getWeight() {
		return super.getWeight() + stone.getWeight();
	}

	public String getDescription() {
		return String.format("%s\n %s %s", super.getOriginalDescription(), "with stone ", stone.getStoneType());
	}
}
