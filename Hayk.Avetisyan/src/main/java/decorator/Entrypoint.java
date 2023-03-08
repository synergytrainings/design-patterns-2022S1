package decorator;

import java.util.*;

/** Run Me */
public class Entrypoint {

	static Map<String, Class<? extends Pizza>> ingredientMap = new HashMap<>();

	static {
		ingredientMap.put("1", PizzaWithCheese.class);
		ingredientMap.put("2", PizzaWithSausages.class);
		ingredientMap.put("3", PizzaWithMushrooms.class);
		ingredientMap.put("4", PizzaWithTomatoes.class);
	}

	public static void main(String[] args) throws Exception {

		String[] order = getOrder();
		validateOrder(order);

		Pizza pizza = new BasicPizza();

		for (String ingredient : order) {
			pizza = ingredientMap.get(ingredient).getConstructor(Pizza.class).newInstance(pizza);
		}

		System.out.println("Your pizza with ingredients " + Arrays.toString(pizza.ingredients().toArray()) + " is ready");
		System.out.println("Price: " + pizza.price());
	}



	private static void validateOrder(String[] order) {

		boolean invalidIngredient =  Arrays.stream(order).map(index -> ingredientMap.get(index)).anyMatch(Objects::isNull);
		if (invalidIngredient) {
			System.out.println("Invalid input!");
			System.exit(0);
		}
	}

	static String[] getOrder() {

		System.out.println("Welcome!");
		System.out.println("Insert ingredients you wish for your pizza, like: 1 3 2 2");
		System.out.println("The following ingredients are available:");
		System.out.println("[1]: Cheese");
		System.out.println("[2]: Sausages");
		System.out.println("[3]: Mushrooms");
		System.out.println("[4]: Tomatoes");

		return new Scanner(System.in).nextLine().split(" +");
	}
}
