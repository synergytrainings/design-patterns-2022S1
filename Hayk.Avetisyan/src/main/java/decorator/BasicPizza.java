package decorator;

import java.util.Collections;
import java.util.List;

public class BasicPizza implements Pizza {

	public double price() {
		return 100;
	}

	public List<String> ingredients() {
		return Collections.emptyList();
	}

}
