package bridge.impl;

import bridge.api.Juice;
import bridge.api.ProductionLine;

public class CocaColaProductionLine implements ProductionLine {

	@Override
	public Juice produce() {
		return new Juice() {
			@Override
			public String toString() {
				return "Coca Cola: with sugar, with cocaine";
			}
		};
	}
}
