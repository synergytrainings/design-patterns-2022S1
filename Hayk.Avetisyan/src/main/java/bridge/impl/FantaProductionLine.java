package bridge.impl;

import bridge.api.Juice;
import bridge.api.ProductionLine;

public class FantaProductionLine implements ProductionLine {
	@Override
	public Juice produce() {
		return new Juice() {
			@Override
			public String toString() {
				return "Fanta: with sugar, no cocaine";
			}
		};
	}
}
