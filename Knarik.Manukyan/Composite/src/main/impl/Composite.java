package main.impl;

import main.api.Chemical;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Composite implements Chemical {
	Map<Chemical, Integer> chemicalMap = new HashMap<>();

	String compoundName;

	public Composite(String compoundName) {
		this.compoundName = compoundName;
	}

	public void addChemical(Chemical element, int countToAdd) {
		if (chemicalMap.containsKey(element)) {
			chemicalMap.put(element, chemicalMap.get(element) + countToAdd);
		} else {
			chemicalMap.put(element, countToAdd);
		}
	}

	public void removeChemical(Chemical element, int countToRemove) {
		int result = chemicalMap.get(element) - countToRemove;
		if (result < 0) {
			throw new IllegalArgumentException("Wrong number of chemicals!");
		} else {
			chemicalMap.put(element, result);
		}
	}

	@Override
	public String getName() {
		return compoundName;
	}

	@Override
	public String getChemicalFormula() {
		return "Composition consists of %s" + chemicalMap.entrySet()
				.stream()
				.map(entry -> (entry.getValue() > 1 ? entry.getValue() + " molecules of " : "") + entry.getKey().getChemicalFormula())
				.collect(Collectors.joining(", "));
	}

	@Override
	public double getWeight() {
		return chemicalMap.keySet().stream().mapToDouble(Chemical::getWeight).sum();
	}

}
