package main;

public class SimpleRing implements Ring {
	double price;
	double size;
	double weight;

	public SimpleRing(double price, double size, double weight) {
		this.price = price;
		this.size = size;
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public double getSize() {
		return size;
	}

	public double getWeight() {
		return weight;
	}

	public String getDescription() {
		return "A ring";
	}
}
