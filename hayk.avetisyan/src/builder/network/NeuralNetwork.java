package builder.network;

import builder.network.layers.Layer;
import builder.network.layers.OutputLayer;

import java.util.ArrayList;
import java.util.List;

public class NeuralNetwork {
	private List<Layer> layers;

	private double learningRate;

	public NeuralNetwork(List<Layer> layers, double learningRate) {
		this.layers = layers;
		this.learningRate = learningRate;
	}

	@Override
	public String toString() {
		return "NeuralNetwork{" +
				"layers=" + layers +
				", learningRate=" + learningRate +
				'}';
	}

	public static class Builder {
		private double learningRate;

		public LayerBuilder layers() {
			return new LayerBuilder(learningRate);
		}

		public Builder learningRate(double learningRate) {
			this.learningRate = learningRate;
			return this;
		}
	}

	public static class LayerBuilder {

		private double learningRate;

		private List<Layer> layers;

		private LayerBuilder(double learningRate) {
			this.learningRate = learningRate;
			this.layers = new ArrayList<>();
		}

		public LayerBuilder layer(Layer layer) {
			this.layers.add(layer);
			return this;
		}
		public NeuralNetwork build() {
			int layerCount = layers.size();

			Predictions.checkIsPositive(learningRate);
			Predictions.checkGraterThan(layerCount, 1);
			Predictions.checkInstanceOf(layers.get(layerCount - 1), OutputLayer.class);

			return new NeuralNetwork(layers, learningRate);
		}

	}
}
