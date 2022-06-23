package main.impl;

import main.api.Chemical;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Compound implements Chemical {
	Map<Element, Integer> elementMap = new HashMap<>();

	String compoundName;

	public Compound(String compoundName) {
		this.compoundName = compoundName;
	}

	public void addElement(Element element, int countToAdd) {
		if (elementMap.containsKey(element)) {
			elementMap.put(element, elementMap.get(element) + countToAdd);
		} else {
			elementMap.put(element, countToAdd);
		}
	}

	public void removeElement(Element element, int countToRemove) {
		int result = elementMap.get(element) - countToRemove;
		if (result < 0) {
			throw new IllegalArgumentException("Wrong number of elements!");
		} else {
			elementMap.put(element, result);
		}
	}

	@Override
	public String getName() {
		return compoundName;
	}

	@Override
	public String getChemicalFormula() {
		return elementMap.entrySet()
				.stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.map(entry -> entry.getKey().getChemicalFormula() + (entry.getValue() > 1 ? entry.getValue() : ""))
				.collect(Collectors.joining());
	}

	@Override
	public double getWeight() {
		return elementMap.keySet().stream().mapToDouble(Element::getWeight).sum();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Compound compound = (Compound) o;
		return Objects.equals(compoundName, compound.compoundName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(compoundName);
	}
}
