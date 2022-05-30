package builder.network.activation;

public enum Activation {
	SIGMOID,
	RELU,
	LEAKYRELU,
	TANH;

	public ActivationFunction function() {
		switch (this) {
			case SIGMOID: {
				return new SigmoidFunction();
			}
			case RELU: {
				return new ReluFunction();
			}
			case LEAKYRELU: {
				return new LeakyReluFunction();
			}
			case TANH: {
				return new TanhFunction();
			}
			default: throw new IllegalStateException("Activation function not supported");
		}
	}
}
