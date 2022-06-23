package main.impl;

import main.api.Chemical;

import java.util.Objects;

public class Element implements Chemical {

	String symbol;
	String name;
	int atomicNumber;
	double atomicWeight;

	public Element(String name, String symbol, int atomicNumber, double atomicWeight) {
		this.name = name;
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getChemicalFormula() {
		return symbol;
	}

	@Override
	public double getWeight() {
		return atomicWeight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Element element = (Element) o;
		return atomicNumber == element.atomicNumber &&
				Double.compare(element.atomicWeight, atomicWeight) == 0 &&
				Objects.equals(symbol, element.symbol) &&
				Objects.equals(name, element.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(symbol, name, atomicNumber, atomicWeight);
	}
}
