package main;

import main.impl.Composite;
import main.impl.Compound;
import main.impl.Element;

public class Main {
	public static void main(String[] args) {
		Element carbon = new Element("Carbon", "C", 6, 12.011);
		Element hydrogen = new Element("Hydrogen", "H", 1, 1.008);
		Element oxygen = new Element("Oxygen", "O", 8, 15.999);

		Compound glucose = new Compound("Glucose");
		glucose.addElement(carbon, 6);
		glucose.addElement(hydrogen, 12);
		glucose.addElement(oxygen, 6);

		System.out.println(glucose.getChemicalFormula());

		Compound water = new Compound("Water");
		water.addElement(hydrogen, 2);
		water.addElement(oxygen, 1);

		System.out.println(water.getChemicalFormula());

		Composite composite = new Composite("Glucose and water solution");
		composite.addChemical(glucose, 2);
		composite.addChemical(water, 10);

		System.out.println(composite.getChemicalFormula());
	}
}
