package builder.network.layers;

import builder.network.Predictions;
import builder.network.activation.ActivationFunction;
import builder.network.lossfunction.LossFunction;
import builder.network.lossfunction.LossFunctions;

public class OutputLayer extends BaseLayer {

	private LossFunction lossFunction;

	public OutputLayer(ActivationFunction activation, LossFunction lossFunction, double bias, int nIn, int nOut) {
		super(activation, bias, nIn, nOut);
		this.lossFunction = lossFunction;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder extends BaseLayer.Builder<Builder> {

		private LossFunction lossFunction;

		private Builder() {}

		public Builder lossFunction(LossFunctions lossFunction) {
			this.lossFunction = lossFunction.function();
			return self();
		}

		@Override
		public OutputLayer build() {
			Predictions.checkNotNull(this.activation);
			Predictions.checkNotNull(this.lossFunction);
			Predictions.checkIsPositive(this.nIn);
			Predictions.checkIsPositive(this.nOut);

			return new OutputLayer(activation, lossFunction, bias, nIn, nOut);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	@Override
	public String toString() {
		return "OutputLayer{" +
				"lossFunction=" + lossFunction +
				", activation=" + activation +
				", bias=" + bias +
				", nIn=" + nIn +
				", nOut=" + nOut +
				'}';
	}
}
