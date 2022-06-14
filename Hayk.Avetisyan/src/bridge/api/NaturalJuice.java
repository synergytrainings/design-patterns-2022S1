package bridge.api;

import java.util.Collection;

public interface NaturalJuice extends JuiceFactory {
	Collection<Fruit> getFruits();
}
