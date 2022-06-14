package builder.network.layers;

import builder.network.activation.Activation;
import builder.network.activation.ActivationFunction;

public abstract class BaseLayer implements Layer {

	protected ActivationFunction activation;
	protected double bias;
	protected int nIn;
	protected int nOut;

	public BaseLayer(ActivationFunction activation, double bias, int nIn, int nOut) {
		this.activation = activation;
		this.bias = bias;
		this.nIn = nIn;
		this.nOut = nOut;
	}

	protected abstract static class Builder<T extends Builder<T>> {

		protected ActivationFunction activation;
		protected double bias;
		protected int nIn;
		protected int nOut;

		protected Builder() {
		}

		public T activation(Activation activation) {
			this.activation = activation.function();
			return self();
		}

		public T bias(double bias) {
			this.bias = bias;
			return self();
		}

		public T nIn(int nIn) {
			this.nIn = nIn;
			return self();
		}

		public T nOut(int nOut) {
			this.nOut = nOut;
			return self();
		}

		public abstract BaseLayer build();

		protected abstract T self();
	}

	@Override
	public String toString() {
		return "BaseLayer{" +
				"activation=" + activation +
				", bias=" + bias +
				", nIn=" + nIn +
				", nOut=" + nOut +
				'}';
	}
}
