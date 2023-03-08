package decorator;

import java.util.ArrayList;
import java.util.List;

public class PizzaWithTomatoes implements Pizza {

	private final Pizza pizza;

	public PizzaWithTomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	public double price() {
		return pizza.price() + 60;
	}

	public List<String> ingredients() {
		final List<String> ingredients = new ArrayList<>(pizza.ingredients());
		ingredients.add("Tomatoes");
		return ingredients;
	}

}

