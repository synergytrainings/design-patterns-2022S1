package bridge.api;

public interface JuiceFactory {
	Juice produce();
	void switchProductionLine(ProductionLine productionLine);
}
