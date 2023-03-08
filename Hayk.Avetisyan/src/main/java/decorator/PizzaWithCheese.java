package decorator;

import java.util.ArrayList;
import java.util.List;

public class PizzaWithCheese implements Pizza {

	private final Pizza pizza;

	public PizzaWithCheese(Pizza pizza) {
		this.pizza = pizza;
	}

	public double price() {
		return pizza.price() + 30;
	}

	public List<String> ingredients() {
		final List<String> ingredients = new ArrayList<>(pizza.ingredients());
		ingredients.add("Cheese");
		return ingredients;
	}

}
