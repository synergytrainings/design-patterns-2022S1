package builder.network.lossfunction;

public enum LossFunctions {
	MSE,
	XENT;

	public LossFunction function() {
		switch (this) {
			case MSE: {
				return new MseFunction();
			}
			case XENT: {
				return new XentFunction();
			}
			default: throw new IllegalStateException("Loss function not supported");
		}
	}
}
