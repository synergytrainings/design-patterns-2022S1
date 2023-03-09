package main.Decorators.stone;

public class Stone {
	StoneType stoneType;
	double weight;
	double price;

	public Stone(StoneType stoneType, double weight, double price) {
		this.stoneType = stoneType;
		this.weight = weight;
		this.price = price;
	}

	public StoneType getStoneType() {
		return stoneType;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}
}

