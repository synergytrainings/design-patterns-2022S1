package builder.network.layers;

import tools.Predictions;
import builder.network.activation.Activation;
import builder.network.activation.ActivationFunction;

public class LSTMLayer extends BaseLayer {

	private ActivationFunction gateActivation;

	public LSTMLayer(ActivationFunction activation, ActivationFunction gateActivation, double bias, int nIn, int nOut) {
		super(activation, bias, nIn, nOut);
		this.gateActivation = gateActivation;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder extends BaseLayer.Builder<Builder> {

		private ActivationFunction gateActivation;

		private Builder() {
		}

		public Builder gateActivation(Activation gateActivation) {
			this.gateActivation = gateActivation.function();
			return self();
		}

		@Override
		public LSTMLayer build() {
			Predictions.checkIsPositive(this.nOut);
			Predictions.checkIsPositive(this.nIn);
			Predictions.checkNotNull(this.activation);
			Predictions.checkNotNull(this.gateActivation);

			return new LSTMLayer(activation, gateActivation, bias, nIn, nOut);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	@Override
	public String toString() {
		return "LSTMLayer{" +
				"gateActivation=" + gateActivation +
				", activation=" + activation +
				", bias=" + bias +
				", nIn=" + nIn +
				", nOut=" + nOut +
				'}';
	}
}
