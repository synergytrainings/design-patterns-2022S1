package bridge.impl;

import bridge.api.Juice;
import bridge.api.JuiceFactory;
import bridge.api.ProductionLine;

public class JuiceFactoryImpl implements JuiceFactory {

	private  ProductionLine productionLine;

	public JuiceFactoryImpl(ProductionLine productionLine) {
		this.productionLine = productionLine;
	}

	@Override
	public Juice produce() {
		return productionLine.produce();
	}

	@Override
	public void switchProductionLine(ProductionLine productionLine) {
		this.productionLine = productionLine;
	}
}
