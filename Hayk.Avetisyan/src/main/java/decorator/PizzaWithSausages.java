package decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PizzaWithSausages implements Pizza {

	private final Pizza pizza;

	public PizzaWithSausages(Pizza pizza) {
		this.pizza = pizza;
	}

	public double price() {
		return pizza.price() + 70;
	}

	public List<String> ingredients() {
		final List<String> ingredients = new ArrayList<>(pizza.ingredients());
		ingredients.add("Sausage");
		return ingredients;
	}

}
