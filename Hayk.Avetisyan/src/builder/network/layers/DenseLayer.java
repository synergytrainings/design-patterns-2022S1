package builder.network.layers;

import tools.Predictions;
import builder.network.activation.ActivationFunction;

public class DenseLayer extends BaseLayer {

	private DenseLayer(ActivationFunction activation, double bias, int nIn, int nOut) {
		super(activation, bias, nIn, nOut);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder extends BaseLayer.Builder<Builder> {

		private Builder() {
		}

		@Override
		public DenseLayer build() {
			Predictions.checkNotNull(activation);
			Predictions.checkIsPositive(this.nIn);
			Predictions.checkIsPositive(this.nOut);

			return new DenseLayer(this.activation, this.bias, this.nIn, this.nOut);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	@Override
	public String toString() {
		return "DenseLayer{" +
				"activation=" + activation +
				", bias=" + bias +
				", nIn=" + nIn +
				", nOut=" + nOut +
				'}';
	}
}
