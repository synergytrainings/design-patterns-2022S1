package bridge.entrypoint;

import bridge.api.Juice;
import bridge.api.JuiceFactory;
import bridge.api.ProductionLine;
import bridge.impl.CocaColaProductionLine;
import bridge.impl.FantaProductionLine;
import bridge.impl.JuiceFactoryImpl;
import bridge.impl.NaturalJuiceProductionLine;

public class EntryPoint {
	public static void main(String[] args) {

		Juice juice;
		ProductionLine[] productionLines = {
				new CocaColaProductionLine(),
				new FantaProductionLine(),
				new NaturalJuiceProductionLine()
		};

		JuiceFactory factory = new JuiceFactoryImpl(productionLines[0]);
		juice = factory.produce();
		System.out.println(juice);

		factory.switchProductionLine(productionLines[1]);
		juice = factory.produce();
		System.out.println(juice);

		factory.switchProductionLine(productionLines[2]);
		juice = factory.produce();
		System.out.println(juice);
	}
}
