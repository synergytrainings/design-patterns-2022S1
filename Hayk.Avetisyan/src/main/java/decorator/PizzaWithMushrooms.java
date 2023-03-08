package decorator;

import java.util.ArrayList;
import java.util.List;

public class PizzaWithMushrooms implements Pizza {

	private final Pizza pizza;

	public PizzaWithMushrooms(Pizza pizza) {
		this.pizza = pizza;
	}

	public double price() {
		return pizza.price() + 45;
	}

	public List<String> ingredients() {
		final List<String> ingredients = new ArrayList<>(pizza.ingredients());
		ingredients.add("Mushrooms");
		return ingredients;
	}

}

